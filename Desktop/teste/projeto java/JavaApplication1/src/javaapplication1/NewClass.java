/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.*;


public class NewClass {

    public static void main(String[] args) {
        double valor1, valor2, resultado;
        String aux = "";

        aux = JOptionPane.showInputDialog(null, "digite um primeiro valor");
        valor1 = Double.parseDouble(aux);

        aux = JOptionPane.showInputDialog(null, "digite um segundo valor");
        valor2 = Double.parseDouble(aux);

         resultado = Nep.multiplicaValor(valor1, valor2);

        JOptionPane.showMessageDialog(null, "O resultado da multiplicação é = " + resultado);
    }

}
