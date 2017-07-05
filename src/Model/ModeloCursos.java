/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Rogerio
 */
public class ModeloCursos {
    private int idcurso;
    private String nomecurso;
    private String reqbasico;
    private Integer cargahora;
    private double precurso;
    private String pesquisar;

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    public String getNomecurso() {
        return nomecurso;
    }

    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }

    public String getReqbasico() {
        return reqbasico;
    }

    public void setReqbasico(String reqbasico) {
        this.reqbasico = reqbasico;
    }

    public Integer getCargahora() {
        return cargahora;
    }

    public void setCargahora(Integer cargahora) {
        this.cargahora = cargahora;
    }

    public double getPrecurso() {
        return precurso;
    }

    public void setPrecurso(double precurso) {
        this.precurso = precurso;
    }

    public String getPesquisar() {
        return pesquisar;
    }

    public void setPesquisar(String pesquisar) {
        this.pesquisar = pesquisar;
    }
}
