package com.excerpt.controller;




import javax.validation.Valid;
import com.excerpt.main.Excerpt;
import com.excerpt.main.ExcerptSpitterDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping("/form")
public class HomeController  {
    
    @Autowired
   private ExcerptSpitterDAO hibernateExcerptSpitter;
    
    public HomeController()
       {
        }

@RequestMapping(method=RequestMethod.GET)
public void returnFormPage(Model model)
{
    model.addAttribute(new Excerpt());
    
}
   
@RequestMapping(method=RequestMethod.POST)
public String addExcerpt(@Valid Excerpt excerpt, BindingResult bindingResult, Model model)
{
    
    System.out.println("HIIIII");
    if(bindingResult.hasErrors())
    {
        System.out.println("UHOH POOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
    }
    excerpt.setDate();
    hibernateExcerptSpitter.addExcerpt(excerpt);
    model.addAttribute("AMEER", hibernateExcerptSpitter.retrieveAll());
    
        return "page1";
    }
}
