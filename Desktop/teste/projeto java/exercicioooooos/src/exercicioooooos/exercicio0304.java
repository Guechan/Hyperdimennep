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
public class exercicio0304 {
   public static void main(String[] args) {
        String  nep="";
  int vetor[] = new int [10],media = 0;
  for(int count = 0; count < 10; count++){
      
  nep = JOptionPane.showInputDialog(null,"digite um numero");
  vetor[count] = Integer.parseInt(nep); 
  media = media + vetor[count];
}
  JOptionPane.showMessageDialog(null,"a media é"+media/10);
   }


}