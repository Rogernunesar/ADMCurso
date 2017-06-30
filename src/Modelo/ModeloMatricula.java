/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author Rogerio
 */
public class ModeloMatricula {
    private int idmatricula;
    private int mat_idAluno;
    private int mat_idTurmas;
    private Date datamatricula;
    private String nomealuno;
    private Date   nascaluno;
    private String nomeprofessor;
    private String nomecurso;
    private Date   datainicio;

    public int getIdmatricula() {
        return idmatricula;
    }

    public void setIdmatricula(int idmatricula) {
        this.idmatricula = idmatricula;
    }

    public int getMat_idAluno() {
        return mat_idAluno;
    }

    public void setMat_idAluno(int mat_idAluno) {
        this.mat_idAluno = mat_idAluno;
    }

    public int getMat_idTurmas() {
        return mat_idTurmas;
    }

    public void setMat_idTurmas(int mat_idTurmas) {
        this.mat_idTurmas = mat_idTurmas;
    }

    public Date getDatamatricula() {
        return datamatricula;
    }

    public void setDatamatricula(Date datamatricula) {
        this.datamatricula = datamatricula;
    }

    public String getNomealuno() {
        return nomealuno;
    }

    public void setNomealuno(String nomealuno) {
        this.nomealuno = nomealuno;
    }

    public Date getNascaluno() {
        return nascaluno;
    }

    public void setNascaluno(Date nascaluno) {
        this.nascaluno = nascaluno;
    }

    public String getNomeprofessor() {
        return nomeprofessor;
    }

    public void setNomeprofessor(String nomeprofessor) {
        this.nomeprofessor = nomeprofessor;
    }

    public String getNomecurso() {
        return nomecurso;
    }

    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }

    public Date getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(Date datainicio) {
        this.datainicio = datainicio;
    }
}
