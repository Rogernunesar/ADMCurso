/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.ModeloTurmas;
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
    
    int idProf;
    int idCurso;
    
    public void Salvar(ModeloTurmas turmas){
         BuscarProf(turmas.getNomeprof());
         BuscaCursos(turmas.getNomecurso());
         conexao.conexao();
         
        try {
            PreparedStatement pstm = conexao.con.prepareStatement("Select max(idAluno)from alunos");
             conexao.result = pstm.executeQuery();
             conexao.result.next();
             int id = conexao.result.getInt(1);
             id++;
            PreparedStatement pst = conexao.con.prepareStatement("insert into turmas(idTurmas, idProf, idCurso, nomeTurmas, dataInicio, dataFinal, cargaHora)values(?,?,?,?,?,?,?)");
            pst.setInt(1, id);
            pst.setInt(2, idProf);
            pst.setInt(3, idCurso);
            pst.setString(4, turma.getNometurma());
            pst.setDate(5, new java.sql.Date(turma.getDatainicio().getTime()));
            pst.setDate(6, new java.sql.Date(turma.getDatafinal().getTime()));
            pst.setInt(7, turma.getCargahora());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Turma inserida com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar Turmas"+ex);
        }
       conexao.desconecta();
    }
    
    public void BuscarProf(String nomeProf){
       conexaoprof.conexao();
       conexaoprof.executaSql("select * from professores where nameProf='"+nomeProf+"'");
        try {
            conexaoprof.result.first();
            idProf = conexaoprof.result.getInt("idProf");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Professor não encontrado"+ex);
        }
        
    }
    
    public void BuscaCursos(String nomeCurso){
        conexaocurso.conexao();
       conexaocurso.executaSql("select * from cursos where nomeCurso='"+nomeCurso+"'");
        try {
            conexaocurso.result.first();
            idCurso = conexaocurso.result.getInt("idCurso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Curso não encontrado"+ex);
        }
       
    }   
}
