/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculdade;

import java.util.Random;

/**
 *
 * @author richard.bernardo
 */
public abstract class Faculdade {

    protected String nome;
    protected int idade;
    protected int curso;
    

    public Faculdade(String nome, int idade, int curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    public abstract void Mostrar();

    public abstract void GerarNota();

    public abstract void GerarInstituicao();

    public abstract void GerarMateria();
    
   
    
}
