/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.classes;

/**
 *
 * @author PC
 */
public class Circulo extends Forma2D{
    
    /**
     *
     * @param altura
     * @param largura
     * @return
     */
    @Override
    public double obterArea(double altura, double largura){
        return 3.14 * (altura / 2);
    }
}
