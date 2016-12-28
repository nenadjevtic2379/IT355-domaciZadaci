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
@Table(name = "forum")
public class Forum {
    
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "username")
    private String username;
    
    @Column(name = "komentar")
    private String komentar;
    
    @Column(name = "odg")
    private String odg;

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

    public String getKomentar() {
        return komentar;
    }

    public void setKomentar(String komentar) {
        this.komentar = komentar;
    }

    public String getOdg() {
        return odg;
    }

    public void setOdg(String odg) {
        this.odg = odg;
    }

    @Override
    public String toString() {
        return "Forum{" + "id=" + id + ", username=" + username + ", komentar=" + komentar + ", odg=" + odg + '}';
    }

    
   
    
}
