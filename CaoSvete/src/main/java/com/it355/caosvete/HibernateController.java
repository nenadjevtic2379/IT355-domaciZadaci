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
import com.it355.hibernate.entity.ProizvodiTip;
import com.it355.hibernate.DAO.HibernateDAO;
import com.it355.hibernate.entity.Proizvodi;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;


@Controller
public class HibernateController {
    
         @Autowired
   HibernateDAO hibernateDAO;
 
    
         @RequestMapping(value = "/sviTipoviHib", method = RequestMethod.GET)
    public ModelAndView getProducts(ModelAndView model) {
        model.addObject("tipoviLista", hibernateDAO.getCategories());
        model.addObject("tip", new ProizvodiTip());
        model.setViewName("svitipovi");
        return model;
    }
        
        @RequestMapping(value = "/obrisitip/{id}", method = RequestMethod.GET)
    public String deleteProduct(@PathVariable("id") int id, HttpServletRequest request) {
        System.out.println("Fetching & Deleting product with id " + id);
        ProizvodiTip produc = hibernateDAO.getCategoryById(id);
        if (produc == null) {
            System.out.println("Unable to delete. Product with id " + id + " not found");
            String referer = request.getHeader("Referer");
            return "redirect:" + referer;
        }

        hibernateDAO.deleteCategory(produc);
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;
 
}
    
    @RequestMapping(value="/proizvodi", method=RequestMethod.GET)
	public ModelAndView getAllProizvodi(ModelAndView model) {
		model.addObject("proizvodiLista" , hibernateDAO.getProizvodi());
                model.addObject("proizvodi", new Proizvodi());
                model.setViewName("sviproizvodi");
           
            return model;
	}
      
    @RequestMapping(value = "/obrisiproizvod/{id}", method = RequestMethod.GET)
    public String deleteProizvod(@PathVariable("id") int id, HttpServletRequest request) {
        System.out.println("Fetching & Deleting product with id " + id);
        Proizvodi produc = hibernateDAO.getProizvodById(id);
        if (produc == null) {
            System.out.println("Unable to delete. Product with id " + id + " not found");
            String referer = request.getHeader("Referer");
            return "redirect:" + referer;
        }

        hibernateDAO.obrisiProizvod(produc);
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;
 
}    
    
    @RequestMapping(value = "/editproizvod/{id}", method = RequestMethod.GET)
    public String addProduct(@PathVariable("id") int id, Model model) {
         Proizvodi produc = hibernateDAO.getProizvodById(id);
        model.addAttribute("proizvod",produc);
        model.addAttribute("tip", hibernateDAO.getCategories());
        
        return "dodajproizvod";
    }
        
    //getuje tip proizvoda
    @RequestMapping(value = "/addProizvod", method = RequestMethod.GET)
    public String addProduct(Model model) {
        model.addAttribute("proizvod", new Proizvodi());
        model.addAttribute("tip", hibernateDAO.getCategories());
        
        return "dodajproizvod";
    }
    
    @RequestMapping(value = "/addProizvod", method = RequestMethod.POST)
    public ModelAndView addProduct(@ModelAttribute("proizvod") Proizvodi p, ModelAndView model) {
        
        p = hibernateDAO.dodajProizvod(p);
        model.addObject("tip", hibernateDAO.getCategories());
        model.addObject("successMsg", "Proizvod uspešno dodat");
        model.addObject("proizvod",p);
        
        model.setViewName("dodajproizvod");
        return model;
    }


}
