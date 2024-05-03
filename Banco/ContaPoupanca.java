package Banco;

public class ContaPoupanca  extends ContaBancaria{
    public ContaPoupanca(String cliente, double saldo, double num_conta) {
        super(cliente, saldo, num_conta);
        //TODO Auto-generated constructor stub
    }


    private int Rendimento;


    public void calcularNovo(int porc){
        saldo = (saldo * porc/100) + saldo; 
    }
    

}
