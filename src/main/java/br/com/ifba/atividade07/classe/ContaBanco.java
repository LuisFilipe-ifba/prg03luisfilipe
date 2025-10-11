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
        setDono(dono);
        setTipo(tipo);
            
            //Aqui verifica o saldo que ganha de bonus ao abrir a conta a depender do tipo 
        if (tipo.equals("cc")) {
            setSaldo(50);
            setStatus(true);
        } else if (tipo.equals("cp")) {
            setSaldo(150);
            setStatus(true);
        }else{
            System.out.println("erro tipo de conta invalido");
            return;
        }
        //o System.outprint abaixo foi adicionado para verificar se o metodo avia funcionado
        System.out.println("Conta aberta com sucesso para " + this.dono + " do tipo " + this.tipo);
    }
    
    public void fecharConta(){
        if(this.saldo == 0){ //caso o saldo seja 0 a conta pode ser fechada
            setStatus(false);
            System.out.println("conta fechada com sucesso");
        }else{
            System.out.println("conta não pode ser fechada pois o saldo é diferente de zero");
        }
    }
    
    public void depositar(int valor){
        if(this.status == true){// Verifica o status da conta para ver se é possivel executar o deposito
            setSaldo(this.saldo + valor);
            System.out.println("deposito feito com sucesso, novo saldo de:" + this.saldo);
        }else{
            System.out.println("não foi possivel executar o deposito pois a conta esta inativa");
        }
    }
    
    public void sacar(int valor){
        if(this.status == true){// Verifica o status da conta para ver se é possivel executar o saque
            if(this.saldo >= valor){//verifica o valor do saldo para ver se é possiver executar o saque
                setSaldo(this.saldo - valor);
                System.out.println("saque feito com sucesso, novo saldo de:" + this.saldo);
            }else{
                System.out.println("não foi possivel executar o saque pois seu saldo é insuficiente");
            }
        }else{
            System.out.println("não foi possivel executar o saque pois a conta esta inativa");
        }
    }
    
    public void pagarMensal(){
        if(this.status == true){
            if(this.tipo == "cc"){
                setSaldo(this.saldo - 12);
            }else if(this.tipo == "cp"){
                setSaldo(this.saldo - 20);
            }else{
                System.out.println("erro tipo de conta invalido");
            }
        }else{
            System.out.println("conta inativa");
        }
    }
    
    private int getnumConta(){
        return this.numConta;
    }
    
    private void setnumConta(int num){
        this.numConta = num;
    }
    
    private String getDono(){
        return this.dono;
    }
    
    private void setDono(String dono){
        this.dono = dono;
    }
    
    private String getTipo(){
        return this.tipo;
    }
    
    private void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    private int getSaldo(){
        return this.saldo;
    }
    
    private void setSaldo(int saldo){
        this.saldo = saldo;
    }
    
    private boolean getStatus(){
        return this.status;
    }
    
    private void setStatus(boolean status){
        this.status = status;
    }
}
