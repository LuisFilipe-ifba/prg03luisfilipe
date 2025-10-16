/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.classe;

/**
 *
 * @author PC
 */
public class Usuario {
    private long id;
    private String userName;
    private String email;
    private String senha;
    private boolean ativo;
//    private PerfilUsuario perfil;
//    private Log perfil;
    
    /**
     *
     * @param user
     * @param email
     * @param senha
     */
    public Usuario(String user, String email, String senha){//Construtor
        this.id = (long)(Math.random()* 1000 + 1);
        this.ativo = true;
        this.userName = user;
        this.email = email;
        this.senha = senha;
    }
    
    public void sairConta(){
        setAtivo(false);//sai da conta deixando ela desativada
    }
    
    public String entraConta(String email, String senha){
            //função para logar na conta verifica se email e senha são iguais e ativa a conta se possitivo
        if(getEmail() != email){
           return("erro ao entrar na conta");
        }else if(getSenha() != senha){
           return("erro ao entrar na conta");
        }else{
            setAtivo(true);
            return("logado com sucesso");
        }
    }
    
    private long getId(){
        return this.id;
    }
    
    private void setId(long id){
        this.id = id;
    }
    
    private String getUser(){
        return this.userName;
    }
    
    private void setUser(String user){
        this.userName = user;
    }
    
    private String getEmail(){
        return this.email;
    }
    
    private void setEmail(String email){
        this.email = email;
    }
    
    private String getSenha(){
        return this.senha;
    }
    
    private void setSenha(String senha){
        this.senha = senha;
    }
    
    private boolean getAtivo(){
        return this.ativo;
    }
    
    private void setAtivo(boolean ativo){
        this.ativo = ativo;
    }
}
