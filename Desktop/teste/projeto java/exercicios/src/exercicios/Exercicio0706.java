/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import javax.swing.*;

/**
 *
 * @author Antonio
 */
public class Exercicio0706 {
    public static void main(String[] args) {
     double salario;
     String nep ="";
     nep = JOptionPane.showInputDialog(null,"ponha uma salario");
     salario = Double.parseDouble(nep);
     if(salario >= 465) { 
              if(salario <= 965) {
          JOptionPane.showMessageDialog(null,"a alicota é 8,0 e o salario é RS:"
                  + (salario-(salario*0.08)));
              }
              else if(salario <= 1609){
         JOptionPane.showMessageDialog(null,"a alicota é 9,0 e o salario é RS:"
         + (salario-(salario*0.09)));
     }
              else if(salario <= 3245){
         JOptionPane.showMessageDialog(null,"a alicota é 11,0 e o salario é RS:"
         + (salario-(salario*0.11)));      
                      }
         }
     else{
         JOptionPane.showMessageDialog(null,"salario é muito baixo");
         }
         
         
     
     
     
     
     }
    }
     
         
     
     
    
    

