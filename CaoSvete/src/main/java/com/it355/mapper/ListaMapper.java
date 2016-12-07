/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.mapper;
import com.it355.model.ListaProizvoda;
import com.it355.model.Proizvod;
import com.it355.model.tipProizvoda;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Korisnik
 */
public class ListaMapper implements RowMapper<ListaProizvoda>{

    @Override
    public ListaProizvoda mapRow(ResultSet rs, int i) throws SQLException {
          
        ListaProizvoda lp = new ListaProizvoda();
        
        lp.setId(rs.getInt("id"));
        lp.setTIP(rs.getString("naziv"));
        lp.setVrsta(rs.getString("vrsta"));
        lp.setZaauto(rs.getString("zaauto"));
        lp.setCena(rs.getInt("cena"));
        lp.setProizvodnja(rs.getInt("proizvodnja"));
        
        return lp;
    }
    
    
    
}
