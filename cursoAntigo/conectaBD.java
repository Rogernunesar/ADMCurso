/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.*;

/**
 *
 * @author Rogerio
 */
public class conectaBD {
    public Connection connection = null;
    private final String DBNAME = "banco";
    
    private final String DRIVER="com.mysql.jdbc.Driver";
    private final String URL="jdbc:mysql://localhost:3306/admcursos?zeroDateTimeBehavior=convertToNull";
    private final String LOGIN="root";
    private final String SENHA="";
   
    
    public boolean getConnection()
    {
        try
        {
            //abre a conexão com banco de dados
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL,LOGIN,SENHA);
            System.out.println("Conectou");
            return true;
        }
        catch  (ClassNotFoundException erro)
        {
            System.out.println("Driver não Encontrado; "+erro.toString());
            return false;
        }
        catch (SQLException erro)
        {
            System.out.println("Falha ao Conectar; "+erro.toString());  
            return false;           
        }  
    } 
    public void close()
    {
        try
        {
            connection.close();
            System.out.println("Desconectou");
        }
        catch (SQLException erro)
        {
        }
    }  
}