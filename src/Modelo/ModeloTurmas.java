/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 * 
 * 
 *
 * @author Rogerio
 */
public class ModeloTurmas {
    private int idturmas;
    private String nomeprof;
    private String nomecurso;
    private String nometurma;
    private Date   datainicio;
    private Date   datafinal;
    private int    cargahora;
    private String pesquisar;

    public int getIdturmas() {
        return idturmas;
    }

    public void setIdturmas(int idturmas) {
        this.idturmas = idturmas;
    }

    public String getNomeprof() {
        return nomeprof;
    }

    public void setNomeprof(String nomeprof) {
        this.nomeprof = nomeprof;
    }

    public String getNomecurso() {
        return nomecurso;
    }

    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }

    public String getNometurma() {
        return nometurma;
    }

    public void setNometurma(String nometurma) {
        this.nometurma = nometurma;
    }

    public Date getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(Date datainicio) {
        this.datainicio = datainicio;
    }

    public Date getDatafinal() {
        return datafinal;
    }

    public void setDatafinal(Date datafinal) {
        this.datafinal = datafinal;
    }

    public int getCargahora() {
        return cargahora;
    }

    public void setCargahora(int cargahora) {
        this.cargahora = cargahora;
    }

    public String getPesquisar() {
        return pesquisar;
    }

    public void setPesquisar(String pesquisar) {
        this.pesquisar = pesquisar;
    }
    
}
