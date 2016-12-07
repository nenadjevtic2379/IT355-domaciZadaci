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
public class ListaProizvoda implements Serializable {
    
    private int id;
    private String naziv;
    private String vrsta;
    private String zaauto;
    private int cena;
    private int proizvodnja;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    
    
    public String getTIP() {
        return naziv;
    }

    public void setTIP(String TIP) {
        this.naziv = TIP;
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

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getProizvodnja() {
        return proizvodnja;
    }

    public void setProizvodnja(int proizvodnja) {
        this.proizvodnja = proizvodnja;
    }

    @Override
    public String toString() {
        return "ListaProizvoda{" + "TIP=" + naziv + ", vrsta=" + vrsta + ", zaauto=" + zaauto + ", cena=" + cena + ", proizvodnja=" + proizvodnja + '}';
    }
          
    
    
    
}
