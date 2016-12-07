/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.DAO;

import com.it355.model.tipProizvoda;
import java.util.List;
import com.it355.model.Proizvod;
/**
 *
 * @author Korisnik
 */
public interface ProizvodDAO {
    
        public int getCount();

	public List<Proizvod> getAllProducts();

	public boolean addProizvod(Proizvod pr);
    
}
