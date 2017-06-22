/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Dao.ConexaoBD;
import Dao.CursoDAO;
import Modelo.ModeloCursos;
import Modelo.ModeloTabela;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Rogerio
 */
public class CadastroCurso extends javax.swing.JFrame {
      ConexaoBD conexao = new ConexaoBD();
     ModeloCursos mod = new ModeloCursos();
     CursoDAO  controle = new CursoDAO();
     int flag = 0;
    
    public CadastroCurso() {
        initComponents();
        preencherTabela("select * from cursos order by nomeCurso");
        this.setTitle("CADASTRAR CURSO");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbEditar = new javax.swing.JButton();
        jbPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableCursos = new javax.swing.JTable();
        jbCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextFNomeCurso = new javax.swing.JTextField();
        jTextFReqBasico = new javax.swing.JTextField();
        jTextFCargaHora = new javax.swing.JTextField();
        jTextFPreco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFIdCurso = new javax.swing.JTextField();
        jbNovo = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jTextFPesquisa = new javax.swing.JTextField();

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

        JTableCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        JTableCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableCursosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableCursos);

        jbCancelar.setText("Cancelar");
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTextFNomeCurso.setEnabled(false);
        jTextFNomeCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFNomeCursoActionPerformed(evt);
            }
        });

        jTextFReqBasico.setEnabled(false);
        jTextFReqBasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFReqBasicoActionPerformed(evt);
            }
        });

        jTextFCargaHora.setEnabled(false);

        jTextFPreco.setEnabled(false);

        jLabel2.setText("Curso:");

        jLabel3.setText("Requisito Básico");

        jLabel4.setText("Preço :");

        jLabel5.setText("Carga Horária");

        jLabel1.setText("Codigo:");

        jTextFIdCurso.setEditable(false);
        jTextFIdCurso.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFIdCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFCargaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFReqBasico, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextFIdCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFNomeCurso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFCargaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFReqBasico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 44, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbNovo)
                        .addGap(18, 18, 18)
                        .addComponent(jbSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jbCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jbEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jbExcluir))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbPesquisar)
                    .addComponent(jTextFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(578, 476));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        flag = 2;
        jTextFNomeCurso.setEnabled(true);
        jTextFReqBasico.setEnabled(true);
        jTextFPreco.setEnabled(true);
        jTextFCargaHora.setEnabled(true);
        BotaoEditar();
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
       mod.setPesquisar(jTextFPesquisa.getText());
               ModeloCursos modelo = controle.BuscarCurso(mod);
               
               jTextFIdCurso.setText(String.valueOf(modelo.getIdcurso()));
               jTextFNomeCurso.setText(modelo.getNomecurso());
               jTextFReqBasico.setText(modelo.getReqbasico());
               jTextFCargaHora.setText(String.valueOf(modelo.getCargahora()));
               jTextFPreco.setText(String.valueOf(modelo.getPrecurso()));
               jbCancelar.setEnabled(false);
               BotaoPesquisar();
               preencherTabela("select * from cursos where nomeCurso like'%"+mod.getPesquisar()+"%'");
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void JTableCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableCursosMouseClicked
        String nomeCursos= ""+JTableCursos.getValueAt(JTableCursos.getSelectedRow(), 1);
        conexao.conexao();
        conexao.executaSql("select * from cursos where nomeCurso = '"+nomeCursos+"'");

        try {
            conexao.result.first();
            jTextFIdCurso.setText(String.valueOf(conexao.result.getInt("idCurso")));
            jTextFNomeCurso.setText(conexao.result.getString("nomeCurso"));
            jTextFReqBasico.setText(conexao.result.getString("reqbasico"));
            jTextFCargaHora.setText(String.valueOf(conexao.result.getString("cargaHora")));
            jTextFPreco.setText(String.valueOf(conexao.result.getString("precoCurso")));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao selecionar dados"+ex);
        }
        conexao.desconecta();
        BotaoPesquisar();
    }//GEN-LAST:event_JTableCursosMouseClicked

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed

        jTextFNomeCurso.setEnabled(!true);
        jTextFReqBasico.setEnabled(!true);
        jTextFPreco.setEnabled(!true);
        jTextFCargaHora.setEnabled(!true);

        jTextFNomeCurso.setText("");
        jTextFReqBasico.setText("");
        jTextFPreco.setText("");
        jTextFCargaHora.setText("");
        jTextFIdCurso.setText("");
        BotaoCancelar();

    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        flag = 1;
        jTextFNomeCurso.setEnabled(true);
        jTextFReqBasico.setEnabled(true);
        jTextFPreco.setEnabled(true);
        jTextFCargaHora.setEnabled(true);
        jbSalvar.setEnabled(true);
        BotaoNovo();

    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        if(jTextFNomeCurso.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo CURSO para continuar");
            jTextFNomeCurso.requestFocus();
        }else{
            if(jTextFPreco.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Preencha o campo PREÇO DO CURSO para continuar");
                jTextFPreco.requestFocus();
            }else {
                    if(jTextFCargaHora.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Preencha o campo CARGA HORÁRIA  para continuar");
                        jTextFCargaHora.requestFocus();
            
                 }else{
                       if(jTextFReqBasico.getText().isEmpty()){
                       JOptionPane.showMessageDialog(null, "Preencha o campo REQUISITO BÁSICO para continuar");
                        jTextFReqBasico.requestFocus();
               

                    }else{

                        if(flag ==1)
                        {
                            mod.setNomecurso(jTextFNomeCurso.getText());
                            mod.setReqbasico(jTextFReqBasico.getText());
                            mod.setCargahora(Integer.valueOf(jTextFCargaHora.getText()));
                            mod.setPrecurso(Double.valueOf(jTextFPreco.getText()));
                            
                            controle.salvar(mod);
                            jTextFIdCurso.setText("");
                            jTextFNomeCurso.setText("");
                            jTextFReqBasico.setText("");
                            jTextFPreco.setText("");
                            jTextFCargaHora.setText("");
                            jTextFNomeCurso.setEnabled(false);
                            jTextFReqBasico.setEnabled(false);
                            jTextFPreco.setEnabled(false);
                            jTextFCargaHora.setEnabled(false);
                            BotaoSalvarflag1();
                          preencherTabela("select * from cursos order by nomeCurso");

                        } else{
                            mod.setNomecurso(jTextFNomeCurso.getText());
                            mod.setReqbasico(jTextFReqBasico.getText());
                            mod.setCargahora(Integer.valueOf(jTextFCargaHora.getText()));
                            mod.setPrecurso(Double.valueOf(jTextFPreco.getText()));
                            controle.Editar(mod);
                            jTextFIdCurso.setText("");
                            jTextFNomeCurso.setText("");
                            jTextFReqBasico.setText("");
                            jTextFPreco.setText("");
                            jTextFCargaHora.setText("");
                            jTextFNomeCurso.setEnabled(false);
                            jTextFReqBasico.setEnabled(false);
                            jTextFPreco.setEnabled(false);
                            jTextFCargaHora.setEnabled(false);
                            BotaoSalvarflag1();
                         preencherTabela("select * from cursos order by nomeCurso");
                        }
                    }
                }

            }
        }

    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
       int resposta = 0;
          resposta = JOptionPane.showConfirmDialog(rootPane,"Deseja relmente excluir o Curso");
          if(resposta == JOptionPane.YES_OPTION)
              mod.setIdcurso(Integer.valueOf(jTextFIdCurso.getText()));
              controle.Excluir(mod);
              jTextFIdCurso.setText("");
              jTextFNomeCurso.setText("");
              jTextFReqBasico.setText("");
              jTextFCargaHora.setText("");
              jTextFPreco.setText("");
              BotaoExcluir();
              preencherTabela("select * from cursos order by nomeCurso");
        
    }//GEN-LAST:event_jbExcluirActionPerformed
