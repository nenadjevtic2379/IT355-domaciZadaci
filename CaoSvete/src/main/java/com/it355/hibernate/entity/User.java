/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Korisnik
 */
@Entity
@Table(name = "users")
public class User {


	@Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
        
        @Column(name = "username",
		nullable = false, length = 60)
	private String username;
        

	@Column(name = "password",
		nullable = false, length = 60)
	private String password;
        
        @Column(name = "adresa",
		nullable = false, length = 60)
	private String adresa;
        
        @Column(name = "telefon",
		nullable = false, length = 60)
	private String telefon;
        
        @Column(name = "ime",
		nullable = false, length = 60)
	private String ime;
        
        @Column(name = "prezime",
		nullable = false, length = 60)
	private String prezime;

	@Column(name = "enabled", nullable = false)
	private boolean enabled;

	

	@Column(name = "role",
		nullable = false, length = 50)
	private String role;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", username=" + username + ", password=" + password + ", adresa=" + adresa + ", telefon=" + telefon + ", ime=" + ime + ", prezime=" + prezime + ", enabled=" + enabled + ", role=" + role + '}';
    }


    
}
