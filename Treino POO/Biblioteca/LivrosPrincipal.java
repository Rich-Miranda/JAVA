package Biblioteca;

public class LivrosPrincipal {
   

    public static void main(String[] args) {
        Livros book = new Livros();

        book.nome = "Jogador nº1";
        book.categoria ="Ficcão cientifica";
        book.valor = 40.12;

        System.out.println(book.nome);
        System.out.println(book.categoria);
        System.out.println(book.valor);
        System.out.println();

        LivrosDeLivraria bookLivr = new LivrosDeLivraria();

        bookLivr.nome = "Jogador nº1 Parte 2";
        bookLivr.categoria ="Ficcão cientifica";
        bookLivr.valor = 40.12;

        System.out.println(bookLivr.nome);
        System.out.println(bookLivr.categoria);
        System.out.println(bookLivr.valor);
        System.out.println();

        LivrosBiblioteca bookBibli = new LivrosBiblioteca();

        bookBibli.id = 1;
        bookBibli.nome = "Tes1";
        bookBibli.nomeLivro = "Jogador nº1";
        bookBibli.categoria ="Ficcão cientifica";
        bookBibli.contato = "11111-1111";
        
        System.out.println(bookBibli.id);
        System.out.println(bookBibli.nome);
        System.out.println(bookBibli.nomeLivro);
        System.out.println(bookBibli.categoria);
        System.out.println(bookBibli.contato);
        System.out.println();
        

        
    }
    
}
