package Anim;



public class Rato {
    
    private String nome;
    private String raca;
    private int idade;

    public Rato(){}

    public Rato(String nome, String raca, int idade)
     {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }
    public String getNome() 
    {
        return nome;
    }
    public void setNome(String nome) 
    {
        this.nome = nome;
    }
    public String getRaca() 
    {
        return raca;
    }
    public void setRaca(String raca)
     {
        this.raca = raca;
    }
    public int getIdade() 
    {
        return idade;
    }
    public void setIdade(int idade) 
    {
        this.idade = idade;
    }

    public void Habita(){
        System.out.println(nome + " Esgotos ");
    }

    public void alimentacao (){
        System.out.println(nome + " Queijo qually ");
    }

    public void Familia(){
        System.out.println(nome + " Ratatuie ");
    }

    public void Mostra(){
        Habita();
        alimentacao();
        Familia();
    }
    
}
