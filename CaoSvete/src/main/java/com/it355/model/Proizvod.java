/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.model;

import java.io.Serializable;

/**
 *
 * @author Korisnik
 */
@SuppressWarnings("serial")
public class Proizvod implements Serializable{
    
    private int id_proizvod;
    private int id_tip;
    private Integer cena;
    private String vrsta;
    private String zaauto;
    private Integer proizvodnja;

    public int getId_proizvod() {
        return id_proizvod;
    }

    public void setId_proizvod(int id_proizvod) {
        this.id_proizvod = id_proizvod;
    }

    public int getId_tip() {
        return id_tip;
    }

    public void setId_tip(int id_tip) {
        this.id_tip = id_tip;
    }

    public Integer getCena() {
        return cena;
    }

    public void setCena(Integer cena) {
        this.cena = cena;
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public String getZaauto() {
        return zaauto;
    }

    public void setZaauto(String zaauto) {
        this.zaauto = zaauto;
    }

    public Integer getProizvodnja() {
        return proizvodnja;
    }

    public void setProizvodnja(Integer proizvodnja) {
        this.proizvodnja = proizvodnja;
    }

    @Override
    public String toString() {
        return "Proizvod{" + "id_proizvod=" + id_proizvod + ", id_tip=" + id_tip + ", cena=" + cena + ", vrsta=" + vrsta + ", zaauto=" + zaauto + ", proizvodnja=" + proizvodnja + '}';
    }
    
    
    
}
