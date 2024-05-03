package Banco;

import java.util.Random;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Agencia agen = new Agencia(" Tes1 ", 1021, 01);


        agen.gerar();
        agen.calPorc();
        agen.calcuSaldo();
        System.out.println("Saques");
        System.out.println("==========================================================");
        agen.sacar();
        System.out.println("==========================================================");
        System.out.println("Depositos");
        System.out.println("==========================================================");
        agen.depositar();
        System.out.println("==========================================================");
        agen.mostra();
    }

}
