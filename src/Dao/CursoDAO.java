/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.ModeloCursos;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Rogerio
 */
public class CursoDAO {
    ConexaoBD conect = new ConexaoBD();
    ModeloCursos mod = new ModeloCursos();
  
    
    public void salvar(ModeloCursos mod){
        conect.conexao();
        
        try {
            PreparedStatement pstm = conect.con.prepareStatement("Select max(idCurso)from cursos");
            conect.result = pstm.executeQuery();
            conect.result.next();
            int id = conect.result.getInt(1);
            id++ ;
            
            PreparedStatement psm = conect.con.prepareStatement("insert into cursos(idCurso, nomeCurso, reqbasico, cargaHora, precoCurso)values(?,?,?,?,?)");
             psm.setInt(1,id);
             psm.setString(2, mod.getNomecurso());
             psm.setString(3, mod.getReqbasico());
             psm.setInt(4, mod.getCargahora());
             psm.setDouble(5, mod.getPrecurso());
             psm.execute();
             
             JOptionPane.showMessageDialog(null, "Dados inseridos com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados"+ex);
        }
        
        conect.desconecta();
    }
   public ModeloCursos BuscarCurso (ModeloCursos mod){
      conect.conexao();
      
      conect.executaSql("select * from cursos where nomeCurso like'%"+mod.getPesquisar()+"%'");
      
        try {
            conect.result.first();
            mod.setIdcurso(conect.result.getInt("idCurso"));
            mod.setNomecurso(conect.result.getString("nomeCurso"));
            mod.setReqbasico(conect.result.getString("reqbasico"));
            mod.setCargahora(conect.result.getInt("cargahora"));
            mod.setPrecurso(conect.result.getDouble("precoCurso"));
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Curso não encontrado "+ex);
        }
        conect.desconecta();
        return mod;
    } 
   public void Editar(ModeloCursos mod){
        conect.conexao();
        
        try {
            PreparedStatement ptm = conect.con.prepareStatement("update cursos set nomeCurso=?, reqbasico=?, cargaHora=?, precoCurso=? where idCurso=?");
            ptm.setString(1, mod.getNomecurso());
            ptm.setString(2, mod.getReqbasico());
            ptm.setInt(3, mod.getCargahora());
            ptm.setDouble(4, mod.getPrecurso());
            ptm.setInt(5, mod.getIdcurso());
            ptm.execute();
            JOptionPane.showMessageDialog(null, "Dados editados com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao editar dados"+ex);
        }
        conect.desconecta();
    }
   public void Excluir (ModeloCursos mod){
        conect.conexao();
        
        try {
            PreparedStatement ptme = conect.con.prepareStatement("delete from cursos where idCurso=?");
            
            ptme.setInt(1, mod.getIdcurso());
            ptme.execute();
            JOptionPane.showMessageDialog(null, "Registro excluido com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro excluido com Sucesso"+ex);
        }
    }
}
