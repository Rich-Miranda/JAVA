/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classeabstrata;

/**
 *
 * @author richard.msbernardo
 */
public class Rato extends Animal {
        private boolean escama;

    public boolean isEscama() {
        return escama;
    }

    public void setEscama(boolean escama) {
        this.escama = escama;
    }
    
    public void comer(){
        System.out.println("Comendo ");
    }
    
    public void dormir(){
        System.out.println("Não esta dormindo");
    }
    
    public void morrer(){
        System.out.println("Ele está figindo de morto");
    }
  
        
        
        
}
