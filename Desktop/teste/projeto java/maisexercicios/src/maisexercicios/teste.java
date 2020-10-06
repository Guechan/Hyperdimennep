/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maisexercicios;

import javax.swing.*;

/**
 *
 * @author Antonio
 */
public class teste {
    
    
    public static void main(String[] args){
     String nep = "0";
    String cpf ="_";
    String nome;
    String telefone;
    int data_nascimento;
    int clientedesde;
    String pis;
    String carteiradetrabalho;
    String registro;
    
    cpf = JOptionPane.showInputDialog(null,"coloque o cpf");
    pis = JOptionPane.showInputDialog(null,"coloque o pis");
    registro = JOptionPane.showInputDialog(null,"coloque o registro");
    carteiradetrabalho = JOptionPane.showInputDialog(null,"coloque a "
            + "carteiradetrabalho");
   nome = JOptionPane.showInputDialog(null,"coloque o nome ");
  telefone = JOptionPane.showInputDialog(null,"coloque o telefone");
  nep = JOptionPane.showInputDialog(null,"cliente desde " );
    clientedesde = Integer.parseInt(nep);
   nep = JOptionPane.showInputDialog(null,"coloque a data de nascimento " );
    data_nascimento = Integer.parseInt(nep);
  
 JOptionPane.showMessageDialog(null,"nome é" +nome);
 JOptionPane.showMessageDialog(null,"cpf é" + cpf);
 JOptionPane.showMessageDialog(null,"telefone é" + telefone);
 JOptionPane.showMessageDialog(null,"data de nascimento é"+ data_nascimento ); 
 JOptionPane.showMessageDialog(null,"é cliente desde" + clientedesde);   
 JOptionPane.showMessageDialog(null,"pis  é" + pis);  
 JOptionPane.showMessageDialog(null,"A carteira de trabalho é" + 
         carteiradetrabalho); 
  JOptionPane.showMessageDialog(null,"O registro é" + registro);       
         
         
         
}


}