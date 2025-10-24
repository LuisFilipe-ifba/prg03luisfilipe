/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.classes;

/**
 *
 * @author PC
 */
public class Esfera extends Forma3D{
    
    public double obterArea(double altura){
        
        return Math.pow(((altura*2)*3.14), 2);
    }
    
    public double obterVolume(double altura){
        
        return Math.pow(altura, 3)*3.14*4/3;
    }
}
