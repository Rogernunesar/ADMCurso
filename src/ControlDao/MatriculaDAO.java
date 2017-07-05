/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlDao;

import Model.ModeloMatricula;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Rogerio
 */
public class MatriculaDAO {
    ModeloMatricula modmat = new ModeloMatricula();
    ConexaoBD conexao = new ConexaoBD ();
    ConexaoBD conexaoaluno = new ConexaoBD();
    ConexaoBD conexaoturma = new ConexaoBD();
    int idTurmas; 
    int idAlunos;
    
    String nomTurma;
    String nomAluno;
    
    public void Salvar(ModeloMatricula matricula){
         buscaIdAluno(matricula.getNomealuno());
         buscaIdTurmas(matricula.getNomeTurma());
         conexao.conexao();
        
        try {
            PreparedStatement pstm = conexao.con.prepareStatement("Select max(idMatriculas)from matriculas");
             conexao.result = pstm.executeQuery();
             conexao.result.next();
             int id = conexao.result.getInt(1);
             id++;
            PreparedStatement pst = conexao.con.prepareStatement("insert into matriculas(idMatriculas, mat_idAluno, mat_idTurmas, data_Matricula, nascAluno, nomeProfessor, nomeCurso, inicioCurso)values(?,?,?,?,?,?,?,?)");
            pst.setInt(1, id);
            pst.setInt(2, idAlunos);
            pst.setInt(3, idTurmas);
            pst.setString(4, matricula.getDatamatricula());
            pst.setString(5, matricula.getNascaluno());
            pst.setString(6, matricula.getNomeprofessor());
            pst.setString(7, matricula.getNomecurso());
            pst.setString(8, matricula.getNascaluno());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Aluno Matriculado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar Matricula"+ex);
        }
       conexao.desconecta();
    }
    
    //buscar idAluno --------------------------------------------------------------------
    public void buscaIdTurmas(String nomeTurmas){
       conexaoturma.conexao();
       conexaoturma.executaSql("select * from turmas where nomeTurmas='"+nomeTurmas+"'");
        try {
            conexaoturma.result.first();
            idTurmas = conexaoturma.result.getInt("idTurmas");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar o idturmas"+ex);
        }
     
    } 
    //buscar idTurmas que return de um inteiro --------------------------------------------------------------------
    public int buscaIdrelatTurmas(String nomeTurmas){
       conexaoturma.conexao();
       conexaoturma.executaSql("select * from turmas where nomeTurmas='"+nomeTurmas+"'");
        try {
            conexaoturma.result.first();
            idTurmas = conexaoturma.result.getInt("idTurmas");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar o idturmas"+ex);
        }
        return idTurmas;
    } 
    //buscar idTurmas --------------------------------------------------------------------
    public void buscaIdAluno(String nomeAluno){
       conexao.conexao();
       conexao.executaSql("select * from alunos where nomeAluno='"+nomeAluno+"'");
        try {
            conexao.result.first();
            idAlunos = conexao.result.getInt("idAluno");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar o idaluno "+ex);
        }
       conexao.desconecta();
    } 
    //
   
    public void editarMatricula(ModeloMatricula matricula){
         buscaIdAluno(matricula.getNomealuno());
         buscaIdTurmas(matricula.getNomeTurma());
         conexao.conexao();

        try {

            PreparedStatement pst = conexao.con.prepareStatement("update matriculas set mat_idAluno=?, mat_idTurmas=?, data_Matricula=?, nascAluno=?, nomeProfessor=?, nomeCurso=?, inicioCurso=? where idMatriculas =?");
            pst.setInt(1, idAlunos);
            pst.setInt(2, idTurmas);
            pst.setString(3, matricula.getDatamatricula());
            pst.setString(4, matricula.getNascaluno());
            pst.setString(5, matricula.getNomeprofessor());
            pst.setString(6, matricula.getNomecurso());
            pst.setString(7,(matricula.getNascaluno()));
            pst.setInt(8,matricula.getIdmatricula());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Aluno Matriculado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar Matricula"+ex);
        }
       conexao.desconecta();
    }
     //--------------------------bruscar o nome do Alunos ---------------------------------------------------------------------
    public void buscarNomeAluno(int codAluno){
       
        conexaoaluno.conexao();
       
        try {
             conexaoaluno.executaSql("select *from alunos where idAluno="+codAluno);
            conexaoaluno.result.first();
            nomAluno= conexaoaluno.result.getString("nomeAluno");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar o nome do Aluno"+ex);
        }
                conexaoaluno.desconecta();
    }
    //--------------------------bruscar o nome do Turmas ---------------------------------------------------------------------
    public void buscarNomeTurmas(int codTurmas){
       
        conexaoturma.conexao();
       
        try {
             conexaoturma.executaSql("select *from turmas where idTurmas="+codTurmas);
            conexaoturma.result.first();
            nomTurma= conexaoturma.result.getString("nomeTurmas");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar o nome do Turma"+ex);
        }
                conexaoturma.desconecta();
    }
    
    public ModeloMatricula buscarMatricula (ModeloMatricula modMatricula){
      conexao.conexao();

        try {
            conexao.executaSql("select * from matriculas where idMatriculas like'%"+modMatricula.getPesquisar()+"%'");
            conexao.result.first();
            modmat.setIdmatricula(conexao.result.getInt("idMatriculas"));
            buscarNomeTurmas(conexao.result.getInt("mat_idTurmas"));
            buscarNomeAluno(conexao.result.getInt("mat_idAluno"));
            modmat.setDatamatricula(conexao.result.getString("data_Matricula"));
            modmat.setNascaluno(conexao.result.getString("nascAluno"));
            modmat.setNomeprofessor(conexao.result.getString("nomeProfessor"));
            modmat.setNomecurso(conexao.result.getString("nomeCurso"));
            modmat.setDatainicio(conexao.result.getString("inicioCurso"));
            modmat.setNomealuno(nomTurma);
            modmat.setNomeTurma(nomAluno);      
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao buscar Matricula !!!!!!! "+ex);
        }
        conexao.desconecta();
        return modMatricula;
    }
     public void excluirMatriculas (ModeloMatricula modmat){
        conexao.conexao();
        
        try {
            PreparedStatement ptm = conexao.con.prepareStatement("delete from matriculas where idMatriculas=?");
            
            ptm.setInt(1, modmat.getIdmatricula());
            ptm.execute();
            JOptionPane.showMessageDialog(null, "Registro excluido com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro excluido com Sucesso"+ex);
        }
    }
}
