/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.ifba.prg03luisfilipe;

import br.com.ifba.atividade07.classe.ContaBanco;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Prg03luisfilipe {

    public static void main(String[] args) {
        
        System.out.println("me mate!");
        
        ContaBanco conta = new ContaBanco();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o tipo(cc ou cp): ");
        String tipo = scanner.nextLine();
        conta.abrirConta(nome, tipo);
        
        System.out.print("Digite o valor do deposito: ");
        int valor = scanner.nextInt();
        conta.depositar(valor);
        
        scanner.close();
        
    }
}
