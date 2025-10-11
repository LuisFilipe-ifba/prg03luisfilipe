/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.classe;

/**
 *
 * @author PC
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private int saldo;
    private boolean status;
    
    public ContaBanco(){// Metodo contrutor
        this.saldo = 0;
        this.status = false;
    }
    
    public void abrirConta(String dono, String tipo) {
        this.dono = dono;
        this.tipo = tipo;
        this.status = true;
            
            //Aqui verifica o saldo que ganha de bonus ao abrir a conta a depender do tipo 
        if (tipo.equals("cc")) {
            this.saldo = 50;
        } else if (tipo.equals("cp")) {
            this.saldo = 150;
        }

        System.out.println("Conta aberta com sucesso para " + this.dono + " do tipo " + this.tipo);
    }
    
    public void fecharConta(){
        
    }
    
}
