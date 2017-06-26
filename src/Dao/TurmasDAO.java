/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.ModeloTurmas;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rogerio
 */
public class TurmasDAO {
    ModeloTurmas turma = new ModeloTurmas();
    ConexaoBD  conexao = new ConexaoBD();
    ConexaoBD conexaoprof = new ConexaoBD();
    ConexaoBD conexaocurso = new ConexaoBD();
    
    String nomProf;
    String nomeCurso;
    int idProf;
    int idCurso;
    
    public void Salvar(ModeloTurmas turmas){
         buscarIdProf(turmas.getNomeprof());
         buscaIdCursos(turmas.getNomecurso());
         conexao.conexao();
         
        try {
            PreparedStatement pstm = conexao.con.prepareStatement("Select max(idTurmas)from turmas");
             conexao.result = pstm.executeQuery();
             conexao.result.next();
             int id = conexao.result.getInt(1);
             id++;
            PreparedStatement pst = conexao.con.prepareStatement("insert into turmas(idTurmas, idProf, idCurso, nomeTurmas, dataInicio, dataFinal, cargaHora)values(?,?,?,?,?,?,?)");
            pst.setInt(1, id);
            pst.setInt(2, idProf);
            pst.setInt(3, idCurso);
            pst.setString(4, turmas.getNometurma());
            pst.setDate(5, new java.sql.Date(turmas.getDatainicio().getTime()));
            pst.setDate(6, new java.sql.Date(turmas.getDatafinal().getTime()));
            pst.setInt(7, turmas.getCargahora());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Turma inserida com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar Turmas"+ex);
        }
       conexao.desconecta();
    }
    
     public void EditarTurmas(ModeloTurmas turmas){
         buscarIdProf(turmas.getNomeprof());
         buscaIdCursos(turmas.getNomecurso());
         conexao.conexao();
         
        try {
           
            PreparedStatement pst = conexao.con.prepareStatement("update turmas set idProf=?, idCurso=?, nomeTurmas=?, dataInicio=?, dataFinal=?, cargaHora=? where idTurmas=?");
            
            pst.setInt(1, idProf);
            pst.setInt(2, idCurso);
            pst.setString(3, turmas.getNometurma());
            pst.setDate(4, new java.sql.Date(turmas.getDatainicio().getTime()));
            pst.setDate(5, new java.sql.Date(turmas.getDatafinal().getTime()));
            pst.setInt(6, turmas.getCargahora());
            pst.setInt(7, turmas.getIdturmas());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Turmas alterados com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar alteração de Turmas "+ex);
        }
       conexao.desconecta();
    }
     
     public ModeloTurmas buscarTurmas (ModeloTurmas modturma){
      conexao.conexao();

        try {
            conexao.executaSql("select * from turmas where nomeTurmas like'%"+modturma.getPesquisar()+"%'");
            conexao.result.first();
            modturma.setIdturmas(conexao.result.getInt("idTurmas"));
            buscarNomeProf(conexao.result.getInt("idProf"));
            buscarNomeCurso(conexao.result.getInt("idCurso"));
            modturma.setNometurma(conexao.result.getString("nomeTurmas"));
            modturma.setDatainicio(conexao.result.getDate("dataInicio"));
            modturma.setDatafinal(conexao.result.getDate("dataFinal"));
            modturma.setCargahora(conexao.result.getInt("cargaHora"));
            modturma.setNomeprof(nomProf);
            modturma.setNomecurso(nomeCurso);      
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao buscar Turma  "+ex);
        }
        conexao.desconecta();
        return modturma;
    }
    public void buscarIdProf(String noProf){
       conexao.conexao();
       conexao.executaSql("select *from professores where nomeProf='"+noProf+"'");
        try {
            conexao.result.first();
            idProf = conexao.result.getInt("idProf");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar o Codigo do Professor "+ex);
        }
        conexao.desconecta();
    }
    
    public void buscarNomeProf(int codProf){
        conexaoprof.conexao();
       
        try {
             conexaoprof.executaSql("select *from professores where idProf="+codProf);
            conexaoprof.result.first();
            nomProf = conexaoprof.result.getString("nomeProf");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar o nome do Professor"+ex);
        }
        conexaoprof.desconecta();
    }
    
    public void buscaIdCursos(String nomeCurso){
        conexao.conexao();
       conexao.executaSql("select * from cursos where nomeCurso='"+nomeCurso+"'");
        try {
            conexao.result.first();
            idCurso = conexao.result.getInt("idCurso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar o nome do Curso"+ex);
        }
       conexao.desconecta();
    } 
    
    public void buscarNomeCurso(int codCurso){
        conexaocurso.conexao();
       
        try {
             conexaocurso.executaSql("select * from cursos where idCurso="+codCurso);
            conexaocurso.result.first();
            nomeCurso = conexaocurso.result.getString("nomeCurso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar o codigo do Curso"+ex);
        }
        conexaocurso.desconecta();
    }
    
    public void excluirTurmas (ModeloTurmas mod){
        conexao.conexao();
        
        try {
            PreparedStatement ptm = conexao.con.prepareStatement("delete from turmas where idTurmas=?");
            
            ptm.setInt(1, mod.getIdturmas());
            ptm.execute();
            JOptionPane.showMessageDialog(null, "Registro excluido com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro excluido com Sucesso"+ex);
        }
    }
}
