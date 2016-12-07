/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.service.impl;

import com.it355.DAO.ProizvodDAO;
import com.it355.model.Proizvod;
import com.it355.service.ProizvodService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Korisnik
 */
public class ProizvodServiceImpl implements ProizvodService{
    
    @Autowired
    ProizvodDAO prDAO;

    @Override
    public int getCount() {
        return prDAO.getCount();
    }

    @Override
    public List<Proizvod> getAllProducts() {
            return prDAO.getAllProducts();
    }

    @Override
    public boolean addProizvod(Proizvod pr) {
            return prDAO.addProizvod(pr);
    }
    
    
    
    
}
