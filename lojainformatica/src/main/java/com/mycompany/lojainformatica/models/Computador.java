/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojainformatica.models;

/**
 *
 * @author R I C H
 */
public class Computador {
   private String nome = "Richard Miranda";
   private  String marca;
  private   String hd;
    private String processador;
    
    public void Computador(){
        
    }
    
    

    public Computador(String marca, String hd, String processador) {
        this.marca = marca;
        this.hd = hd;
        this.processador = processador;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }
}
