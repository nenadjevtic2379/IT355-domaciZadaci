/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.DAO.impl;

import com.it355.DAO.TipDAO;
import com.it355.model.tipProizvoda;
import java.util.List;
import javax.sql.DataSource;
import com.it355.mapper.tipProizvodaMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Korisnik
 */
public class TipDAOImpl implements TipDAO {

    private JdbcTemplate jdbcTemplate;
	@SuppressWarnings("unused")
	private DataSource dataSource;

	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Transactional
	public int getCount() {
		String sql = "SELECT COUNT(*) FROM proizvod_tip ";
		int count = jdbcTemplate.queryForObject(sql, Integer.class);
		return count;
	}

	@Override
	@Transactional
	public List<tipProizvoda> getAllTips() {
		String sql= "SELECT * FROM proizvod_tip";
		List<tipProizvoda> subjects= jdbcTemplate.query(sql, new tipProizvodaMapper());
		return subjects;
	}

	@Override
	@Transactional
	public boolean addTip(tipProizvoda subject) {
		String sql = "INSERT INTO proizvod_tip" +
				"(NAZIV) VALUES (?)";
		jdbcTemplate.update(sql, new Object[] {subject.getNaziv()});
		return true;
	}

	/*
        @Override
	public List<Subject> getSubjectsByStudent(int studentId) {
		String sql= "SELECT SUBJECTS.ID, SUBJECTS.NAZIV FROM STUDENT_SUBJECT  "+
				"JOIN SUBJECTS ON STUDENT_SUBJECT.PREDMET_ID=SUBJECTS.ID "+
				"WHERE STUDENT_ID="+studentId;
		List<Subject> subjects= jdbcTemplate.query(sql, new SubjectMapper());
		return subjects;
	}
        */
}

