/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.richardmirandaado1;

/**
 *
 * @author rebon
 */
public class RichardMirandaADO1 {
    
    
    public static void main(String[] args) {
   	Rinoceronte rino1 = new Rinoceronte("Rinoceronte", 18, "Cinza", null);
		Rinoceronte rino2 = new Rinoceronte("Rinoceronte ", 25 , "Preto", null);

		System.out.println("Animal Selecionado: \n");

		System.out.println("1. Animal: " + rino1.getNome() + "\n Idade:" + rino1.getIdade() + "\n COR: " + rino1.getCor());

		System.out.println("\n2.Animal: " + rino2.getNome() + "\n Idade:" + rino2.getIdade() + "\n COR: " + rino1.getCor());

		System.out.println("\n1- FUNÇÃO DO ANIMAL - " + rino1.getNome() + ":");
		rino1.nadar();
		System.out.println("HABITATT: ");
		rino1.habitat();
		
		System.out.println("\n2 - FUNÇÃO DO ANIMAL- " + rino2.getNome() + ":");
		rino2.comendo();
		System.out.println("HABITATT: ");
		rino2.habitat1();
    }
    
    
        
    }

