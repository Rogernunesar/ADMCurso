/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.ModeloUser;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Rogerio
 */
public class UserDAO {
    ConexaoBD conect = new ConexaoBD();
    ModeloUser mod = new ModeloUser();
    
  public void Salvar(ModeloUser mod)
    {
        conect.conexao();
        try {
            PreparedStatement pst = conect.con.prepareStatement("insert into usuario (nameUse, senhaUse, tipoUser)values(?,?,?)");
            pst.setString(1, mod.getNomeuser());
            pst.setString(2, mod.getSenhauser());
            pst.setString(3, mod.getTipouser());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Dados Inseridos com Sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados! /nErro"+ex);
        }
        
        conect.desconecta();
    }  
    public void Editar(ModeloUser mod)
   {
       conect.conexao(); 
       try
        {
            PreparedStatement pst = conect.con.prepareStatement("UPDATE usuario SET  nameUse=?, senhaUse=?, tipoUser=? WHERE idUse=?");
            
            pst.setString(1, mod.getNomeuser());
            pst.setString(2, mod.getSenhauser());
            pst.setString(3, mod.getTipouser());
            pst.setInt(4, mod.getIduser());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar dados /nErro"+ex);
        }
       
       conect.desconecta();
   }
     public ModeloUser buscarUser(ModeloUser mod)
    {
        conect.conexao();
        conect.executaSql("select * from usuario where nameUse like'%"+mod.getPesquisa()+"%'");
        
        try {
            conect.result.first();
            mod.setIduser(conect.result.getInt("idUse"));
            mod.setNomeuser(conect.result.getString("nameUse"));
            mod.setSenhauser(conect.result.getString("senhaUse"));
            mod.setTipouser(conect.result.getString("tipoUser"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuário não encontrado");
        }
        
        conect.desconecta();
        return mod;
    }
     public void Excluir(ModeloUser mod)
    {
        conect.conexao();
        
        try
        {
            PreparedStatement pst = conect.con.prepareStatement("delete from usuario where idUse=?");
            pst.setInt(1, mod.getIduser());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso");
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados /nErro"+ex);
        }
        conect.desconecta();
    }
    
}
