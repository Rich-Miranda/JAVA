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
public class Pos_graduacao extends Faculdade {

    Random rd = new Random();
    protected int grMateria = 0;
    protected int p1 = 0, p2 = 0;
    protected double media = 0;
    protected int conLac = 0, conSens = 0;
    protected int conAP = 0, conEX = 0, conRP =0;

    public Pos_graduacao(String nome, int idade, int curso) {
        super(nome, idade, curso);
    }
    //=====================================================================================================================//

    public void Mostrar() {
        idade = rd.nextInt(18, 65);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso : " + curso);
        //GerarInstituicao();
        GerarMateria();
        Media();
    }
    //=====================================================================================================================//

    public void Media() {
        p1 = rd.nextInt(0, 10);
        System.out.println("Nota 1: " + p1);
        p2 = rd.nextInt(0, 10);
        System.out.println("Nota 2: " + p2);
        
        media = (p1 + p2 ) / 3;
        
        if(media >5 && media <10){
             System.out.println(" ");
            System.out.println("Aprovado");
            System.out.println("Media: " + media);
        }else if(media >3.5 && media <4){
            System.out.println(" ");
            System.out.println("Em exame");
             System.out.println("Media: " + media);
        }else{
             System.out.println(" ");
            System.out.println("Reprovado");
            
             System.out.println("Media: " + media);
        }
        System.out.println("Total de Aprovados: " + conAP);
        System.out.println("Total em Exame: " + conEX);
        System.out.println("Total de Reprovados: " + conRP);
    }
    
    

    //=====================================================================================================================//
    public void GerarInstituicao() {
             int sorte = (int) (Math.random() * 1000);

        for (int i = 0; i < 20; i++) {
            if (sorte % 2 == 0) {
                System.out.println("Instuição Lactu Sensu ");
                conLac++;
            } else {
                System.out.println("Instuição Strictu Sensu");
                conSens++;
            }
        }

        System.out.println("TOTAL DE ALUNOS QUE PERTENCER A LACTU SENSU: " + conLac);
        System.out.println("TOTAL DE ALUNOS QUE PERTENCER A STRICTU SENSU: " + conSens);

    }
    //=====================================================================================================================//

    public void GerarMateria() {
        System.out.println("Materias Academicas");
        curso = rd.nextInt(1, 3);

        switch (curso) {
            case 1:
                grMateria = rd.nextInt(1, 4);
                if (grMateria == 1) {
                    System.out.println(" Matematica Pertence a exatas");
                } else if (grMateria == 2) {
                    System.out.println(" Ciencia contabeis Pertence a exatas");
                } else {
                    System.out.println(" Economia Pertence a exatas");
                }
                break;

            case 2:
                grMateria = rd.nextInt(1, 4);
                if (grMateria == 1) {
                    System.out.println(" Historia Pertence a humanas");
                } else if (grMateria == 2) {
                    System.out.println(" Geografia Pertence a humanas");
                } else {
                    System.out.println(" Português Pertence a humanas");
                }
                break;

        }

    }
    //=====================================================================================================================//

    @Override
    public void GerarNota() {
        Media();
    }

}
