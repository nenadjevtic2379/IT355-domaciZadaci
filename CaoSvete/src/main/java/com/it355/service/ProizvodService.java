/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.service;

import com.it355.model.Proizvod;
import java.util.List;

/**
 *
 * @author Korisnik
 */
public interface ProizvodService {
    
        public int getCount();

	public List<Proizvod> getAllProducts();

	public boolean addProizvod(Proizvod pr);
    
}
