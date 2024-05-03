 package Banco;

import javax.swing.JOptionPane;

public class ContaBancaria {

    protected String cliente;
    protected double saldo;
    protected double num_conta;



    
    public ContaBancaria(String cliente, double saldo, double num_conta) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.num_conta = num_conta;
    }

  

    public void depositar(double valor){
        saldo+=valor;
    }

    public void mostrarExtat(){
        System.out.println(" {  Cliente:" + cliente +" \nConta:" + num_conta  + " \tsaldo: " + saldo +"}");
        System.out.println();
    }
}