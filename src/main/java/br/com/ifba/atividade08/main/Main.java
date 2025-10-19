/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.main;

import br.com.ifba.atividade08.classe.Usuario;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {
    
    public static void main(String[] args) {
        Usuario usuario;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o email: ");
        String email = scanner.nextLine();
        System.out.println("Digite a senha: ");
        String senha = scanner.nextLine();
        System.out.println("Digite o nome de usuario: ");
        String nome = scanner.nextLine();
        
        usuario = new Usuario(nome, email, senha);
        
        int contador=1;
    do{
        if(usuario.getAtivo() == true){
            System.out.println(usuario.getUser() + ":ativo");
        }else{
            System.out.println(usuario.getUser() + ":inativo");
        }
        System.out.println("Escolha uma opção:" + "1 - Entrar conta\n" + "2 - Fechar Conta\n" + "3 - Mudar descrição\n" + "4 - ver descricão\n" + "5 - ver logs\n" + "0 - sair\n");
        contador = scanner.nextInt();
        scanner.nextLine();// previne o scanner de "pular" uma linha
        
        switch(contador){
            case 1:
            System.out.println("Digite o email: ");
            email = scanner.nextLine();
            System.out.println("Digite a senha: ");
            senha = scanner.nextLine();
            usuario.entraConta(email, senha);
            break;
            case 2:
            usuario.sairConta();
            break;
            case 3:
            System.out.println("Digite a descrição: ");
            String texto = scanner.nextLine();
            usuario.adicionarDescricao(texto);
            break;
            case 4:
            
            System.out.println(usuario.verDescricao());
            break;
            case 5:
            System.out.println(usuario.verLogs());
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
