/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.converter.IntegerToCategory;

import com.it355.hibernate.DAO.HibernateDAO;
import com.it355.hibernate.entity.ProizvodiTip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 *
 * @author vasic
 */
@Component
final class IntegerToCategory implements Converter<String , ProizvodiTip> {

    @Autowired
    HibernateDAO hibernateDAO;

    @Override
    public ProizvodiTip convert(String  s) {
        if(s.isEmpty()){
            return null;
        }
        Integer valeu = Integer.valueOf(s);
        System.out.println("Konvertujem u kategoriju");
        ProizvodiTip cat = hibernateDAO.getCategoryById(valeu);
        return cat;
    }
}
