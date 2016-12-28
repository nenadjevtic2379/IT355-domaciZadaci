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
import com.it355.DAO.ListaDAO;
import com.it355.DAO.ProizvodDAO;
import com.it355.DAO.TipDAO;
import com.it355.model.ListaProizvoda;
import com.it355.model.Proizvod;
import com.it355.model.tipProizvoda;
import com.it355.service.ListaService;
import com.it355.service.ProizvodService;
import com.it355.service.TipProizvodaService;
import javax.security.auth.Subject;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ZdravoController {

    @Autowired
    TipDAO tipDao;

    @Autowired
    TipProizvodaService tipProizvodaService;

    @Autowired
    ProizvodService proizvodService;
    
    @Autowired
    ProizvodDAO proizvodDao;
    
    
     @Autowired
     ListaService listaService;
    
    @Autowired
    ListaDAO listaDao;
       
	/*@RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
    public ModelAndView defaultPage() {

        ModelAndView model = new ModelAndView();
     //   model.addObject("title", "Spring Security Login Form - Database Authentication");
    //    model.addObject("message", "This is default page!");
        model.setViewName("index");
        return model;

    }*/
 
    @RequestMapping(value = "/admin**", method = RequestMethod.GET)
    public ModelAndView adminPage() {

        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Login Form - Database Authentication");
        model.addObject("message", "This page is for ROLE_ADMIN only!");
        model.setViewName("admin");
        return model;

    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(@RequestParam(value = "error", required = false) String error,
            @RequestParam(value = "logout", required = false) String logout) {

        ModelAndView model = new ModelAndView();
        if (error != null) {
            model.addObject("error", "Invalid username and password!");
        }

        if (logout != null) {
            model.addObject("msg", "You've been logged out successfully.");
        }
        model.setViewName("login");
        
        return model;

    }

    //for 403 access denied page
    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public ModelAndView accesssDenied() {

        ModelAndView model = new ModelAndView();

        //check if user is login
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (!(auth instanceof AnonymousAuthenticationToken)) {
            UserDetails userDetail = (UserDetails) auth.getPrincipal();
            model.addObject("username", userDetail.getUsername());
        }

        model.setViewName("403");
        return model;

    }


   @RequestMapping(value = "/addtip", method = RequestMethod.GET)
	public String addTip(Model model) {
		model.addAttribute("tipProizvoda", new tipProizvoda());
		return "dodajtipproizvoda";
	}
	
	@RequestMapping(value= "/addtip", method = RequestMethod.POST)
	public ModelAndView addTip(@ModelAttribute("tipProizvoda") tipProizvoda p, ModelAndView model) {
	    	model.addObject("object", p);
                p.setId(tipDao.getCount() + 1);
                tipProizvodaService.addTip(p);
               
		return model;
                
	}
           
    /*    @RequestMapping(value="/tipovi", method=RequestMethod.GET)
	public ModelAndView tipovi(ModelAndView modelAndView) {
		List<tipProizvoda> subjects= tipDao.getAllTips();
                for (tipProizvoda subject : subjects) {
                    System.err.println(subject.toString());
        }
            modelAndView.addObject("tipoviLista", subjects);
		modelAndView.setViewName("svitipovi");
		
            return modelAndView;
	}  */
        
    /*   @RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addProizvod() {
            
                ModelAndView m = new ModelAndView();
                    
                List<tipProizvoda> subjects= tipDao.getAllTips();
                for (tipProizvoda subject : subjects) {
                    System.err.println(subject.toString());
        }
                
                m.setViewName("dodajproizvod");
                m.addObject("id_tip", subjects);
		m.addObject("proizvod", new Proizvod());
		return m;
	}
        
        @RequestMapping(value= "/add", method = {RequestMethod.POST})
	public ModelAndView addProizvod(@ModelAttribute("proizvod") Proizvod p, ModelAndView model) {
	    	tipProizvoda tp = new tipProizvoda();
                model.addObject("object", p);
                
                p.setId_proizvod(proizvodDao.getCount() + 1);
                proizvodService.addProizvod(p);
                model.setViewName("dodajproizvod");
               
		return model;
                
	}*/
        
     /*    @RequestMapping(value="/proizvodi", method=RequestMethod.GET)
	public ModelAndView getAllProizvodi(ModelAndView modelAndView) {
		List<ListaProizvoda> subjects= listaDao.getAllProizvod();
                for (ListaProizvoda subject : subjects) {
                    System.err.println(subject.toString());
        }
            modelAndView.addObject("proizvodiLista", subjects);
		modelAndView.setViewName("sviproizvodi");
		
            return modelAndView;
	}
        
    */
}