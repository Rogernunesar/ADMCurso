/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import ControlDao.ConexaoBD;
import ControlDao.TurmasDAO;
import Model.ModeloTabela;
import Model.ModeloTurmas;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;


/**
 *
 * @author Rogerio
 */
public class CadastroTurmas extends javax.swing.JFrame {
           ConexaoBD conexao = new ConexaoBD();
           ModeloTurmas modturma = new ModeloTurmas();
           TurmasDAO turmadao = new TurmasDAO();
                   
           int flag = 0;
    /**
     * Creates new form CadastroTurmas
     */
    public CadastroTurmas() {
        initComponents();
        preencherProf();
        preencherCurso();
        this.setTitle("CADASTRAR TURMAS");
        this.setResizable(false);
        preencherTabela("select a.nomeTurmas, a.dataInicio, a.dataFinal, a.cargaHora, b.nomeProf, c.nomeCurso\n" +
                        "from turmas a \n" +
                        "Inner join professores b Inner join cursos c\n" +
                        "on a.tur_idProf = b.idProf \n" +
                        "and a.tur_idCurso= c.idCurso\n" +
                        "order by nomeTurmas;");
        
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
        JTableTurmas = new javax.swing.JTable();
        jbCancelar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxProf = new javax.swing.JComboBox();
        jComboBoxCursos = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNomeTurma = new javax.swing.JTextField();
        jDateChooserinicio = new com.toedter.calendar.JDateChooser();
        jDateChooserfim = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldCargaHora = new javax.swing.JTextField();
        jTextFieldIdTurmas = new javax.swing.JTextField();
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

        JTableTurmas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        JTableTurmas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableTurmasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableTurmas);

        jbCancelar.setText("Cancelar");
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jLabelTitulo.setBackground(new java.awt.Color(0, 204, 0));
        jLabelTitulo.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 153, 0));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("CADASTRAR TURMAS");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setText("Professor:");

        jLabel4.setText("Cursos:");

        jLabel5.setText("Inicio do Curso:");

        jComboBoxProf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxProf.setEnabled(false);

        jComboBoxCursos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxCursos.setEnabled(false);
        jComboBoxCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCursosActionPerformed(evt);
            }
        });

        jLabel6.setText("Fim do Curso:");

        jLabel7.setText("Turma:");

        jTextFieldNomeTurma.setEnabled(false);

        jDateChooserinicio.setEnabled(false);
        jDateChooserinicio.setFocusable(false);
        jDateChooserinicio.setRequestFocusEnabled(false);

        jDateChooserfim.setEnabled(false);

        jLabel8.setText("Carga Hora");

        jTextFieldCargaHora.setEnabled(false);

        jTextFieldIdTurmas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextFieldIdTurmas.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCargaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooserinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(36, 36, 36)
                        .addComponent(jComboBoxProf, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jDateChooserfim, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldIdTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jDateChooserinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooserfim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jTextFieldIdTurmas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextFieldCargaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextFieldNomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
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
            .addComponent(jLabelTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jTextFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 91, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbNovo)
                        .addComponent(jbSalvar)
                        .addComponent(jbCancelar)
                        .addComponent(jbEditar))
                    .addComponent(jbExcluir))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(649, 468));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void preencherProf(){
   conexao.conexao();
   conexao.executaSql("Select * from professores order by nomeProf");
   
               try {
                   conexao.result.first();
                   jComboBoxProf.removeAllItems();
                   do{
                       jComboBoxProf.addItem(conexao.result.getString("nomeProf"));
                   
                   }while (conexao.result.next());
                   
               } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, "Erro ao preencher professores"+ex);
               }
               
               conexao.desconecta();
}

