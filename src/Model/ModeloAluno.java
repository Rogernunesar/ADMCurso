package Model;

import java.sql.Date;

/**
 *
 * @author Rogerio
 */
public class ModeloAluno {
    
    private int idaluno;
    private String nomealuno;
    private String emailaluno;
    private String fonealuno;
    private String nascaluno;
    private String pesquisa;
    

    public int getIdaluno() {
        return idaluno;
    }

    public void setIdaluno(int idaluno) {
        this.idaluno = idaluno;
    }

    public String getNomealuno() {
        return nomealuno;
    }

    public void setNomealuno(String nomealuno) {
        this.nomealuno = nomealuno;
    }

    public String getEmailaluno() {
        return emailaluno;
    }

    public void setEmailaluno(String emailaluno) {
        this.emailaluno = emailaluno;
    }

    public String getFonealuno() {
        return fonealuno;
    }

    public void setFonealuno(String fonealuno) {
        this.fonealuno = fonealuno;
    }

    public String getNascaluno() {
        return nascaluno;
    }

    public void setNascaluno(String nascaluno) {
        this.nascaluno = nascaluno;
    }

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
    
    
}
