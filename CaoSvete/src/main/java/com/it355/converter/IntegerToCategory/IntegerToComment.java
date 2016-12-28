/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.converter.IntegerToCategory;

import com.it355.hibernate.DAO.HibernateDAO;
import com.it355.hibernate.entity.Forum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

/**
 *
 * @author Korisnik
 */
public class IntegerToComment implements Converter<String, Forum>{
    
    @Autowired
    HibernateDAO hibDao;

    @Override
    public Forum convert(String s) {
        if(s.isEmpty()) {
            return null;
        }
        
        Integer value = Integer.valueOf(s);
        System.out.println("Konvertujem u komentar");
        Forum f = hibDao.getKomentarById(value);
        
        return f;
    }
    
    
    
}
