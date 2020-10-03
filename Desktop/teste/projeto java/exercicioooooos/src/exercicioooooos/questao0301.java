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
public class questao0301 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double maior = 0, menor = 99999,mediaM=0,novaM=99999,velhoH=0,altura=0;
    int idade,mulheres = 0 ;
    String sexo;
    String nep;
    for(int count = 1 ; count <= 50; count++){      
    nep = JOptionPane.showInputDialog(null,"coloque a altura da" +count+
            "*pessoa" );
    altura = Double.parseDouble(nep);
    nep = JOptionPane.showInputDialog(null,"coloque a idade da" +count+
            "*pessoa" );
    idade = Integer.parseInt(nep);
    nep = JOptionPane.showInputDialog(null,"coloque a sexo da" +count+ 
            "*pessoa" );
    sexo = nep;
    if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("feminino")){
        mulheres++;}
    {mediaM = altura + mediaM;}
    if(idade > velhoH){velhoH = idade;}
    if(idade < novaM){novaM = idade;}
    else if(sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("masculino"))
    if(altura > maior) {maior = altura;}
    if(altura < menor) {menor = altura;}
    
    }
    JOptionPane.showMessageDialog(null,"media da idade das mulheres é"
            +mediaM/mulheres);
    JOptionPane.showMessageDialog(null,"maior altura é" + maior);
    JOptionPane.showMessageDialog(null,"menor altura é"+ menor);
    JOptionPane.showMessageDialog(null,"mulher mais nova é" + novaM);
    JOptionPane.showMessageDialog(null,"homem mais velho é" + velhoH);
    
    
    
    
    
    }
    
    
    
    }
        
    
    

