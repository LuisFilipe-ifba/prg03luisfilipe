/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.classes;

/**
 *
 * @author PC
 */
public class Cubo extends Forma3D{
    
    @Override
    public double obterArea(double altura, double largura, double profundidade){
        
        return 2 * ((altura * largura)+ (altura * profundidade)+ (largura * profundidade)) ;
    }
    @Override
    public double obterVolume(double altura, double largura, double profundidade){
        
        return altura * largura * profundidade;
    }
}
