/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.hibernate.DAO;

import com.it355.hibernate.entity.Forum;
import com.it355.hibernate.entity.Kontakt;
import com.it355.hibernate.entity.Korpa;
import com.it355.hibernate.entity.Odgovori;
import com.it355.hibernate.entity.Proizvodi;
import com.it355.hibernate.entity.ProizvodiTip;
import com.it355.hibernate.entity.User;

import java.util.List;

/**
 *
 * @author Korisnik
 */
public interface HibernateDAO {
    
    public List<ProizvodiTip> getCategories();
    public ProizvodiTip getCategoryById(int id);
    public void deleteCategory(ProizvodiTip category);
    public ProizvodiTip addTip(ProizvodiTip pt);
    
    public List<Proizvodi> getProizvodi();
    public Proizvodi getProizvodById(int id);
    public void obrisiProizvod(Proizvodi category);
    public Proizvodi dodajProizvod(Proizvodi p);
    public void editProizvod(Proizvodi proizvodi);
    public void naruciProizvod(Proizvodi p);
    
    public Kontakt dodajKontakt(Kontakt k);
    public List<Kontakt> getPoruke();
    
    public Forum dodajKomentar(Forum f);
    public List<Forum> getKomentari();
    public Forum getKomentarById(Integer id);
    public void odgovoriNaKomentar(Forum forum);
    public void obrisiKomentar(Forum f);
    
    public Odgovori addOdgovor(Odgovori o);
    public List<Odgovori> getOdgovori();
    
    public Korpa dodajUKorpu(Korpa k);
    public List<Korpa> getMojaKorpa();
    public void obrisiIzKorpe(Korpa k);
    public Korpa getById(int id);
    public void editKorpa(Korpa k);
    
    public User addUser(User u);
    public List<User> getUser();
   
   
}
