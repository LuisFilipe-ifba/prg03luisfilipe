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
public class PagamentoPix implements Pagamento{
    private double valor;
    
    @Override
    public double calcularTotal(double valor) {
        setValor(valor * 0.98);//valor inicial subtraido dos dois porcento de cashback
                
        return getValor();
    }

    @Override
    public String imprimirRecibo(double valor) {
        return ("Valor pago: " + valor + "\nCashback: " + valor * 0.02 + "\nTotal: " + valor * 0.98);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
