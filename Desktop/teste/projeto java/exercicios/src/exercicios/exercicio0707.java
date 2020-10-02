/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import javax.swing.*;
public class exercicio0707 {
public static void main(String[] args) {
double peso,altura,imc;
String nep="";
nep = JOptionPane.showInputDialog(null,"Insira Peso");
peso = Double.parseDouble(nep);
nep = JOptionPane.showInputDialog(null,"Insira altura");
altura = Double.parseDouble(nep);
if(peso > 5/10  && altura > 1/10){
imc = peso / (Math.pow(altura, 2));

}

    
    
    
    
    
}
    
}
