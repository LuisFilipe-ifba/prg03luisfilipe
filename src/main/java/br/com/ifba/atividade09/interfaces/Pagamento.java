/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.interfaces;

/**
 *
 * @author PC
 */
public interface Pagamento {

    /**
     *
     * @param valor
     * @return
     */
    public double calcularTotal(double valor);
    public String imprimirRecibo(double valor); 
}
