/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.hibernate.DAO;

import com.it355.hibernate.entity.Proizvodi;
import com.it355.hibernate.entity.ProizvodiTip;
import java.util.List;

/**
 *
 * @author Korisnik
 */
public interface HibernateDAO {
    
    public List<ProizvodiTip> getCategories();
    public ProizvodiTip getCategoryById(int id);
    public void deleteCategory(ProizvodiTip category);
    
    public List<Proizvodi> getProizvodi();
    public Proizvodi getProizvodById(int id);
    public void obrisiProizvod(Proizvodi category);
    public Proizvodi dodajProizvod(Proizvodi p);
    public void editProizvod(Proizvodi proizvodi);
}
