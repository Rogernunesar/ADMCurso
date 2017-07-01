/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @Matheus
 */
public class ModeloProf {
    private int idprof;
    private String nomeprof;
    private String emailprof;
    private String valorhora;
    private String formacao;
    private String pesquisar;

    public int getIdprofessor() {
        
        return idprof;
        
    }

    public void setIdprofessor(int idprofessor) {
        this.idprof = idprofessor;
    }

    public String getNomeprof() {
        return nomeprof;
    }

    public void setNome(String nomeprof) {
        this.nomeprof = nomeprof;
    }
    
    public String getEmailprof(){
        return emailprof;
    }
    public void setEmail(String emailprof){
        this.emailprof = emailprof;
    }
    public String getValorhora(){
        return valorhora;
    }
    
    public void setValorhora(String valorhora){
        this.valorhora = valorhora;
    }
    
    public String getFormacao(){
        return formacao;
    }
    
    public void setFormacao(String formacao){
        this.formacao = formacao;
    }

    public String getPesquisar() {
        return pesquisar;
    }

    public void setPesquisar(String pesquisar) {
        this.pesquisar = pesquisar;
    }
}
