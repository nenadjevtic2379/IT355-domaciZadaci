/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.caosvete;

/**
 *
 * @author Korisnik
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/")
public class ZdravoController {

    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("poruka", "IT355 Domaći1");
        return "pozdrav";
    }
<<<<<<< HEAD
    
   
=======
<<<<<<< HEAD
    
   
=======
>>>>>>> 11c17586399d54c7dd17c5b8faa61bffc94dc2a0
>>>>>>> 68967bb36f2a94922f769a4c93fdfd1c5801fa37
}
