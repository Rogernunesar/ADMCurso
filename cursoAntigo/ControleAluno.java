/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLE;

import DAO.AlunoDAO;
import MODELO.Aluno;
import java.sql.ResultSet;

/**
 *
 * @author Rogerio
 */
public class ControleAluno {
    
    public Aluno      aluno;
    public AlunoDAO   daoAluno;
    private ResultSet resultSet; 
    
    public ControleAluno()
    {
        aluno    = new Aluno();
        daoAluno = new AlunoDAO();
    }
    
    public boolean localizar(Aluno aluno)
    {
        try
        {
            System.out.println(String.valueOf(aluno.getIdaluno()));
            resultSet = daoAluno.localizar(String.valueOf(aluno.getIdaluno()));
            aluno.setIdaluno(resultSet.getInt(1));
            aluno.setNomeAluno(resultSet.getString(2));
            aluno.setEmailAluno(resultSet.getString(3));
            aluno.setFoneAluno(resultSet.getString(4));
            aluno.setNascAluno(resultSet.getDate(2));
            System.out.println(resultSet.getString(2));
            return true; //ocorreu tudo certo    
        }
        catch(Exception erro)  
        {
            System.out.println(erro.getMessage());
            return false; // caso ocorra um erro retorna false para a função de localizar
        }
    }
    
    public String gravar(Aluno aluno)
    {
        return daoAluno.gravar(aluno);
    }
    
    public String alterar(Aluno aluno)
    {
        return daoAluno.alterar(aluno);
    }
    
    public String excluir(Aluno aluno)
    {
        return daoAluno.excluir(aluno);
    }
    
}
