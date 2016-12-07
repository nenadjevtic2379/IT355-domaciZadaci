/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.DAO;

import com.it355.model.tipProizvoda;
import java.util.List;


public interface TipDAO {

	public int getCount();

	public List<tipProizvoda> getAllTips();

	public boolean addTip(tipProizvoda tip);
	
	//public List<tipProizvoda> getSubjectsByStudent(int studentId);
}
