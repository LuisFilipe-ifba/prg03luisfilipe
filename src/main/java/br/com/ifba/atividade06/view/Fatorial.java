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
    
    public static int setValor (int n){//função responsavel por fatorar o numero
        int numero = n;
        int fator = 1; // essa cariavel vai ser usada para fatorar o numero
        
        if(numero > 1){
            fator = setValor(n - 1);
            numero = numero * fator;
            return numero;
        }else{
            return 1; // o fatorial de numeros menores que 1 é 1
        }        
    }
    
    public static String setFormula(int n){// Função que retorna uma string explicando a formula do calculo
        String formula = String.valueOf(1);
        
        if(n > 1){
            formula = String.valueOf(n) + "*" + setFormula(n-1);// essa linha vai acumulando texto ate retornar o texto
            return formula;
        }
        return formula;
    }
    
}
