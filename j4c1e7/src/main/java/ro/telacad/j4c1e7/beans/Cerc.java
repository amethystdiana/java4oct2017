/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.j4c1e7.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author student
 */
@Component
public class Cerc {
    
    
    private Punct centru;
    
    private int raza;
    
    @Autowired
    public Cerc(Punct centru) {
        this.centru = centru;
    }

    public Punct getCentru() {
        return centru;
    }

    
    public void setCentru(Punct centru) {
        this.centru = centru;
    }

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }
    
    
}
