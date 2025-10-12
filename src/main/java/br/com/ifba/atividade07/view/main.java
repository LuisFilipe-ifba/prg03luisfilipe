/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.view;

import br.com.ifba.atividade07.classe.ContaBanco;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class main {
    
    public static void main(){
    ContaBanco conta = new ContaBanco(); //inicialização da classe
    Scanner scanner = new Scanner(System.in); //inicializa oscanner para poder digitar
    int valor;
    
    int contador=1;
    do{
        System.out.println("Escolha uma opção:" + "1 - Iniciar conta\n" + "2 - Fechar Conta\n" + "3 - Depositar na conta\n" + "4 - sacar da Conta\n" + "5 - pagar mensalidade\n" + "0 - sair\n");
        contador = scanner.nextInt();
        scanner.nextLine();// previne o scanner de "pular" uma linha
        
        switch(contador){
            case 1://inicializar conta
            System.out.print("Digite seu nome: ");//aqui pede o nome e o tipo da conta
            String nome = scanner.nextLine();
            System.out.print("Digite o tipo(cc ou cp): ");//caso digite algo alem de cc ou cp a inicialisação falha
            String tipo = scanner.nextLine();
            conta.abrirConta(nome, tipo);
            break;
            case 2:
            conta.fecharConta();//fechar a conta
            break;
            case 3:
            System.out.print("Digite o valor do deposito: ");//digitar um valor para deposito
            valor = scanner.nextInt();
            scanner.nextLine();// previne o scanner de "pular" uma linha
            conta.depositar(valor);
            break;
            case 4:
            System.out.print("Digite o valor do deposito: ");//sacar um valor
            valor = scanner.nextInt();
            scanner.nextLine();// previne o scanner de "pular" uma linha
            conta.sacar(valor);
            break;
            case 5:
            conta.pagarMensal();//pagar mensalidade
            break;
            case 0:
            System.out.println("finalizando");
            break;
            default:
            System.out.println("invalido");
        }
    }while(contador!=0);
    scanner.close();
    }
}
