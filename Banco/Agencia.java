package Banco;

import java.util.Random;

public class Agencia extends ContaBancaria {

    ContaBancaria[] a;
    protected int contP = 0, contE = 0, sacP = 0, sacE = 0; //variavel responsavel pelo saques
    protected double totP = 0, totE = 0, calcP = 0, calcE = 0; //variavel pelo total das contas
    protected int saldoP = 0, saldoE = 0; // variavel responsavel pelas contas
    protected int desP = 0, desE = 0, despcontP =0,despcontE=0 ; //responsavel pela despositar
    protected  int novsalP =0 , novsalE =0 ;


    public Agencia(String cliente, double saldo, double num_conta) {
        super(cliente, saldo, num_conta);
    }

    public void sacar() {
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            if (a[i] instanceof ContaPoupanca) {
                if (saldoP < 0)

                    saldoP -= r.nextDouble(100, 1000);
                System.out.println("Contas que foram sacadas Poupanca: " + i);
                sacP++;
                System.out.println(" Saques Poupança : " + saldoP);


            } else {
                sacE++;
                System.out.println("Contas que foram sacadas Especial: " + i);
                saldoP -= r.nextDouble(0, 1000);
                System.out.println(" Saques Especial: " + saldoP);
            }

        }

    }

    public void depositar() {
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            if (a[i] instanceof ContaPoupanca) {
                if (desP > 0)
                    despcontP++;
                    desP += (int) r.nextInt(100, 1000);
                System.out.println("Contas que foram depositas em Poupanca: " + i);
              //  sacP++;
                System.out.println(" Deposito em Poupança : " + desP);


            } else {
                despcontE++;
                System.out.println("Contas que foram depositas em Especial: " + i);
                desE += r.nextDouble(0, 1000);
                System.out.println(" Deposito em Especial: " + desE);
            }

        }

    }
    public void calPorc() {
        totP = (double) (contP * totP) / 100;
        totE = (double) (contE * totE) / 100;
    }

    public void calcuSaldo() {
        for (int i = 0; i < a.length; i++) {
            if (a[i] instanceof ContaPoupanca) {
                calcP += saldo;
            } else {
                calcE += saldo;
            }
        }

    }


    //responsalvel por receber  vetor de posições da agencia
    public void gerar() {
        a = new ContaBancaria[15];
        sortea();
    }

    //vai sortear as contas se vai ser poupança ou especial
    public void sortea() {
        Random rd = new Random();
        //Pedindo para gerar salarios aleátorios
        int salrio = rd.nextInt(1000, 100000);
        int salrio1 = rd.nextInt(1000, 100000);


        for (int i = 0; i < a.length; i++) {
            int sorte = (int) (Math.random() * 1000);
            if (sorte % 2 == 0) {
                a[i] = new ContaPoupanca(" user 1 ", salrio, 1);
                contP++;

            } else {
                a[i] = new ContaEspecial(" user 2 ", salrio1, 2);
                contE++;
            }
            this.a[i].mostrarExtat();
        }
    }

    public void mostra() {
        System.out.println();
        System.out.println();
        System.out.println("Contas poupança ");
        System.out.println("==========================================================");
       // System.out.println("Nome " + cliente + " Saldo: " + saldo + " NºConta " + num_conta);
        System.out.println("Quantidade de  Conta poupanca: " + contP);
        System.out.println("Quantidade de Saques Conta poupanca: " + sacP);
        System.out.println("Depositos feito em Conta poupanca: " + despcontP);
        System.out.println("Conta poupanca: " + calcP);
        System.out.println("==========================================================");


        System.out.println();
        System.out.println("Contas especiais ");
        System.out.println("===========================================================");
        System.out.println("Quantidade de Conta Especial: " + contE);
        System.out.println("Quantidade de  Saques Especial: " + sacE);
        System.out.println("Depositos feito em Conta Especial: " + despcontE);
        System.out.println("Conta Especial: " + calcE);

        System.out.println("==========================================================");






    }


}



    

