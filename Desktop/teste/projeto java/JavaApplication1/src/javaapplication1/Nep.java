/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Antonio
 */
public class Nep {
    
    //criando um método com parâmetros e com retorno
    public static double multiplicaValor(double v1, double v2){
        return (v1*v2);
    }
    //método sem parâmetro e sem retorno
    //Executa por si mesmo
    public static void multiplicarValor(){
        double v1, v2, resp;
        v1=10.5;
        v2=10.5;
        resp = v1*v2;
        System.out.println("Multplicar Valor = "+resp);
    }
    //Método sem retorno mas com parâmetros
    public static void multiplicandoValor(double v1,double v2){
        
        double resp = (v1*v2);
        
        System.out.println("Multiplicando valor = "+resp);
    }
    public static String imprimeTexto(String texto){
        return texto;
    }
    
    public static void imprimirTexto(String texto){
        System.out.println("Texto impresso = "+texto);
    }
}
