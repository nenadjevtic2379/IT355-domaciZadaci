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
public class AutoDeo {
    
    private String naziv;
    private String zaAuto;
    private String zaModel;
    private String cena;

    public AutoDeo() {
    }

    public AutoDeo(String naziv, String zaAuto, String zaModel, String cena) {
        this.naziv = naziv;
        this.zaAuto = zaAuto;
        this.zaModel = zaModel;
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getZaAuto() {
        return zaAuto;
    }

    public void setZaAuto(String zaAuto) {
        this.zaAuto = zaAuto;
    }

    public String getZaModel() {
        return zaModel;
    }

    public void setZaModel(String zaModel) {
        this.zaModel = zaModel;
    }

    public String getCena() {
        return cena;
    }

    public void setCena(String cena) {
        this.cena = cena;
    }
    
    
    
}

