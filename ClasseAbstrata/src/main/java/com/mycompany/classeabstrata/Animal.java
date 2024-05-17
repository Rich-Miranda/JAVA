/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classeabstrata;

/**
 *
 * @author richard.msbernardo
 */
public abstract class Animal implements Contrato {
    
        protected String nome;
        protected int idade;
        protected String habitat;

  public abstract void comer();
  
  public void correr(){System.out.println("cof cof cof ");}
  public void Dormir(){System.out.println("zzzzzzzzzzzzzz ");}      
        
   
    
    
}
        
    

