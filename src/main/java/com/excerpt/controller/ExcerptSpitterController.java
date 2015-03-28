/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.excerpt.controller;

import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import com.excerpt.main.Accessor;
import com.excerpt.main.Excerpt;
import com.excerpt.main.ExcerptSpitterDAO;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Administrator
 */
@Controller
public class ExcerptSpitterController {
    
    @Autowired
    private ExcerptSpitterDAO hibernateExcerptSpitter;
        
    @RequestMapping("/page1")
    public String showMessage(Model model, HttpServletRequest req)
    {
       
        Accessor ac = new Accessor();
        ac.setDate(new Date());
        ac.setIP(req.getRemoteAddr());
        ac.setLocalname(req.getRemoteHost());
        hibernateExcerptSpitter.addAccessor(ac);
        List<Excerpt> list = hibernateExcerptSpitter.retrieveAll();
        model.addAttribute("AMEER", list);
        return "page1";
            }

    @RequestMapping(value="/edit", method=RequestMethod.POST)
    public String postEdit(HttpServletRequest req, HttpServletResponse resp, Model model) {
        String updateString = req.getParameter("update");
        if(updateString==null || updateString == "")
        {
            model.addAttribute("errMsg", new IllegalArgumentException());
            return "edit";
        }
        try {
        Excerpt exc = hibernateExcerptSpitter.get(updateString);
        
       
        if(exc!=null) {
            exc.setAccount(req.getParameter("account"));
            exc.setComments(req.getParameter("comments"));
            exc.setShow(req.getParameter("show").equals("on") ? true : false);
            exc.setLink(req.getParameter("link"));
            exc.setDate();
            hibernateExcerptSpitter.updateExcerpt(exc);
            return showMessage(model, req);
        }
        else {
        model.addAttribute("errMsg", new NullPointerException());
        return "edit";
        }
       }
         catch(Exception e) {
         e.printStackTrace();
         model.addAttribute("errMsg", e);
         return "edit";
        }
    }
    
    @RequestMapping(value="/edit", method=RequestMethod.GET)
    public String directEdit() {
        return "edit";
    }
}
