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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Korisnik
 */
    
@Entity
@Table(name = "odgovori")
public class Odgovori {
    
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_odgovor")
    private Integer id_odgovor;
    
    @Column(name = "username")
    private String username;
    
    @Column(name = "odg")
    private String odg;
    
    @ManyToOne
    @JoinColumn(name = "id" , referencedColumnName = "id")
    private Forum id;

    public Integer getId_odgovor() {
        return id_odgovor;
    }

    public void setId_odgovor(Integer id_odgovor) {
        this.id_odgovor = id_odgovor;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOdg() {
        return odg;
    }

    public void setOdg(String odg) {
        this.odg = odg;
    }

   

    public Forum getId() {
        return id;
    }

    public void setId(Forum id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Odgovori{" + "id_odgovor=" + id_odgovor + ", username=" + username + ", odg=" + odg + ", id=" + id + '}';
    }

    

    

   

    
    
    
    
}
