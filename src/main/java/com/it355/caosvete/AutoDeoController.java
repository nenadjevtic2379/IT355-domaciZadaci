/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.caosvete;

import com.it355.model.AutoDeo;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Korisnik
 */
@Controller
public class AutoDeoController {
    
    
    @Autowired
    private MessageSource ms;
     @RequestMapping(value = "/deo" , method  // /deo-> prikaz na browser-u
            = RequestMethod.GET)
    public String autodeo(ModelMap map) {
        
        
         System.out.println("MessageSource");
        ms.getMessage("name", null, Locale.ENGLISH);
        map.addAttribute("autodeo", new AutoDeo());
        
        
       
        return "autodeo"; //jsp fajl
    }
    
    @RequestMapping(value = "/addDeo", method
            = RequestMethod.POST)
    public String addDeo(@ModelAttribute AutoDeo deo,
            ModelMap model) {
        model.addAttribute("naziv", deo.getNaziv());
        model.addAttribute("zaAuto", deo.getZaAuto());
        model.addAttribute("zaModel", deo.getZaModel());
         model.addAttribute("cena", deo.getCena());
        return "prikaz"; //jsp fajl
    }

    
}
