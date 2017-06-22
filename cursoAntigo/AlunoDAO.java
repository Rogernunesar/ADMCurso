/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODELO.Aluno;
import java.sql.*;


/**
 *
 * @author Rogerio
 */
public class AlunoDAO {
    Aluno aluno;
    private PreparedStatement statement;
    public conectaBD          conectaBD; 
    private ResultSet         resultSet;
    private String            sql, msg;
    
    public  AlunoDAO()
    {
        conectaBD = new conectaBD();
    }
    
    public ResultSet localizar(String idAluno)
    {
        sql = "select * from alunos = "+idAluno;
        System.out.println(sql);
        try
        {
            statement = conectaBD.connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            resultSet.next();
            return resultSet;
        }
        catch (SQLException erro)
        {
         return resultSet;
        }
    }
    
    public String gravar(Aluno aluno )
    {
        this.aluno = aluno;
        
        msg = "Operação realizada com sucesso";
        
        try
        {
            sql= "insert into alunos(idAluno, nomeAluno, emailAluno, foneAluno, nascAluno) values (?,?,?,?,?)";
            statement = conectaBD.connection.prepareStatement(sql);
            statement.setInt   (1, aluno.getIdaluno());
            statement.setString(2, aluno.getNomeAluno());
            statement.setString(3, aluno.getEmailAluno());
            statement.setString(4, aluno.getFoneAluno());
            statement.setDate  (5, (Date) aluno.getNascAluno());
            if(statement.executeUpdate()==0)
            {
                msg = "Falha  na atualização";
            }    
        }
        catch (SQLException erro)
        {
            msg = "Falha na Operação  "+ erro.getMessage(); // caso ocorra algum erro
        }
        return msg;
    }
    
    public String alterar (Aluno aluno)
    {
        this.aluno = aluno;
        
         msg = "Operação realizada com sucesso";
        
        try
        {
            sql= "UPDATE alunos SET nomeAluno=?, emailAluno=?, foneAluno=?, nascAluno=? WHERE idAluno=? ";
            statement = conectaBD.connection.prepareStatement(sql);
            statement.setInt   (7, aluno.getIdaluno());
            statement.setString(1, aluno.getNomeAluno());
            statement.setString(2, aluno.getEmailAluno());
            statement.setString(3, aluno.getFoneAluno());
            statement.setDate  (4, (Date) aluno.getNascAluno());
            if(statement.executeUpdate()==0)
            {
                msg = "Falha  na atualização";
            }    
        }
        catch (SQLException erro)
        {
            msg = "Falha na Operação  "+ erro.toString(); // caso ocorra algum erro
        }
        return msg;
    }
    
    public String excluir(Aluno aluno)
    {
        this.aluno = aluno;
        
         msg = "Operação realizada com sucesso";
        
        try
        {
            sql= "delete from alunos where idAluno=?";
            statement = conectaBD.connection.prepareStatement(sql);
            statement.setInt(1, aluno.getIdaluno());
            if(statement.executeUpdate()==0)
            {
                msg = "Falha  na atualização";
            }    
        }
        catch (SQLException erro)
        {
            msg = "Falha na Operação  "+ erro.toString(); 
        }
        return msg; 
    }
}
 