package Arvore;

public class Arvore {
    private No raiz, atual;  //Vai ser os principal atributos do nó

    public No getRaiz() {
        return raiz;
    }

    public void inserir(int numero) {
        if (raiz == null) {
             raiz = new No(null,null,numero); //Está iniciando um nó na raiz
            //Vai demarcar a no, comparado se arvore tem algum valor na arvore
        }else{
            atual = new No(null,null,numero); // Vai verificar se existe preechimento na arvore
            inserir(atual, raiz); // Vai commeçar inserir algum valor, para isso acontecer ele vai verificar os valores passado no atual e no raiz
            //Ele vai comparar sempre um novo valor com a raiz

        }
    }

    public void inserir(No atual, No no) {
        if (atual.getNumero() < no.getNumero()) {
            if (no.getEsquerda() == null){  //Vai verificar se a arvore é igual a null, se for vai ligar com a raiz
                no.setEsquerda(atual); //Vai receber um novo valor a esquerda
            }else {
                inserir(atual, no.getEsquerda());  //Senão vai está livre na arvore
              }
            }else{
            if (no.getDireita() == null){ // ele vai descer até todos valores maiores ficarem a direta
                no.setDireita(atual);
            }else{
                inserir(atual, no.getDireita()); //Senão vai está livre na arvore
            }

        }
    } //Método que vai ser recursivo

    public void ordem(No no){
        if(no != null){
            ordem(no.getEsquerda());
            System.out.print(no.getNumero() + " ");
            ordem(no.getDireita());
        }
    }

    public void Preordem( No no){
       if(no !=null){
           Preordem(no.getEsquerda());
           Preordem(no.getDireita());
           System.out.print(no.getNumero() + " ");
       }
    }

    public void Pos_ordem(No no){
    if(no!=null) {
        Pos_ordem(no.getEsquerda());
        Pos_ordem(no.getDireita());
        System.out.print(no.getNumero() + " ");
    }
    }

    public int menorValor(No no){

        if(no.getEsquerda() != null){
            return  menorValor(no.getEsquerda());
        }

        return no.getNumero();

    }

    public int maiorValor(No no){
        if(no.getDireita() != null){
            return maiorValor(no.getDireita());
        }
        return no.getNumero();
    }

    public boolean pesquisa(int valorBuscar, No no) {
        if(no == null) {
            if(valorBuscar == no.getNumero()) {
                return true;
            }else if(valorBuscar >= no.getNumero()){
                //vai a direira
                return pesquisa(valorBuscar, no.getDireita());

            }else {
                return pesquisa(valorBuscar, no.getEsquerda());
            }
        }
        return false;
    }




}
