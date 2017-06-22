/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import Dao.ConexaoBD;
import Dao.AlunoDAO;
import Modelo.ModeloAluno;
import Modelo.ModeloTabela;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;



/**
 * @author Rogerio
 */
public class CadastroAluno extends javax.swing.JFrame {
     ModeloAluno mod = new ModeloAluno();
     AlunoDAO controle = new AlunoDAO();
     ConexaoBD conexao = new ConexaoBD();
     int flag = 0;
     public CadastroAluno() {
        initComponents();
        this.setTitle("CADASTRO DE ALUNO");
        preencherTabela("select * from alunos order by nomeAluno");
    }     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFIDaluno = new javax.swing.JTextField();
        jTextFNome = new javax.swing.JTextField();
        jTextFEmail = new javax.swing.JTextField();
        jTextFFone = new javax.swing.JTextField();
        jTextFNascmento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbNovo = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableAluno = new javax.swing.JTable();
        jTextFPesquisa = new javax.swing.JTextField();
        jbCancelar = new javax.swing.JButton();

        setForeground(java.awt.Color.white);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("CADASTRO DE ALUNO"));

        jTextFIDaluno.setEditable(false);
        jTextFIDaluno.setEnabled(false);

        jTextFNome.setEnabled(false);
        jTextFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFNomeActionPerformed(evt);
            }
        });

        jTextFEmail.setEnabled(false);

        jTextFFone.setEnabled(false);

        jTextFNascmento.setEnabled(false);

        jLabel1.setText("Codigo:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Email:");

        jLabel4.setText(" Nascimento:");

        jLabel5.setText("Fone:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTextFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFFone, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addContainerGap(84, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFIDaluno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(51, 51, 51)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextFNome))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jTextFNascmento, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFNascmento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFIDaluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbSalvar.setText("Salvar");
        jbSalvar.setEnabled(false);
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.setEnabled(false);
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbEditar.setText("Editar");
        jbEditar.setEnabled(false);
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbPesquisar.setText("Pesquisar");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        JTableAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        JTableAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableAlunoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableAluno);

        jbCancelar.setText("Cancelar");
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbPesquisar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbExcluir)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbPesquisar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        setSize(new java.awt.Dimension(680, 405));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
       flag= 1;   
       
       jTextFIDaluno.setEnabled(!true);
       jTextFNome.setEnabled(true);
       jTextFEmail.setEnabled(true);
       jTextFFone.setEnabled(true);
       jTextFNascmento.setEnabled(true);
        jTextFIDaluno.setText(" ");
        jTextFNome.setText("");
        jTextFEmail.setText("");
        jTextFFone.setText("");
        jTextFNascmento.setText("");
        BotaoNovo();

    }//GEN-LAST:event_jbNovoActionPerformed
    private void jTextFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFNomeActionPerformed
    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
         if(jTextFNome.getText().isEmpty()){//nao deixar o campos em branco
          JOptionPane.showMessageDialog(null, "Preencha o campo NOME para continuar!");
            jTextFNome.requestFocus();
          }else{ 
                if(jTextFEmail.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Preencha o campo EMAIL para continuar!!");
                jTextFEmail.requestFocus();
               } else{if(jTextFNome.getText().isEmpty()){
                   JOptionPane.showMessageDialog(null, "Preencha o campo FONE para continuar!");
                   jTextFFone.requestFocus();
                }else if(jTextFNascmento.getText().isEmpty()){
                         JOptionPane.showMessageDialog(null, "Preencha o campo NASCIMENTO para continuar!");
                         jTextFNascmento.requestFocus();
               
                }else
                     if(flag == 1)
              {

           // mod.setIdaluno(Integer.parseInt(jTextFIDaluno.getText()));
            mod.setNomealuno(jTextFNome.getText());
            mod.setEmailaluno(jTextFEmail.getText());
            mod.setFonealuno(jTextFFone.getText());
            mod.setNascaluno(Date.valueOf(jTextFNascmento.getText()));
            controle.Salvar(mod);
            jTextFIDaluno.setText(" ");
            jTextFNome.setText("");
            jTextFEmail.setText("");
            jTextFFone.setText("");
            jTextFNascmento.setText("");
            jTextFIDaluno.setEnabled(false);
            jTextFNome.setEnabled(false);
            jTextFEmail.setEnabled(false);
            jTextFFone.setEnabled(false);
            jTextFNascmento.setEnabled(false);
            BotaoSalvarflag1();
            preencherTabela("select * from alunos order by nomeAluno");//para atualizar a tabela
                     
        }else
        {
            //mod.setIdaluno(Integer.parseInt(jTextFIDaluno.getText()));
            mod.setNomealuno(jTextFNome.getText());
            mod.setEmailaluno(jTextFEmail.getText());
            mod.setFonealuno(jTextFFone.getText());
            mod.setNascaluno(Date.valueOf(jTextFNascmento.getText()));
            controle.Editar(mod);
            jTextFIDaluno.setText("");
            jTextFNome.setText("");
            jTextFEmail.setText("");
            jTextFFone.setText("");
            jTextFNascmento.setText("");
            jTextFIDaluno.setEnabled(false);
            jTextFNome.setEnabled(false);
            jTextFEmail.setEnabled(false);
            jTextFFone.setEnabled(false);
            jTextFNascmento.setEnabled(false);
            BotaoSalvarflag2();
            preencherTabela("select * from alunos order by nomeAluno");
                 
        
            }
        }
    }   
        
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        mod.setPesquisa(jTextFPesquisa.getText());
        ModeloAluno model = controle.buscarAluno(mod);
        
        jTextFIDaluno.setText(String.valueOf(model.getIdaluno()));
        jTextFNome.setText(model.getNomealuno());
        jTextFEmail.setText(model.getEmailaluno());
        jTextFFone.setText(model.getFonealuno());
        jTextFNascmento.setText(String.valueOf(model.getNascaluno()));
        preencherTabela("select * from alunos where nomeAluno like'%"+mod.getPesquisa()+"%'");
        jTextFIDaluno.setText("");
        if(jTextFNome.getText().isEmpty()){//nao deixar o campos em branco
            jTextFIDaluno.setText("");
            jTextFNome.setText("");
            jTextFEmail.setText("");
            jTextFFone.setText("");
            jTextFNascmento.setText("");
         jTextFPesquisa.requestFocus();
        BotaoPesquisar();
        }
  
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir");
        if(resposta == JOptionPane.YES_OPTION)
            mod.setIdaluno(Integer.parseInt((jTextFIDaluno.getText())));
            controle.Excluir(mod);
            jTextFIDaluno.setText("");
            jTextFNome.setText("");
            jTextFEmail.setText("");
            jTextFFone.setText("");
            jTextFNascmento.setText("");
            BotaoExcluir();   
            preencherTabela("select * from alunos order by nomeAluno");
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
       flag=2;
       
       jTextFIDaluno.setEnabled(false);
       jTextFNome.setEnabled(true);
       jTextFEmail.setEnabled(true);
       jTextFFone.setEnabled(true);
       jTextFNascmento.setEnabled(true);
       BotaoEditar();
      
  
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
       jTextFIDaluno.setEnabled(false);
       jTextFNome.setEnabled(!true);
       jTextFEmail.setEnabled(!true);
       jTextFFone.setEnabled(!true);
       jTextFNascmento.setEnabled(!true);
       
       jTextFIDaluno.setText("");
       jTextFNome.setText("");
       jTextFEmail.setText("");
       jTextFFone.setText("");
       jTextFNascmento.setText("");
       BotaoCancelar();
       
       
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void JTableAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableAlunoMouseClicked
        String nomeAluno = ""+JTableAluno.getValueAt(JTableAluno.getSelectedRow(),1);
        conexao.conexao();
        conexao.executaSql("select * from alunos where nomeAluno ='"+nomeAluno+"'");
         try {
             conexao.result.first();
             jTextFIDaluno.setText(String.valueOf(conexao.result.getInt("idAluno")));
             jTextFNome.setText(conexao.result.getString("nomeAluno"));
             jTextFEmail.setText(conexao.result.getString("emailAluno"));
             jTextFFone.setText(conexao.result.getString("foneAluno"));
             jTextFNascmento.setText(conexao.result.getString("nascAluno"));
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao selecionar dados"+ex);
         }
        
        
        conexao.desconecta();
        BotaoPesquisar();
    }//GEN-LAST:event_JTableAlunoMouseClicked
   
    //Declaração dos metodos para ativar e desativar os botões do formulario
    public void BotaoNovo()
    {
       jbSalvar.setEnabled(true);
       jbCancelar.setEnabled(true);
    }
    
       public void BotaoSalvarflag1()
    {
      jbSalvar.setEnabled(false);
      jbCancelar.setEnabled(false);
      jbEditar.setEnabled(false);
      jbExcluir.setEnabled(false);
    }
       public void BotaoSalvarflag2()
    {
      jbSalvar.setEnabled(false);
      jbNovo.setEnabled(true);
      jbCancelar.setEnabled(false);
    }
    
       public void BotaoEditar()
    {
       jbSalvar.setEnabled(true);
       jbNovo.setEnabled(true);
       jbCancelar.setEnabled(true);      
       jbEditar.setEnabled(false);
       jbNovo.setEnabled(false);
       jbExcluir.setEnabled(false);
    }
    
       public void BotaoCancelar()
    {
       jbSalvar.setEnabled(!true);
       jbCancelar.setEnabled(!true);
       jbNovo.setEnabled(true);
       jbEditar.setEnabled(false);
       jbExcluir.setEnabled(false);
    }
       
       public void BotaoExcluir()
    {
       jbEditar.setEnabled(false);
       jbNovo.setEnabled(true);
       jbExcluir.setEnabled(false);
    }
       
        public void BotaoPesquisar()
    {
      jbCancelar.setEnabled(true);
      jbEditar.setEnabled(true);
      jbExcluir.setEnabled(true);
    }
     
    public void preencherTabela(String sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"ID","Nome","Email","Fone","Nasc"};
        conexao.conexao();
        conexao.executaSql(sql);
        
        try
        {
           conexao.result.first();
           do{
              dados.add(new Object[]{conexao.result.getInt("idAluno"),conexao.result.getString("nomeAluno"), conexao.result.getString("emailAluno"), conexao.result.getString("foneAluno"), conexao.result.getString("nascAluno")});
              
             }while(conexao.result.next());
        }catch(SQLException ex)
        {
           JOptionPane.showMessageDialog(rootPane,"Digite outro nome");
                   
        }
        ModeloTabela modelo= new ModeloTabela(dados,colunas);
        
        JTableAluno.setModel(modelo);
        JTableAluno.getColumnModel().getColumn(0).setPreferredWidth(35);
        JTableAluno.getColumnModel().getColumn(0).setResizable(false);
        JTableAluno.getColumnModel().getColumn(1).setPreferredWidth(210);
        JTableAluno.getColumnModel().getColumn(1).setResizable(false);
        JTableAluno.getColumnModel().getColumn(2).setPreferredWidth(210);
        JTableAluno.getColumnModel().getColumn(2).setResizable(false);
        JTableAluno.getColumnModel().getColumn(3).setPreferredWidth(113);
        JTableAluno.getColumnModel().getColumn(3).setResizable(false);
        JTableAluno.getColumnModel().getColumn(4).setPreferredWidth(75);
        JTableAluno.getColumnModel().getColumn(4).setResizable(false);
        JTableAluno.getTableHeader().setReorderingAllowed(false);
        JTableAluno.setAutoResizeMode(JTableAluno.AUTO_RESIZE_OFF);
        JTableAluno.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conexao.desconecta();
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFEmail;
    private javax.swing.JTextField jTextFFone;
    private javax.swing.JTextField jTextFIDaluno;
    private javax.swing.JTextField jTextFNascmento;
    private javax.swing.JTextField jTextFNome;
    private javax.swing.JTextField jTextFPesquisa;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbSalvar;
    // End of variables declaration//GEN-END:variables
}
