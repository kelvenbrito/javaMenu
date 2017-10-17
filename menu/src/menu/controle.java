/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aluno
 */
public class Controle {
    private ArrayList<Cliente>clientes;
    private ArrayList<Produto>produto;
    private static Controle controle = null;
    private DefaultTableModel dados;
    
    private Controle(){
        clientes = new ArrayList<Cliente>();
        dados = new DefaultTableModel();
        }

 
    public static Controle getIntancia(){
        if(controle == null){
            controle = new Controle();
        }

    }
        return controle;
    }
    
    public void adicionaCliente(){
        
    
    
    }

