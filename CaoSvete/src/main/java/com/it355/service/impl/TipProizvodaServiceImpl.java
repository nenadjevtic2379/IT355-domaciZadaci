/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.service.impl;
import com.it355.DAO.TipDAO;
import com.it355.model.tipProizvoda;
import com.it355.service.TipProizvodaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Korisnik
 */
public class TipProizvodaServiceImpl implements TipProizvodaService{
    
   @Autowired
	       TipDAO subjectDao;
	
	@Override
	public int getCount() {
		return subjectDao.getCount(); 
	}

	@Override
	public List<tipProizvoda> getAllTips() {
		return subjectDao.getAllTips();
	}

	@Override
	public boolean addTip(tipProizvoda subject) {
		return subjectDao.addTip(subject);
	}
/*
	@Override
	public List<tipProizvoda> getSubjectsByStudent(int studentId) {
		return subjectDao.getSubjectsByStudent(studentId);
	}

    */
}
