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
@Table (name = "korpa")
public class Korpa {
    
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_korpa")
    private Integer id_korpa;
    
    @Column(name = "username")
    private String username;
    
    @Column(name = "status")
    private String status;
    
    @ManyToOne
    @JoinColumn(name = "id_proizvod" , referencedColumnName = "id_proizvod")
    private Proizvodi id_proizvod;

    public Integer getId_korpa() {
        return id_korpa;
    }

    public void setId_korpa(Integer id_korpa) {
        this.id_korpa = id_korpa;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public Proizvodi getId_proizvod() {
        return id_proizvod;
    }

    public void setId_proizvod(Proizvodi id_proizvod) {
        this.id_proizvod = id_proizvod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Korpa{" + "id_korpa=" + id_korpa + ", username=" + username + ", status=" + status + ", id_proizvod=" + id_proizvod + '}';
    }

   
    
  


    
}
