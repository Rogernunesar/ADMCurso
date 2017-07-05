/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlDao;

import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Rogerio
 */
public class ConexaoBD {
   public Statement stm;
   public ResultSet result;
   private String driver ="com.mysql.jdbc.Driver";
   private String URL ="jdbc:mysql://localhost:3306/admcursos?zeroDateTimeBehavior=convertToNull";
   private String usuario = "root";
   private String senha=  "";
    Connection con;
    
    public void conexao()
    {
        
       try {
           System.setProperty("jdbc.Drivers", driver);
           con = DriverManager.getConnection(URL, usuario, senha);
           System.out.println("Conectado com sucesso!!");
       } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "Erro ao se conectar com o banco de dados"+ex);
       }
    }
    public void executaSql(String sql)
    {
       try {    
           stm = con.createStatement(result.TYPE_SCROLL_SENSITIVE,result.CONCUR_READ_ONLY);// O TYPE_SCROLL_INSENSITIVE e para diferir maisculo do minusculos e CUNCUR_READ_ONLY para correr tanto inicio quanto do final
           result= stm.executeQuery(sql);
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Erro ao executar SQL"+ex.getMessage());
       }
    
    }
    
    public void desconecta()
    {
       try {
           con.close();
           System.out.println("Banco de Dados Desconectado");
           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao desconectar o banco de dados \n"+ex.getMessage());
       }
        
    }
            
}
