/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade06.view;

/**
 *
 * @author PC
 */
public class Fatorial {
    
    public static int setValor (int n){
        int numero = n;
        int fator = 1; // essa cariavel vai ser usada para fatorar o numero
        
        if(numero > 1){
            fator = setValor(n - 1);
            numero = numero * fator;
            return numero;
        }else{
            return 1;
        }
        
        
    }
    
    
}
