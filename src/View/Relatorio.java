/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import ControlDao.ConexaoBD;
import ControlDao.MatriculaDAO;
import Model.ModeloTabela;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Rogerio
 */
public class Relatorio extends javax.swing.JFrame {
      ConexaoBD conexao = new ConexaoBD();
      MatriculaDAO redao = new MatriculaDAO();
    /**
     * Creates new form Relatorio
     */
    public Relatorio() {
        initComponents();
        preencherTurma();
       
    }

    public void preencherTurma(){
   conexao.conexao();
   conexao.executaSql("Select * from turmas order by nomeTurmas");
   
               try {
                   conexao.result.first();
                   jComboBoxTurma.removeAllItems();
                   do{
                       jComboBoxTurma.addItem(conexao.result.getString("nomeTurmas"));
                   
                   }while (conexao.result.next());
                   
               } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, "Erro ao preencher Turmas"+ex);
               }
               
               conexao.desconecta();
    }
    public void preencherTabela(String sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"Matricula", "Aluno", "Turma", "Data Matricula", "Nascimento", "Professor", "Curso", "Inicio"};
        conexao.conexao();
        conexao.executaSql(sql);
        
         try {
             conexao.result.first();
             do{
                dados.add(new Object[]{conexao.result.getInt("idMatriculas"),conexao.result.getString("nomeAluno"),conexao.result.getString("nomeTurmas"),conexao.result.getString("data_Matricula"), conexao.result.getString("nascAluno"), conexao.result.getString("nomeProfessor") ,conexao.result.getString("nomeCurso"),conexao.result.getString("inicioCurso")});  
             }while(conexao.result.next());
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Escolha outro nome ");
         }
         ModeloTabela modelo = new ModeloTabela(dados, colunas);
       
         jTableRelatorio.setModel(modelo);
         jTableRelatorio.getColumnModel().getColumn(0).setPreferredWidth(60);
         jTableRelatorio.getColumnModel().getColumn(0).setResizable(false);
         jTableRelatorio.getColumnModel().getColumn(1).setPreferredWidth(200);
         jTableRelatorio.getColumnModel().getColumn(1).setResizable(false);
         jTableRelatorio.getColumnModel().getColumn(2).setPreferredWidth(100);
         jTableRelatorio.getColumnModel().getColumn(2).setResizable(false);
         jTableRelatorio.getColumnModel().getColumn(3).setPreferredWidth(95);
         jTableRelatorio.getColumnModel().getColumn(3).setResizable(false);
         jTableRelatorio.getColumnModel().getColumn(4).setPreferredWidth(95);
         jTableRelatorio.getColumnModel().getColumn(4).setResizable(false);
         jTableRelatorio.getColumnModel().getColumn(5).setPreferredWidth(180);
         jTableRelatorio.getColumnModel().getColumn(5).setResizable(false);
         jTableRelatorio.getColumnModel().getColumn(6).setPreferredWidth(145);
         jTableRelatorio.getColumnModel().getColumn(6).setResizable(false);
         jTableRelatorio.getColumnModel().getColumn(7).setPreferredWidth(80);
         jTableRelatorio.getColumnModel().getColumn(7).setResizable(false);
         jTableRelatorio.getTableHeader().setReorderingAllowed(false);
         jTableRelatorio.setAutoResizeMode(jTableRelatorio.AUTO_RESIZE_OFF);
         jTableRelatorio.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
         conexao.desconecta();   
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRelatorio = new javax.swing.JTable();
        jComboBoxTurma = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableRelatorio);

        jComboBoxTurma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Selecionar Alunos por Turmas");

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel3.setText("RELATÓRIOA DE MATRÍCULA");

        jButton1.setText("Imprimir Relatório");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 956, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButtonBuscar)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(992, 467));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        int cod = redao.buscaIdrelatTurmas((String) jComboBoxTurma.getSelectedItem());
        String codigo = String.valueOf(cod);
        preencherTabela("select a.idMatriculas, c.nomeAluno, b.nomeTurmas, a.data_Matricula, a.nascAluno, a.nomeProfessor, a.nomeCurso, a.inicioCurso\n" +
                       "from matriculas a \n" +
                       "Inner join turmas b Inner join alunos c\n" +
                       "on a.mat_idTurmas = b.idTurmas\n" +
                       "and a.mat_idAluno= c.idAluno\n" +
                       "where a.mat_idTurmas ='"+codigo+"'");
    }//GEN-LAST:event_jButtonBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JComboBox jComboBoxTurma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRelatorio;
    // End of variables declaration//GEN-END:variables
}
