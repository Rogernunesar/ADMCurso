/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import Dao.ConexaoBD;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rogerio
 */
public class TelaPrinciapal extends javax.swing.JFrame {
      ConexaoBD conexao = new ConexaoBD();
      CadastroAluno telaluno= new CadastroAluno();
      CadastroProf telaprof= new CadastroProf();
      CadastroCurso telacurso= new CadastroCurso();
      CadastroUser telauser= new CadastroUser();
      TelaLogin telalogin = new TelaLogin();
    /**
     * Creates new form TelaPrinciapal
     */
    public TelaPrinciapal(String usuario) {
        initComponents();
        jLabelUsuario.setText(usuario);
        this.setTitle("ADMCursos V.01");
        conexao.conexao();
    }

    private TelaPrinciapal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuCadastroAluno = new javax.swing.JMenuItem();
        jMenuCadastroProf = new javax.swing.JMenuItem();
        jMenuCadastroCurso = new javax.swing.JMenuItem();
        jMenuCadastroTurma = new javax.swing.JMenuItem();
        JMenuCadastroUser = new javax.swing.JMenuItem();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuFerrRelatório = new javax.swing.JMenuItem();
        jMenuFerrBackup = new javax.swing.JMenuItem();
        jMenuTrocaUser = new javax.swing.JMenuItem();
        jMenuMatricular = new javax.swing.JMenu();
        jMenuItem1Matricular = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItem2Sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().setLayout(null);
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(70, 410, 130, 30);

        jLabel2.setText("Usuário : ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 414, 70, 20);

        jLabel1.setBackground(new java.awt.Color(0, 153, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundook.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 920, 460);

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 255));

        jMenuCadastro.setText("Cadastros");

        jMenuCadastroAluno.setText("Alunos");
        jMenuCadastroAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroAlunoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuCadastroAluno);

        jMenuCadastroProf.setText("Professores");
        jMenuCadastroProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroProfActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuCadastroProf);

        jMenuCadastroCurso.setText("Cursos");
        jMenuCadastroCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroCursoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuCadastroCurso);

        jMenuCadastroTurma.setText("Turmas");
        jMenuCadastro.add(jMenuCadastroTurma);

        JMenuCadastroUser.setText("Usuários");
        JMenuCadastroUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuCadastroUserActionPerformed(evt);
            }
        });
        jMenuCadastro.add(JMenuCadastroUser);

        jMenuBar1.add(jMenuCadastro);

        jMenuFerramentas.setText("Ferramentas");

        jMenuFerrRelatório.setText("Relatórios");
        jMenuFerramentas.add(jMenuFerrRelatório);

        jMenuFerrBackup.setText("Backup");
        jMenuFerramentas.add(jMenuFerrBackup);

        jMenuTrocaUser.setText("Trocar  Usuário");
        jMenuTrocaUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTrocaUserActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuTrocaUser);

        jMenuBar1.add(jMenuFerramentas);

        jMenuMatricular.setText("Matricular");

        jMenuItem1Matricular.setText("Matricular");
        jMenuMatricular.add(jMenuItem1Matricular);

        jMenuBar1.add(jMenuMatricular);

        jMenuSair.setText("Sair");

        jMenuItem2Sair.setText("Sair");
        jMenuItem2Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2SairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItem2Sair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(938, 506));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuCadastroAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroAlunoActionPerformed
    
          try {
              conexao.executaSql("select * from usuario where nameUse='"+jLabelUsuario.getText()+"'");
              conexao.result.first();
              if(conexao.result.getString("tipoUser").equals("Administrador")||conexao.result.getString("tipoUser").equals("Secretaria"))
              {
                  telaluno.setVisible(true);
              }else{
                    JOptionPane.showMessageDialog(null,"Funcionalidade não permitida para este Usuário \n        Contate o seu Administrador");
                   }     
                      } catch (SQLException ex) {
                          JOptionPane.showMessageDialog(null,"Funcionalidade não permitida para este Usuáio \n       Contact o seu Administrador"+ex);
                  
          }
               
    }//GEN-LAST:event_jMenuCadastroAlunoActionPerformed

    private void jMenuItem2SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2SairActionPerformed

    private void jMenuCadastroProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroProfActionPerformed
         try {
              conexao.executaSql("select * from usuario where nameUse='"+jLabelUsuario.getText()+"'");
              conexao.result.first();
              if(conexao.result.getString("tipoUser").equals("Administrador")||conexao.result.getString("tipoUser").equals("Secretaria"))
              {
                  telaprof.setVisible(true);
              }else{
                    JOptionPane.showMessageDialog(null,"Funcionalidade não permitida para este Usuário \n        Contate o seu Administrador");
                   }     
                      } catch (SQLException ex) {
                          JOptionPane.showMessageDialog(null,"Funcionalidade não permitida para este Usuáio \n       Contact o seu Administrador"+ex);
                  
          }
    }//GEN-LAST:event_jMenuCadastroProfActionPerformed

    private void JMenuCadastroUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuCadastroUserActionPerformed
      try {
              conexao.executaSql("select * from usuario where nameUse='"+jLabelUsuario.getText()+"'");
              conexao.result.first();
              if(conexao.result.getString("tipoUser").equals("Administrador"))
              {
                  telauser.setVisible(true);
              }else{
                    JOptionPane.showMessageDialog(null,"Funcionalidade não permitida para este Usuário \n        Contate o seu Administrador");
                   }     
                      } catch (SQLException ex) {
                          JOptionPane.showMessageDialog(null,"Funcionalidade não permitida para este Usuáio \n       Contact o seu Administrador"+ex);
                  
          }
    }//GEN-LAST:event_JMenuCadastroUserActionPerformed

    private void jMenuCadastroCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroCursoActionPerformed
        try {
              conexao.executaSql("select * from usuario where nameUse='"+jLabelUsuario.getText()+"'");
              conexao.result.first();
              if(conexao.result.getString("tipoUser").equals("Administrador")||conexao.result.getString("tipoUser").equals("Secretaria"))
              {
                  telacurso.setVisible(true);
              }else{
                    JOptionPane.showMessageDialog(null,"Funcionalidade não permitida para este Usuário \n        Contate o seu Administrador");
                   }     
                      } catch (SQLException ex) {
                          JOptionPane.showMessageDialog(null,"Funcionalidade não permitida para este Usuáio \n       Contact o seu Administrador"+ex);
                  
          }
    }//GEN-LAST:event_jMenuCadastroCursoActionPerformed

    private void jMenuTrocaUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTrocaUserActionPerformed
        telalogin.setVisible(true);
               dispose();
    }//GEN-LAST:event_jMenuTrocaUserActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrinciapal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrinciapal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrinciapal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrinciapal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrinciapal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMenuCadastroUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuCadastroAluno;
    private javax.swing.JMenuItem jMenuCadastroCurso;
    private javax.swing.JMenuItem jMenuCadastroProf;
    private javax.swing.JMenuItem jMenuCadastroTurma;
    private javax.swing.JMenuItem jMenuFerrBackup;
    private javax.swing.JMenuItem jMenuFerrRelatório;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenuItem jMenuItem1Matricular;
    private javax.swing.JMenuItem jMenuItem2Sair;
    private javax.swing.JMenu jMenuMatricular;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenuItem jMenuTrocaUser;
    // End of variables declaration//GEN-END:variables
}
