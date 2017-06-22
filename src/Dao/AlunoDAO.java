/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.ModeloAluno;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Rogerio
 */
public class AlunoDAO {
    
    ConexaoBD conect = new ConexaoBD();
    ModeloAluno mod = new ModeloAluno();

    
    public void Salvar(ModeloAluno mod)
    {
        conect.conexao();
        try {
            PreparedStatement pstm = conect.con.prepareStatement("Select max(idAluno)from alunos");
             conect.result = pstm.executeQuery();
             conect.result.next();
             int id = conect.result.getInt(1);
             id++;
            PreparedStatement pst = conect.con.prepareStatement("insert into alunos (idAluno, nomeAluno, emailAluno, foneAluno, nascAluno)values(?,?,?,?,?)");
            pst.setInt(1, id);
            pst.setString(2, mod.getNomealuno());
            pst.setString(3, mod.getEmailaluno());
            pst.setString(4, mod.getFonealuno());
            pst.setDate(5, (mod.getNascaluno()));
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Dados Inseridos com Sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados! /nErro"+ex);
        }
        
        conect.desconecta();
    }
    
    
    public ModeloAluno buscarAluno(ModeloAluno mod)
    {
        conect.conexao();
        conect.executaSql("select * from alunos where nomeAluno like'%"+mod.getPesquisa()+"%'");
        
        try {
            conect.result.first();
            mod.setIdaluno(conect.result.getInt("idAluno"));
            mod.setNomealuno(conect.result.getString("nomeAluno"));
            mod.setEmailaluno(conect.result.getString("emailAluno"));
            mod.setFonealuno(conect.result.getString("foneAluno"));
            mod.setNascaluno(conect.result.getDate("nascAluno"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Aluno não encontrado");
        }
        
        conect.desconecta();
        return mod;
    }
    
   public void Excluir(ModeloAluno mod)
    {
        conect.conexao();
        
        try
        {
            PreparedStatement pst = conect.con.prepareStatement("delete from alunos where idAluno=?");
            pst.setInt(1, mod.getIdaluno());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso");
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados /nErro"+ex);
        }
        conect.desconecta();
    }
    
   public void Editar(ModeloAluno mod)
   {
       conect.conexao(); 
       try
        {
            PreparedStatement pst = conect.con.prepareStatement("UPDATE alunos SET  nomeAluno=?, emailAluno=?, foneAluno=?, nascAluno=? WHERE idAluno=?");
            
            pst.setString(1, mod.getNomealuno());
            pst.setString(2, mod.getEmailaluno());
            pst.setString(3, mod.getFonealuno());
            pst.setDate(4, mod.getNascaluno());
            pst.setInt(5, mod.getIdaluno());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar dados /nErro"+ex);
        }
       
       conect.desconecta();
   }  
   
}
