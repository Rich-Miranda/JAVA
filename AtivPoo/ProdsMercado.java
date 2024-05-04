/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtivPoo;

import javax.swing.JOptionPane;

/**
 *
 * @author R I C H
 */
public class ProdsMercado {
    private int id;
    private String Nome;
    private String Desc;
    private double valor;
    private int quant;
    private int cont=0;
    

    public ProdsMercado() {
    id = cont++;
    }

    public ProdsMercado(String Nome, String Desc, double valor, int quant) {
        this.Nome = Nome;
        this.Desc = Desc;
        this.valor = valor;
        this.quant = quant;
        id=cont++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    @Override
    public String toString() {
        return "ProdsMercado{" + "id=" + id + ", Nome=" + Nome + ", Desc=" + Desc + ", valor=" + valor + ", quant=" + quant + ", cont=" + cont + '}';
    }

   
   
    
    
    
    
    
    
}
