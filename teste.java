
import java.util.*;

public class teste {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        //definindo a posição do vetor
        double vet[] = new double[3];
        double vet1[] = new double[3];
        
        double maiorNota = 0,maiorNota1 = 0, menorNota = 0, menorNota1 = 0, total = 0, media = 0;
        double mediaMaior =0  , mediaMenor =0 ;
        int i; // referenciando o i do for
      
        //Definir uma string
        String alunos = "ABCDEFGHIJKLMNOPQRSTUVYWXZ";
        String test [] = new String[alunos.length()];
 

        //definir o espaço entre as letras 
        String espaco = "";
       

        //Pegar a posição nula
        int index = 0;



        // System.out.println(tes);

        for (i = 0; i < vet.length; i++) {
            //definindo um random de caracteres aleatorios
           index = rd.nextInt(test.length);

           //vai pegar apenas os 3 primerios caracteres da frase
           espaco = test.toString().substring(index,index + 3).toUpperCase();

            //definido as notas dos alunos aleatorio
            vet[i] = rd.nextDouble(0, 10);
            vet1[i] = rd.nextDouble(0, 10);

            //mostra na tela , nome e a nota correspondente
            System.out.println("Aluno : " + (espaco));
            System.out.printf("Nota 1: %.1f\n", vet[i]);
            System.out.printf("Nota 2: %.1f\n", vet1[i]);
            System.out.println();

            //vai Calcular a nota dos alunos 
            total = (vet[i] + vet1[i]);

        }
        //Mostra a media da sala
        media = total/2;

        for(i = 0; i < vet.length; i++)
        {
            if(total> maiorNota)
            {
                maiorNota++;
           
                System.out.println("[" +i + "] -> "+ " Os alunos que foram bem: "+ espaco);
                
                
            }else if(total < menorNota){
                menorNota++;
                System.out.println("[" +i + "] -> "+ " Os alunos que foram bem: "+ espaco);
            }
        }

        //comparar se a média é maior pros alunos acima de 5
        if(media > mediaMaior){
            mediaMaior = media;
        }
        System.out.println("============================");
        System.out.println(" Total de alunos  Melhores : " + maiorNota);
        System.out.println(" Com suas medias Maior : " + String.format("%.1f", mediaMaior));
        System.out.println("============================");


         //comparar se a média é menor pros alunos abaixo de 5
         
         System.out.println("\n Total de alunos  que tiveram nota abaixo da média  : " + menorNota);
        System.out.println("Com suas medias Menor : " + String.format("%.1f", mediaMenor));
        System.out.println("============================\n");

    }
}