public void preencherCurso(){
   conexao.conexao();
   conexao.executaSql("Select * from cursos order by nomeCurso");
   
               try {
                   conexao.result.first();
                   jComboBoxCursos.removeAllItems();
                   do{
                       jComboBoxCursos.addItem(conexao.result.getString("nomeCurso"));
                   
                   }while (conexao.result.next());
                   
               } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, "Erro ao preencher Cursos"+ex);
               }
               
               conexao.desconecta();
}
    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        flag = 2;
        jTextFieldIdTurmas.setEnabled(!true);
        jComboBoxProf.setEnabled(true);
        jComboBoxCursos.setEnabled(true);
        jTextFieldNomeTurma.setEnabled(true);
        jDateChooserinicio.setEnabled(true);
        jDateChooserfim.setEnabled(true);
        jTextFieldCargaHora.setEnabled(true);
        botaoEditar();
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
       modturma.setPesquisar(jTextFPesquisa.getText());
       ModeloTurmas turma1 = turmadao.buscarTurmas(modturma);
       
       jTextFieldIdTurmas.setText(String.valueOf(turma1.getIdturmas()));
       jComboBoxProf.setSelectedItem(turma1.getNomeprof());
       jComboBoxCursos.setSelectedItem(turma1.getNomecurso());
       jDateChooserinicio.setDate(turma1.getDatainicio());
       jDateChooserfim.setDate(turma1.getDatafinal());
       jTextFieldCargaHora.setText(String.valueOf(turma1.getCargahora()));
       jTextFieldNomeTurma.setText(turma1.getNometurma());
       preencherTabela("select a.nomeTurmas, a.dataInicio, a.dataFinal, a.cargaHora, b.nomeProf, c.nomeCurso from turmas a Inner join professores b Inner join cursos c on a.tur_idProf = b.idProf and a.tur_idCurso= c.idCurso where nomeTurmas like'%"+modturma.getPesquisar()+"%'");
                       
       
       jbEditar.setEnabled(true);
       botaoPesquisar();
       
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void JTableTurmasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableTurmasMouseClicked
      String nomeTurma= ""+JTableTurmas.getValueAt(JTableTurmas.getSelectedRow(), 0);
        conexao.conexao();
        conexao.executaSql("select * from turmas where nomeTurmas = '"+nomeTurma+"'");

        try {
            conexao.result.first();
            
            jTextFieldIdTurmas.setText(String.valueOf(conexao.result.getInt("idTurmas"))); 
            jDateChooserinicio.setDate(conexao.result.getDate("dataInicio"));
            jDateChooserfim.setDate(conexao.result.getDate("dataFinal"));
            jTextFieldCargaHora.setText(String.valueOf(conexao.result.getInt("cargaHora")));
            jTextFieldNomeTurma.setText(conexao.result.getString("nomeTurmas"));
            ConexaoBD conexPesquisar = new ConexaoBD();
            conexPesquisar.conexao();
            conexPesquisar.executaSql("select * from professores where idProf = "+conexao.result.getInt("tur_idProf"));
            conexPesquisar.result.first();
            jComboBoxProf.setSelectedItem(conexPesquisar.result.getString("nomeProf"));
            conexPesquisar.desconecta();
            
            conexPesquisar.conexao();
            conexPesquisar.executaSql("select * from cursos where idCurso = "+conexao.result.getInt("tur_idCurso"));
            conexPesquisar.result.first();
            jComboBoxCursos.setSelectedItem(conexPesquisar.result.getString("nomeCurso"));
            conexPesquisar.desconecta();
 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao selecionar dados   "+ex);
        }
        conexao.desconecta();
        botaoPesquisar();
    }//GEN-LAST:event_JTableTurmasMouseClicked

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
            jTextFieldNomeTurma.setText("");
            jDateChooserinicio.setDate(null);
            jDateChooserfim.setDate(null);
            jTextFieldCargaHora.setText("");
                
            jComboBoxProf.setEnabled(!true);
            jComboBoxCursos.setEnabled(!true);
            jTextFieldNomeTurma.setEnabled(!true);
            jDateChooserinicio.setEnabled(!true);
            jDateChooserfim.setEnabled(!true);
            jTextFieldCargaHora.setEnabled(!true); 
            botaoCancelar();
                 
        
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
            flag = 1;
            jComboBoxProf.setEnabled(true);
            jComboBoxCursos.setEnabled(true);
            jTextFieldNomeTurma.setEnabled(true);
            jDateChooserinicio.setEnabled(true);
            jDateChooserfim.setEnabled(true);
            jTextFieldCargaHora.setEnabled(true);
            botaoNovo();
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
       
        /*if(jDateChooserinicio.getDate().toString().isEmpty()){//nao deixar o campos em branco
            JOptionPane.showMessageDialog(null, "Preencha o campo DATA DE INICIO para continuar!");
            jDateChooserinicio.requestFocus();
        }else if(jDateChooserfim.getDate().toString().isEmpty()){
                JOptionPane.showMessageDialog(null, "Preencha o campo DATA FINAL para continuar!!");
                jDateChooserfim.requestFocus();
        }else */
       if(jTextFieldCargaHora.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Preencha o campo CARGA HORARIA para continuar!!");
                 jTextFieldCargaHora.requestFocus();    
        }else if(jTextFieldNomeTurma.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Preencha o campo NOME TURMA  para continuar!");
                jTextFieldNomeTurma.requestFocus();
        }else 
            if(flag == 1)
                {
                modturma.setNomeprof((String)jComboBoxProf.getSelectedItem());
                modturma.setNomecurso((String)jComboBoxCursos.getSelectedItem());
                modturma.setDatainicio(jDateChooserinicio.getDate());
                modturma.setDatafinal(jDateChooserfim.getDate());
                modturma.setCargahora(Integer.parseInt(jTextFieldCargaHora.getText()));
                modturma.setNometurma(jTextFieldNomeTurma.getText());
                turmadao.Salvar(modturma);

                jTextFieldNomeTurma.setText("");
                jDateChooserinicio.setDate(null);
                jDateChooserfim.setDate(null);
                jTextFieldCargaHora.setText("");
                
                jComboBoxProf.setEnabled(!true);
                jComboBoxCursos.setEnabled(!true);
                jTextFieldNomeTurma.setEnabled(!true);
                jDateChooserinicio.setEnabled(!true);
                jDateChooserfim.setEnabled(!true);
                jTextFieldCargaHora.setEnabled(!true);
                
                botaoSalvarflag1();
                preencherTabela("select a.nomeTurmas, a.dataInicio, a.dataFinal, a.cargaHora, b.nomeProf, c.nomeCurso\n" +
                        "from turmas a \n" +
                        "Inner join professores b Inner join cursos c\n" +
                        "on a.tur_idProf = b.idProf \n" +
                        "and a.tur_idCurso= c.idCurso\n" +
                        "order by nomeTurmas;");

            }else
            {
                 modturma.setIdturmas(Integer.parseInt(jTextFieldIdTurmas.getText()));
                 modturma.setNomeprof((String)jComboBoxProf.getSelectedItem());
                 modturma.setNomecurso((String)jComboBoxCursos.getSelectedItem());
                 modturma.setDatainicio(jDateChooserinicio.getDate());
                 modturma.setDatafinal(jDateChooserfim.getDate());
                 modturma.setCargahora(Integer.parseInt(jTextFieldCargaHora.getText()));
                 modturma.setNometurma(jTextFieldNomeTurma.getText());
                 turmadao.EditarTurmas(modturma);
                 jTextFieldNomeTurma.setText("");
                 jDateChooserinicio.setDate(null);
                 jDateChooserfim.setDate(null);
                 jTextFieldCargaHora.setText("");
                
                 jComboBoxProf.setEnabled(!true);
                 jComboBoxCursos.setEnabled(!true);
                 jTextFieldNomeTurma.setEnabled(!true);
                 jDateChooserinicio.setEnabled(!true);
                 jDateChooserfim.setEnabled(!true);
                 jTextFieldCargaHora.setEnabled(!true);
                 preencherTabela("select a.nomeTurmas, a.dataInicio, a.dataFinal, a.cargaHora, b.nomeProf, c.nomeCurso\n" +
                        "from turmas a \n" +
                        "Inner join professores b Inner join cursos c\n" +
                        "on a.tur_idProf = b.idProf \n" +
                        "and a.tur_idCurso= c.idCurso\n" +
                        "order by nomeTurmas;");
                botaoSalvarflag2();
            }    
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
         int resposta = 0 ;
         resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir a Turma");
         if(resposta== JOptionPane.YES_OPTION)
             modturma.setIdturmas(Integer.valueOf(jTextFieldIdTurmas.getText()));
             turmadao.excluirTurmas(modturma);
             jTextFieldNomeTurma.setText("");
             jDateChooserinicio.setDate(null);
             jDateChooserfim.setDate(null);
             jTextFieldCargaHora.setText("");
                
             jComboBoxProf.setEnabled(!true);
             jComboBoxCursos.setEnabled(!true);
             jTextFieldNomeTurma.setEnabled(!true);
             jDateChooserinicio.setEnabled(!true);
             jDateChooserfim.setEnabled(!true);
             jTextFieldCargaHora.setEnabled(!true);
             botaoExcluir();
             preencherTabela("select a.nomeTurmas, a.dataInicio, a.dataFinal, a.cargaHora, b.nomeProf, c.nomeCurso\n" +
                        "from turmas a \n" +
                        "Inner join professores b Inner join cursos c\n" +
                        "on a.tur_idProf = b.idProf \n" +
                        "and a.tur_idCurso= c.idCurso\n" +
                        "order by nomeTurmas;");
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jComboBoxCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCursosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCursosActionPerformed

    public void preencherTabela(String sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"Nome", "Inicio", "Termino", "Carga", "Professor", "Curso"};
        conexao.conexao();
        conexao.executaSql(sql);
        
         try {
             conexao.result.first();
             do{
                dados.add(new Object[]{conexao.result.getString("nomeTurmas"),conexao.result.getDate("dataInicio"), conexao.result.getDate("dataFinal"), conexao.result.getInt("cargaHora") ,conexao.result.getString("nomeProf"),conexao.result.getString("nomeCurso")});  
             }while(conexao.result.next());
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Digite outro nome"+ex);
         }
         ModeloTabela modelo = new ModeloTabela(dados, colunas);
         
         JTableTurmas.setModel(modelo);
         JTableTurmas.getColumnModel().getColumn(0).setPreferredWidth(85);
         JTableTurmas.getColumnModel().getColumn(0).setResizable(false);
         JTableTurmas.getColumnModel().getColumn(1).setPreferredWidth(77);
         JTableTurmas.getColumnModel().getColumn(1).setResizable(false);
         JTableTurmas.getColumnModel().getColumn(2).setPreferredWidth(77);
         JTableTurmas.getColumnModel().getColumn(2).setResizable(false);
         JTableTurmas.getColumnModel().getColumn(3).setPreferredWidth(45);
         JTableTurmas.getColumnModel().getColumn(3).setResizable(false);
         JTableTurmas.getColumnModel().getColumn(4).setPreferredWidth(180);
         JTableTurmas.getColumnModel().getColumn(4).setResizable(false);
         JTableTurmas.getColumnModel().getColumn(5).setPreferredWidth(147);
         JTableTurmas.getColumnModel().getColumn(5).setResizable(false);
         JTableTurmas.getTableHeader().setReorderingAllowed(false);
         JTableTurmas.setAutoResizeMode(JTableTurmas.AUTO_RESIZE_OFF);
         JTableTurmas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
         conexao.desconecta();   
    }
      public void botaoNovo()
    {
       jbSalvar.setEnabled(true);
       jbCancelar.setEnabled(true);
    }
    
       public void botaoSalvarflag1()
    {
      jbNovo.setEnabled(true);
      jbSalvar.setEnabled(false);
      jbCancelar.setEnabled(false);
      jbEditar.setEnabled(false);
      jbExcluir.setEnabled(false);
    }
       public void botaoSalvarflag2()
    {
      jbSalvar.setEnabled(false);
      jbNovo.setEnabled(true);
      jbCancelar.setEnabled(false);
    }
    
       public void botaoEditar()
    {
       jbSalvar.setEnabled(true);
       jbNovo.setEnabled(true);
       jbCancelar.setEnabled(true);      
       jbEditar.setEnabled(false);
       jbNovo.setEnabled(false);
       jbExcluir.setEnabled(false);
    }
    
       public void botaoCancelar()
    {
       jbSalvar.setEnabled(!true);
       jbCancelar.setEnabled(!true);
       jbNovo.setEnabled(true);
       jbEditar.setEnabled(false);
       jbExcluir.setEnabled(false);
    }
       
       public void botaoExcluir()
    {
       
       jbEditar.setEnabled(false);
       jbNovo.setEnabled(true);
       jbCancelar.setEnabled(!true);
       jbExcluir.setEnabled(false);
    }
       
        public void botaoPesquisar()
    {
      jbCancelar.setEnabled(true);
      jbEditar.setEnabled(true);
      jbExcluir.setEnabled(true);
    }
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
            java.util.logging.Logger.getLogger(CadastroTurmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroTurmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroTurmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroTurmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroTurmas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableTurmas;
    private javax.swing.JComboBox jComboBoxCursos;
    private javax.swing.JComboBox jComboBoxProf;
    private com.toedter.calendar.JDateChooser jDateChooserfim;
    private com.toedter.calendar.JDateChooser jDateChooserinicio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFPesquisa;
    private javax.swing.JTextField jTextFieldCargaHora;
    private javax.swing.JTextField jTextFieldIdTurmas;
    private javax.swing.JTextField jTextFieldNomeTurma;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbSalvar;
    // End of variables declaration//GEN-END:variables
}
