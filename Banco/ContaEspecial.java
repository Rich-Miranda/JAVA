package Banco;

import javax.swing.JOptionPane;

/**
 * ContaEspecial
 */
public class ContaEspecial extends ContaBancaria {

    public ContaEspecial(String cliente, double saldo, double num_conta) {
        super(cliente, saldo, num_conta);
        //TODO Auto-generated constructor stub
    }

    private double limite;


    //Vai sacar até chegar o limite
    public void Sacar(int limitVal){
        if(saldo - limite - limitVal< 0){
           JOptionPane.showMessageDialog(null,"Valor insuficiente");
        }else{
            saldo -= limitVal;
        }
    }

    

    //get e sets Limite
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
}