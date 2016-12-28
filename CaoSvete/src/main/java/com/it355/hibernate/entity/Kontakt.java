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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Korisnik
 */
@Entity
@Table(name = "kontakt")
public class Kontakt {
    
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "ime")
    private String ime;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "telefon")
    private String telefon;
    
    @Column(name = "poruka")
    private String poruka;

    public Integer getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getPoruka() {
        return poruka;
    }

    public void setPoruka(String poruka) {
        this.poruka = poruka;
    }

    @Override
    public String toString() {
        return "Kontakt{" + "id=" + id + ", ime=" + ime + ", email=" + email + ", telefon=" + telefon + ", poruka=" + poruka + '}';
    }

   
    

}
