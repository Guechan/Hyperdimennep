/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioooooos;

import javax.swing.*;

/**
 *
 * @author Antonio
 */
public class questao0302 {
    public static void main(String[] args) {
    int idade,ps=0,mulheres=0,pc=0;
    String nep="",sexo="",cabeloc;
   
    for(int count = 1; count <= 300; count++)
   sexo = JOptionPane.showInputDialog(null,"coloque o sexo da"+count+
         "*pessoa" );
    nep = JOptionPane.showInputDialog(null,"coloque a idade da"+
         "*pessoa" );
    idade = Integer.parseInt(nep);
    cabeloc = JOptionPane.showInputDialog(null,"coloque a cor do cabelo da" +
          "*pessoa" );
    if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("feminino")){
        mulheres++;
    }
    if(idade > 30){
        ps++;}
    
    if(cabeloc.equals("Castanho")){
       pc++ ;}
    
    ps=(100*ps/300);
    
    JOptionPane.showMessageDialog(null, "o numero de mulheres é"+ mulheres);
    JOptionPane.showMessageDialog(null, "parcela de pessoas de"
            + " maioridade"+ps+"%");
    JOptionPane.showMessageDialog(null, "pessoas de cabelo castanho"+pc);
    
    
    
    
    }
    
        }
    
    
    
    

