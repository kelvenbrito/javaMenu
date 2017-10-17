/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

/**
 *
 * @author aluno
 */
 
public class Produto {
    
    private int id;
    private String nome; 
    private int quant;
    private double valor;
    private static int cont=1000;
    
    
    public Produto() {
        cont++;
        id = cont;
    }
    

    public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    
    public int getQuant() {
        return quant;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public void setQuant(int quant) {
        this.quant = quant;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
      

    
}
