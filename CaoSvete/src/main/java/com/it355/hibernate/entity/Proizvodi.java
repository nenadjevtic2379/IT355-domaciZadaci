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
@Table(name = "proizvod")
public class Proizvodi {
    
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proizvod")
    private Integer id_proizvod;
    
    @Column(name = "cena")
    private Integer cena;
    
    @Column(name = "proizvodnja")
    private Integer proizvodnja;
    
    @Column(name = "zaauto")
    private String zaauto;
    
    @Column(name = "vrsta")
    private String vrsta;
    
    @ManyToOne
    @JoinColumn(name = "id_tip" , referencedColumnName = "id")
    private ProizvodiTip tip;

    public Integer getId_proizvod() {
        return id_proizvod;
    }

    public void setId_proizvod(Integer id_proizvod) {
        this.id_proizvod = id_proizvod;
    }

    public Integer getCena() {
        return cena;
    }

    public void setCena(Integer cena) {
        this.cena = cena;
    }

    public Integer getProizvodnja() {
        return proizvodnja;
    }

    public void setProizvodnja(Integer proizvodnja) {
        this.proizvodnja = proizvodnja;
    }

    public String getZaauto() {
        return zaauto;
    }

    public void setZaauto(String zaauto) {
        this.zaauto = zaauto;
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public ProizvodiTip getTip() {
        return tip;
    }

    public void setTip(ProizvodiTip tip) {
        this.tip = tip;
    }

    @Override
    public String toString() {
        return "Proizvodi{" + "id_proizvod=" + id_proizvod + ", cena=" + cena + ", proizvodnja=" + proizvodnja + ", zaauto=" + zaauto + ", vrsta=" + vrsta + ", tip=" + tip + '}';
    }
    
   
 

        

}
