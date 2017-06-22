/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.util.Date;

/**
 *
 * @author Rogerio
 */
public class Aluno {
    private int    idaluno;
    private String nomeAluno;
    private String emailAluno;
    private String foneAluno;
    private Date   nascAluno;

    public int getIdaluno() {
        return idaluno;
    }

    public void setIdaluno(int idaluno) {
        this.idaluno = idaluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getEmailAluno() {
        return emailAluno;
    }

    public void setEmailAluno(String emailAluno) {
        this.emailAluno = emailAluno;
    }

    public String getFoneAluno() {
        return foneAluno;
    }

    public void setFoneAluno(String foneAluno) {
        this.foneAluno = foneAluno;
    }

    public Date getNascAluno() {
        return nascAluno;
    }

    public void setNascAluno(Date nascAluno) {
        this.nascAluno = nascAluno;
    }
    
    
}