public void preencherTabela(String sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"ID", "Curso", "Requisitos", "Carga", "Preço"};
        conexao.conexao();
        conexao.executaSql(sql);
        
         try {
             conexao.result.first();
             do{
                dados.add(new Object[]{conexao.result.getInt("idCurso"),conexao.result.getString("nomeCurso"),conexao.result.getString("reqbasico"), conexao.result.getString("cargahora"), conexao.result.getString("precoCurso")});  
             }while(conexao.result.next());
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Digite outro nome");
         }
         ModeloTabela modelo = new ModeloTabela(dados, colunas);
         
         JTableCursos.setModel(modelo);
         JTableCursos.getColumnModel().getColumn(0).setPreferredWidth(35);
         JTableCursos.getColumnModel().getColumn(0).setResizable(false);
         JTableCursos.getColumnModel().getColumn(1).setPreferredWidth(150);
         JTableCursos.getColumnModel().getColumn(1).setResizable(false);
         JTableCursos.getColumnModel().getColumn(2).setPreferredWidth(220);
         JTableCursos.getColumnModel().getColumn(2).setResizable(false);
         JTableCursos.getColumnModel().getColumn(3).setPreferredWidth(70);
         JTableCursos.getColumnModel().getColumn(3).setResizable(false);
         JTableCursos.getColumnModel().getColumn(4).setPreferredWidth(70);
         JTableCursos.getColumnModel().getColumn(4).setResizable(false);
         JTableCursos.getTableHeader().setReorderingAllowed(false);
         JTableCursos.setAutoResizeMode(JTableCursos.AUTO_RESIZE_OFF);
         JTableCursos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
         conexao.desconecta();
         
         
    }

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
       jbCancelar.setEnabled(!true);
       jbExcluir.setEnabled(false);
    }
       
        public void BotaoPesquisar()
    {
      jbCancelar.setEnabled(true);
      jbEditar.setEnabled(true);
      jbExcluir.setEnabled(true);
    }
    private void jTextFNomeCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFNomeCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFNomeCursoActionPerformed

    private void jTextFReqBasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFReqBasicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFReqBasicoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CadastroCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableCursos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFCargaHora;
    private javax.swing.JTextField jTextFIdCurso;
    private javax.swing.JTextField jTextFNomeCurso;
    private javax.swing.JTextField jTextFPesquisa;
    private javax.swing.JTextField jTextFPreco;
    private javax.swing.JTextField jTextFReqBasico;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbSalvar;
    // End of variables declaration//GEN-END:variables
}