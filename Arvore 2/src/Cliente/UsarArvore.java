package Cliente;

import Arvore.Arvore;

public class UsarArvore {
    public static void main(String[] args) {
        Arvore tes = new Arvore();

        tes.inserir(24);
        tes.inserir(18);
        tes.inserir(15);
        tes.inserir(19);
        tes.inserir(39);
        tes.inserir(46);
        tes.inserir(2);
        tes.inserir(3);
        tes.inserir(1);
        tes.ordem(tes.getRaiz());
        System.out.println();
        tes.Preordem(tes.getRaiz());
        System.out.println();
        tes.Pos_ordem(tes.getRaiz());
        System.out.println();
        System.out.println();


        System.out.println("ele retornou : "+tes.menorValor(tes.getRaiz()));
        System.out.println("ele retornou : "+tes.maiorValor(tes.getRaiz()));





    }
}
