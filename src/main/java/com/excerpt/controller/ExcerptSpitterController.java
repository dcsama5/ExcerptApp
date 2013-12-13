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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
