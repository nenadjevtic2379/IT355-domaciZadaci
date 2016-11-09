/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.logging;

/**
 *
 * @author Korisnik
 */
public class LoggingImpl implements Logging{

    @Override
    public void logg() {
        System.out.println("Logujem se na sistem");
    }

    @Override
    public void logout() {
        System.out.println("Odjavljujem se sa sistema");
    }
    
    
    
}
