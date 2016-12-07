/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.service.impl;

import com.it355.DAO.ListaDAO;
import com.it355.model.ListaProizvoda;
import com.it355.service.ListaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Korisnik
 */
public class ListaServiceImpl implements ListaService{
    
    @Autowired
    ListaDAO lDao;

    @Override
    public List<ListaProizvoda> getAllProizvodi() {

            return lDao.getAllProizvod();
    }
    
    
    
    
}
