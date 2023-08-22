
package com.mycompany.richardmirandaado1;



public class Raposa {


 
	private String nome;
	private int idade;
	private String cor;
	private String habitat;
	

// Construtor vazio
	public Raposa() {
	}

//  parâmetros de  propriedades da Raposa
	public Raposa(String nome, int idade,String cor) {
		this.nome = nome;
		this.idade = idade;
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



// Método referente ao Raposa 
	public void nadar() {
		System.out.println(nome + " está nadando no mar."); 
	}

	public void comendo() {
		System.out.println( nome + " está comendo.");
	}

	public void habitat() {
		System.out.println(nome +" == Pantanal ");
	}
	public void habitat1() {
		System.out.println(nome +"== Cerrado  ");
	}

    }

  

    

    

