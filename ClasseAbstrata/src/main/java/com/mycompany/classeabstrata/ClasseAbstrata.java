/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.classeabstrata;

/**
 *
 * @author richard.msbernardo
 */
public class ClasseAbstrata {

    public static void main(String[] args) {
        Rato oR = new Rato();

        oR.nome = "Test";
        oR.idade = 1;
        oR.habitat = "Italia";
        oR.setEscama(false);
        oR.comer();
        oR.correr();
        oR.morrer();
        System.out.println("Nome do Rato : " + oR.nome);
        System.out.println("Idade do Rato : " + oR.idade);
        System.out.println("Habitat do Rato : " + oR.habitat);

        Elefante oE = new Elefante(); // chamado a classe elefante

        oE.nome = "TES1"; // <- Passsando nome da classe superPai Animal
        oE.idade = 12; // <- Passsando idade da classe superPai Animal
        oE.habitat = "Savana"; // <- Passsando habitat da classe superPai Animal
        System.out.println();
        System.out.println("Nome do elefante : " + oE.nome);
        System.out.println("Idade do elefante : " + oE.idade);
        System.out.println("Habitat do elefante : " + oE.habitat);
       // <- Chamando os print, passando os nomes, idade, habitat. 
        oE.comer(); // <- Recebendo o paramêntro da classe Animal, que vai receber paramêntros.  Transmitindo essa informações pro filhos
        oE.Dormir(); // <- Recebendo o paramêntro da classe Animal, que vai receber paramêntros. Transmitindo essa informações pro filhos 
        oE.morrer(); // <- Função que receber do interface 
    }
}
