/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.classe;

/**
 *
 * @author PC
 */
public class PerfilUsuario {
    private String descricao;
    private long id;
    
    protected PerfilUsuario(long id){
        this.descricao = "sem descrição";
        this.id = id;
    }
    
    //as string get e set propositalmente sem modificadores para que apenas funções do pacote as possam usar
    long getId(){
        return this.id;
    }
    
    void setId(long id){
        this.id = id;
    }
    
    String getDescricao(){
        return this.descricao;
    }
    
    void setDescricao(String descricao){
        this.descricao = descricao;
    }
}
