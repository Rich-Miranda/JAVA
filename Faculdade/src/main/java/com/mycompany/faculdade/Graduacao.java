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
public class Graduacao extends Faculdade {

    Random rd = new Random();

    public Graduacao(String nome, int idade, int curso) {
        super(nome, idade, curso);
    }

    public void Media() {
    }

    @Override
    public void GerarNota() {

    }

    @Override
    public void GerarInstituicao() {

    }

    @Override
    public void GerarMateria() {

    }

    public void Mostrar() {
        idade = rd.nextInt(18, 65);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso : " + curso);

    }

}
