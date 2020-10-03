/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioooooos;

import javax.swing.*;

public class exercicio0303 {
    
    public static void main(String[] args) {
        String  nep="";
  int vetor[] = new int [10];
  for(int count = 0; count < 10; count++){
      
  nep = JOptionPane.showInputDialog(null,"digite um numero");
  vetor[count] = Integer.parseInt(nep); 
  if(count % 2 == 0){
   vetor[count] = vetor[count]*2;   
   }else { vetor[count] = vetor[count]*3;
   
  }
   JOptionPane.showMessageDialog(null,vetor[count]);
   
  }
   
       
  }

  }

    


