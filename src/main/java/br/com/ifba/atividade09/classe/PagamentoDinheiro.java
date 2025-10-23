/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.classe;

import br.com.ifba.atividade09.interfaces.Pagamento;

/**
 *
 * @author PC
 */
public class PagamentoDinheiro implements Pagamento {
    private double valor;
    
    @Override
    public String imprimirRecibo(double valor) {
        return ("Valor pago: " + String.valueOf(valor) + "\nValor do Desconto: -" + String.valueOf(valor *0.1) + "\nTotal:" + String.valueOf(valor * 0.9));
    }

    @Override
    public double calcularTotal(double valor) {
        setValor(valor * 0.9); //valor inicial menos os dez porcento de desconto
        
        return getValor();
    }
    
    private double getValor() {
        return valor;
    }

    private void setValor(double valor) {
        this.valor = valor;
    }

    
    
}
