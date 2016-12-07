/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.mapper;

import org.springframework.jdbc.core.RowMapper;
import com.it355.model.Proizvod;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Korisnik
 */
public class ProizvodMapper implements RowMapper<Proizvod>{

    @Override
    public Proizvod mapRow(ResultSet rs, int i) throws SQLException {
        
        
        Proizvod p = new Proizvod();
        p.setId_proizvod(rs.getInt("id_proizvod"));
        p.setId_tip(rs.getInt("id_tip"));
        p.setCena(rs.getInt("cena"));
        p.setVrsta(rs.getString("vrsta"));
        p.setZaauto(rs.getString("zaauto"));
        p.setProizvodnja(rs.getInt("proizvodnja"));
        
        return p;

    }
    
    
    
}
