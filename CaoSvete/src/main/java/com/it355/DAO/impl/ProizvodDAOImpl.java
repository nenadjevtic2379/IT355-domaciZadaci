/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.DAO.impl;

import com.it355.DAO.ProizvodDAO;
import com.it355.mapper.ProizvodMapper;
import com.it355.model.Proizvod;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Korisnik
 */
public class ProizvodDAOImpl implements ProizvodDAO{
    
    private JdbcTemplate jdbcTemplate;
	@SuppressWarnings("unused")
	private DataSource dataSource;

	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

    @Override
    public int getCount() {
            String sql = "SELECT COUNT(*) FROM proizvod ";
		int count = jdbcTemplate.queryForObject(sql, Integer.class);
		return count;
    }

    @Override
    public List<Proizvod> getAllProducts() {
            String sql= "SELECT * FROM proizvod";
		List<Proizvod> subjects= jdbcTemplate.query(sql, new ProizvodMapper());
		return subjects;
    }

    @Override
    public boolean addProizvod(Proizvod pr) {
            String sql = "INSERT INTO proizvod" +
				"(id_tip,cena,vrsta,zaauto,proizvodnja) VALUES (?,?,?,?,?)";
		jdbcTemplate.update(sql, new Object[] {pr.getId_tip(),pr.getCena(),pr.getVrsta(),
                pr.getZaauto(),pr.getProizvodnja()});
		return true;

    }
        
        
        
    
}
