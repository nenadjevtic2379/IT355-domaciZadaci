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
import com.it355.hibernate.entity.Forum;
import com.it355.hibernate.entity.Kontakt;
import com.it355.hibernate.entity.Korpa;
import com.it355.hibernate.entity.Odgovori;
import com.it355.hibernate.entity.Proizvodi;
import com.it355.hibernate.entity.User;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestWrapper;
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


    @RequestMapping(value = {"/","/welcome"}, method = RequestMethod.GET)
    public String addKontakt(Model model) {
        model.addAttribute("kontakt", new Kontakt());
        
        
        return "index";
    }
    
    @RequestMapping(value = {"/","/welcome"}, method = RequestMethod.POST)
    public ModelAndView addKontakt(@ModelAttribute("kontakt") Kontakt p, ModelAndView model) {
        
        p = hibernateDAO.dodajKontakt(p);
     //   model.addObject("tip", hibernateDAO.getCategories());
     //   model.addObject("successMsg", "Proizvod uspešno dodat");
        model.addObject("kontakt",p);
        
        model.setViewName("index");
        return model;
    }
    
  
    @RequestMapping(value = "/forum", method = RequestMethod.GET)
    public String addComment(Model model) {
        
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (!(auth instanceof AnonymousAuthenticationToken)) {
            UserDetails userDetail = (UserDetails) auth.getPrincipal();
            model.addAttribute("username", userDetail.getUsername());
            
     
           
        }
        model.addAttribute("komentariLista", hibernateDAO.getKomentari());
        model.addAttribute("odgovoriLista", hibernateDAO.getOdgovori());
        model.addAttribute("kom" , new Odgovori());
        model.addAttribute("forum" , new Forum());
       
        
        return "forum";
    }
    
    @RequestMapping(value = "/forum", method = RequestMethod.POST)
    public ModelAndView addComment(@ModelAttribute("forum") Forum p, ModelAndView model) {
        
        p = hibernateDAO.dodajKomentar(p);
 
        model.addObject("forum",p);
        model.setViewName("forum");
        return model;
    }
    
    @RequestMapping(value = "/odgovoriNaKomentar/{id}", method = RequestMethod.GET)
    public String addReply(@PathVariable("id") int id, Model model) {
         Forum produc = hibernateDAO.getKomentarById(id);
         Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (!(auth instanceof AnonymousAuthenticationToken)) {
            UserDetails userDetail = (UserDetails) auth.getPrincipal();
            model.addAttribute("username", userDetail.getUsername());
            
        }
      
        
        model.addAttribute("forum",produc);
      //  model.addAttribute("tip", hibernateDAO.getCategories());
        
        return "odgovori";
    }
    
    @RequestMapping(value = "/odgovoriNaKomentar/{id}", method = RequestMethod.POST)
     public ModelAndView addReply(@ModelAttribute("forum") Odgovori p, ModelAndView model) {
         
         p = hibernateDAO.addOdgovor(p);
         
       
      
         model.addObject("forum" , p);
        
       model.setViewName("odgovori");
        return model;
    }
     
     
     @RequestMapping(value = "/naruciProizvod/{id}", method = RequestMethod.GET)
    public String naruciProizvod(@PathVariable("id") int id, Model model) {
         Proizvodi produc = hibernateDAO.getProizvodById(id);
         
         Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (!(auth instanceof AnonymousAuthenticationToken)) {
            UserDetails userDetail = (UserDetails) auth.getPrincipal();
            model.addAttribute("username", userDetail.getUsername());
           
        }
        model.addAttribute("korpa",produc);
        
        
        return "naruciProizvod";
    }
    
     @RequestMapping(value = "/naruciProizvod/{id}", method = RequestMethod.POST)
     public ModelAndView naruciProizvod(@ModelAttribute("korpa") Korpa p, ModelAndView model) {
         
         p = hibernateDAO.dodajUKorpu(p);
         
         model.addObject("korpa" , p);
        
       model.setViewName("naruciProizvod");
        return model;
    }
     
     
     @RequestMapping(value = "/mojakorpa", method = RequestMethod.GET)
    public String mojaKorpa(Model model, Authentication aut) {
        
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (!(auth instanceof AnonymousAuthenticationToken)) {
            UserDetails userDetail = (UserDetails) auth.getPrincipal();
            model.addAttribute("username", userDetail.getUsername());
        }
       
        model.addAttribute("mojaKorpa", hibernateDAO.getMojaKorpa());
      // model.addAttribute("role" , aut.getAuthorities()); getRole ulogovanog korisnika
      
        model.addAttribute("kor" , new Korpa());
        
      
        return "mojaKorpa";
    }
    
    
     @RequestMapping(value = "/obrisiIzKorpe/{id}", method = RequestMethod.GET)
    public String obrisiIzKorpe(@PathVariable("id") int id, HttpServletRequest request) {
        System.out.println("Fetching & Deleting product with id " + id);
        Korpa produc = hibernateDAO.getById(id);
        if (produc == null) {
            System.out.println("Unable to delete. Product with id " + id + " not found");
            String referer = request.getHeader("Referer");
            return "redirect:" + referer;
        }

        hibernateDAO.obrisiIzKorpe(produc);
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;
 
}    
      @RequestMapping(value = "/allnarudzbine", method = RequestMethod.GET)
    public String narudzbine(Model model) {
        
       
        model.addAttribute("narudzbine", hibernateDAO.getMojaKorpa());
       
        model.addAttribute("nar" , new Korpa());
        
      
        
        return "sveNarudzbine";
    }
    
    @RequestMapping(value = "/editKorpa/{id}", method = RequestMethod.GET)
    public String editKorpa(@PathVariable("id") int id, Model model) {
         Korpa produc = hibernateDAO.getById(id);
         
        model.addAttribute("id_proizvod" , hibernateDAO.getProizvodi());
        model.addAttribute("editNarudzbina",produc);
       
        
        return "editKorpa";
    }
    
    @RequestMapping(value = "/editKorpa/{id}", method = RequestMethod.POST)
     public ModelAndView editKorpa(@ModelAttribute("editNarudzbina") Korpa p, ModelAndView model) {
         
         p = hibernateDAO.dodajUKorpu(p);
         
         model.addObject("editNarudzbina" , p);
        
       model.setViewName("editKorpa");
        return model;
    }

     
     @RequestMapping(value = {"/reg",}, method = RequestMethod.GET)
    public String reg(Model model, Authentication authentication) {
      
      
        model.addAttribute("regi", new User());
        
        
        return "register";
    }
     
    @RequestMapping(value = "/reg", method = RequestMethod.POST)
     public ModelAndView reg(@ModelAttribute("regi") User p, ModelAndView model) {
         
      try {
         
         p = hibernateDAO.addUser(p);
         model.addObject("successMsg", "Uspešno ste se registrovali! Prijavite se za nastavak");
      }
      
      catch (RuntimeException r){
          r.printStackTrace();
          model.addObject("successMsg", "Username je zauzet!");
      }
       
         
         model.addObject("regi" , p);
         
       model.setViewName("register");
        return model;
    }
     
     
     
}
