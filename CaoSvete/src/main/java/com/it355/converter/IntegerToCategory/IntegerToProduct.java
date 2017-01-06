/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.converter.IntegerToCategory;

import com.it355.hibernate.DAO.HibernateDAO;
import com.it355.hibernate.entity.Proizvodi;
import org.springframework.core.convert.converter.Converter;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Korisnik
 */
public class IntegerToProduct implements Converter<String , Proizvodi>{
    
    @Autowired
    HibernateDAO hibDao;

    @Override
    public Proizvodi convert(String s) {
        if(s.isEmpty()) {
            return null;
        }
        
        Integer value = Integer.valueOf(s);
        System.out.println("Konvertujem u proizvod");
        Proizvodi f = hibDao.getProizvodById(value);
        
        return f;
    }
    
    
    
}
