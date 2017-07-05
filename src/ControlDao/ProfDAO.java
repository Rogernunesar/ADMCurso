/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlDao;

import Model.ModeloProf;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Rogerio
 */
public class ProfDAO {
    ConexaoBD conect = new ConexaoBD();
    ModeloProf mod = new ModeloProf();
    
    public void salvar(ModeloProf mod){
        conect.conexao();
        
        try {
            PreparedStatement pstm = conect.con.prepareStatement("Select max(idProf)from professores");
            conect.result = pstm.executeQuery();
            conect.result.next();
            int id = conect.result.getInt(1);
            id++ ;
            
            PreparedStatement psm = conect.con.prepareStatement("insert into professores(idProf, nomeProf, emailProf, valorHora, formacao)values(?,?,?,?,?)");
             psm.setInt(1,id);
             psm.setString(2, mod.getNomeprof());
             psm.setString(3, mod.getEmailprof());
             psm.setString(4, mod.getValorhora());
             psm.setString(5, mod.getFormacao());
             psm.execute();
             
             JOptionPane.showMessageDialog(null, "Dados inseridos com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados"+ex);
        }
        
        conect.desconecta();
    }
    public ModeloProf BuscarProf (ModeloProf mod){
      conect.conexao();
      
      conect.executaSql("select * from professores where nomeProf like'%"+mod.getPesquisar()+"%'");
      
        try {
            conect.result.first();
            mod.setIdprofessor(conect.result.getInt("idProf"));
            mod.setNome(conect.result.getString("nomeProf"));
            mod.setEmail(conect.result.getString("emailProf"));
            mod.setValorhora(conect.result.getString("valorHora"));
            mod.setFormacao(conect.result.getString("formacao"));
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Professor não encontrado ");
        }
        conect.desconecta();
        return mod;
    }
    
    public void Editar(ModeloProf mod){
        conect.conexao();
        
        try {
            PreparedStatement ptm = conect.con.prepareStatement("update professores set nomeProf=?, emailProf=?, valorHora=?, formacao=? where idProf=?");
            ptm.setString(1, mod.getNomeprof() );
            ptm.setString(2, mod.getEmailprof());
            ptm.setString(3, mod.getValorhora());
            ptm.setString(4, mod.getFormacao());
            ptm.setInt(5, mod.getIdprofessor());
            ptm.execute();
            JOptionPane.showMessageDialog(null, "Dados editados com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao editar dados"+ex);
        }
        conect.desconecta();
    }
    public void Excluir (ModeloProf mod){
        conect.conexao();
        
        try {
            PreparedStatement ptme = conect.con.prepareStatement("delete from professores where idProf=?");
            
            ptme.setInt(1, mod.getIdprofessor() );
            ptme.execute();
            JOptionPane.showMessageDialog(null, "Registro excluido com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro excluido com Sucesso"+ex);
        }
    }
}
