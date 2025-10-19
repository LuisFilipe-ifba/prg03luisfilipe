/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.classe;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author PC
 */
public class Log {
    private long id;
    private String user;
    private String acao;
    private String hora;// embora nomeado hora essa string tbm pega a data
    private String ip;
    
    public Log(long id, String user){
        this.id = id;
        this.user = user;
        this.ip = String.valueOf(id);
        setHora();
        setAcao(hora + ip + "---Conta Criada\n");
    }
    
    public void atualizarAcao(String acao){
        setHora();
        setAcao(this.acao + this.hora + ip + acao);
    }
    
    //as string get e set propositalmente sem modificadores para que apenas funções do pacote as possam usar
    long getId(){
        return this.id;
    }
    
    void setId(long id){
        this.id = id;
    }
    
    String getUser(){
        return this.user;
    }
    
    void setUser(String user){
        this.user = user;
    }
    
    String getHora(){
        return this.hora;
    }
    
    void setHora(){//set hora n recebe nenhuma string pois esse metodo pega a string da data atual
        LocalDateTime agora = LocalDateTime.now();//pega a data atual
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");//poem a data de acordo com o formato
        this.hora = agora.format(formato);//passa a string para hora
         
    }
    
    String getIp(){
        return this.ip;
    }
    
    void setIp(String ip){
        this.ip = ip;
    }
    
    String getAcao(){
        return this.acao;
    }
    
    void setAcao(String acao){
        this.acao = acao;
    }
}
