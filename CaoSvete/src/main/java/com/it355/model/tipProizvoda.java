/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.model;




/**
 *
 * @author Korisnik
 */
import java.io.Serializable;

@SuppressWarnings("serial")
public class tipProizvoda implements Serializable {

	private Integer id;
	private String naziv;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	@Override
	public String toString() {
		return "Predmet [id=" + id + ", naziv=" + naziv + ", studenti=" + "]";
	}

}