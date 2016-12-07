/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.mapper;

import org.springframework.jdbc.core.RowMapper;
import com.it355.model.tipProizvoda;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Korisnik
 */
public class tipProizvodaMapper implements RowMapper<tipProizvoda>{

    @Override
	public tipProizvoda mapRow(ResultSet rs, int arg1) throws SQLException{
		
		tipProizvoda tp = new tipProizvoda();
		tp.setId(rs.getInt("id"));
		tp.setNaziv(rs.getString("naziv"));
		return tp;
	}
    
    
}
