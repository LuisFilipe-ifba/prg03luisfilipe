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
public class PagamentoCartao implements Pagamento{
    private double valor;
    
    @Override
    public double calcularTotal(double valor) {
        setValor(valor * 1.05);//valor inicial com os acrecimos das taxas
        
        return getValor();
    }

    @Override
    public String imprimirRecibo(double valor) {
        return("Valor pago: " + String.valueOf(valor) + "\nValor da taxa: " + String.valueOf(valor * 0.05) + "\nTotal: " + String.valueOf(valor * 1.05));
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
