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
    	Raposa raposa1 = new Raposa("Raposa", 9, "Laranja");
    	Raposa raposa2 = new Raposa("Raposa ", 12 , "Preto");

		System.out.println("Animal Selecionado: \n");

		System.out.println("1. Animal: " + raposa1.getNome() + "\n Idade:" + raposa1.getIdade() + "\n COR: " + raposa1.getCor());

		System.out.println("\n2.Animal: " + raposa2.getNome() + "\n Idade:" + raposa2.getIdade() + "\n COR: " + raposa2.getCor());

		
		
		System.out.println("\n - FUNÇÃO DO ANIMAL - " + raposa1.getNome() + ":");
		raposa1.comendo();
		System.out.println("HABITATT: ");
		raposa1.habitat();
		
		
		System.out.println("\n 2 - FUNÇÃO DO ANIMAL - " + raposa2.getNome() + ":");
		
		raposa2.nadar();
		System.out.println("HABITATT: ");
		raposa2.habitat1();
    }
    
    
        
    }
