package Banco;
import java.util.*;

public class Extrato {
    public static void main(String[] args) {
        ContaCorrente bank = new ContaCorrente();
        Scanner sc = new Scanner(System.in);
        bank.numeroConta = 1111231;
        bank.saldoConta = 100000;
        bank.limite = 2000000;

        System.out.println("Vc é especial ?");
        bank.especial = sc.next();

        if(bank.especial.equalsIgnoreCase("Sim")){
            System.out.println(bank.especial);
        }else{
            System.out.println(bank.especial);
        }

        System.out.println(bank.numeroConta);
        System.out.println(bank.saldoConta);
        System.out.println(bank.limite);
    }
}
