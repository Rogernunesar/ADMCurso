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
public class ModeloUser {
    private int iduser;
    private String nomeuser;
    private String senhauser;
    private String tipouser;
    private String pesquisa;

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }
    
    public String getNomeuser(){
       return nomeuser;
    }
    
    public void setNomeuser(String nomeuser){
       this.nomeuser = nomeuser;
    }
    
    public String getSenhauser(){
       return senhauser;
    }
    
    public void setSenhauser(String senhauser){
       this.senhauser = senhauser;
    }
    
    public String getTipouser(){
        return tipouser;   
    }
    
    public void setTipouser(String tipouser){
         this.tipouser = tipouser;
    }

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisar) {
        this.pesquisa = pesquisar;
    }
}
