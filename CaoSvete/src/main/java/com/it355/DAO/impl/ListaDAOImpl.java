/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.DAO.impl;

import com.it355.DAO.ListaDAO;
import com.it355.mapper.ListaMapper;
import com.it355.mapper.ProizvodMapper;
import com.it355.model.ListaProizvoda;
import com.it355.model.Proizvod;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Korisnik
 */
public class ListaDAOImpl implements ListaDAO{
    
    private JdbcTemplate jdbcTemplate;
	@SuppressWarnings("unused")
	private DataSource dataSource;

	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

    @Override
    public List<ListaProizvoda> getAllProizvod() {

        String sql= "SELECT proizvod.id_proizvod as id,proizvod_tip.naziv, proizvod.vrsta, proizvod.zaauto, proizvod.cena,proizvod.proizvodnja "
                + "FROM proizvod JOIN proizvod_tip ON proizvod.id_tip=proizvod_tip.id";
		List<ListaProizvoda> subjects= jdbcTemplate.query(sql, new ListaMapper());
		return subjects;
    }

    
        
    
    
}
