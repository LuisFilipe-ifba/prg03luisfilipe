/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.main;

import br.com.ifba.atividade10.classes.*;

import br.com.ifba.atividade10.classes.Forma;


import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        int altura, largura, profundidade;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a opção:" +"\nFormas Bidimencionais:" + "\n1-quadrado" + "\n2-triangulo" + "\n3-circulo"+ "\nFormas Tridimencionais:" + "\n4-Cubo" + "\n5-Piramide"+ "\n6-Esfera");
        int opc = scanner.nextInt();
        scanner.nextLine();// previne o scanner de "pular" uma linha
        
        
        if(opc ==  1){
            Quadrado quadrado = new Quadrado();
            System.out.println("Digite a altura: ");
            altura = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite a largura: ");
            largura = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println("Area" + String.valueOf(quadrado.obterArea(altura, largura)));
        }else if(opc ==  2){
            Triangulo triangulo = new Triangulo();
            
            System.out.println("Digite a altura: ");
            altura = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite a largura: ");
            largura = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println("Area" + String.valueOf(triangulo.obterArea(altura, largura)));
        }else if(opc ==  3){
            Circulo circulo = new Circulo();
            System.out.println("Digite o diametro: ");
            altura = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println("Area" + String.valueOf(circulo.obterArea(altura, 1)));
            
        }else if(opc ==  4){
            Cubo cubo = new Cubo();
            System.out.println("Digite a altura: ");
            altura = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite a largura: ");
            largura = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite a profundidade: ");
            profundidade = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println("Volume: " + String.valueOf(cubo.obterVolume(altura, largura, profundidade)) + "\n");
            System.out.println("Area: " + String.valueOf(cubo.obterArea(altura, largura, profundidade)) + "\n");
            
        }else if(opc ==  5){
            Piramide piramide = new Piramide();
            System.out.println("Digite a altura: ");
            altura = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite a largura: ");
            largura = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite a profundidade: ");
            profundidade = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println("Volume: " + String.valueOf(piramide.obterVolume(altura, largura, profundidade)) + "\n");
            System.out.println("Area: " + String.valueOf(piramide.obterArea(altura, largura, profundidade)) + "\n");
            
        }else if(opc ==  6){
            Esfera esfera = new Esfera();
            System.out.println("Digite o diametro: ");
            altura = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println("Volume: " + String.valueOf(esfera.obterVolume(altura)) + "\n");
            System.out.println("Area: " + String.valueOf(esfera.obterArea(altura)) + "\n");
            
        }
    }
}
