
package com.mycompany.richardmirandaado1;



public class Rinoceronte {


 
	private String nome;
	private int idade;

	private String habitat;
	private String cor ;

// Construtor vazio
	public Rinoceronte(String rinoceronte, int par, String cinza) {
	}

//  parâmetros para definir propriedades
	public Rinoceronte(String nome, int idade, String habitat,String cor) {
		this.nome = nome;
		this.idade = idade;
		this.habitat = habitat;
		this.cor = cor;
	}

//Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

// Método referente ao Rinoceronte 
	public void nadar() {
		System.out.println(nome + " está nadando no mar."); 
	}

	public void comendo() {
		System.out.println( nome + " está comendo.");
	}

	public void habitat() {
		System.out.println(nome +" == Savana (Africa)");
	}
	public void habitat1() {
		System.out.println(nome +"== Pantanos (Asia)");
	}

    }

  

    

