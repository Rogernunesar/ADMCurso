/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import ControlDao.ConexaoBD;
import ControlDao.MatriculaDAO;
import Model.ModeloMatricula;
import Model.ModeloTabela;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Rogerio
 */
public class Matricula extends javax.swing.JFrame {
       ConexaoBD conexao = new ConexaoBD();
       ModeloMatricula modmat = new ModeloMatricula();
       MatriculaDAO matdao = new MatriculaDAO();
       SimpleDateFormat format = new SimpleDateFormat( "yyyy-MM-dd" ); 
       int flag =0;
    /**
     * Creates new form Matricula
     */
    public Matricula() {
        initComponents();
       editarDataMatricua();
       preencherTabela("select a.idMatriculas, c.nomeAluno, b.nomeTurmas, a.data_Matricula, a.nascAluno, a.nomeProfessor, a.nomeCurso, a.inicioCurso\n" +
                       "from matriculas a \n" +
                       "Inner join turmas b Inner join alunos c\n" +
                       "on a.mat_idTurmas = b.idTurmas\n" +
                       "and a.mat_idAluno= c.idAluno\n" +
                       "order by c.nomeAluno;");
       
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
        jbExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableBuscar = new javax.swing.JTable();
        jbCancelar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTableMatriculados = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldNomeAluno = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldNasc = new javax.swing.JTextField();
        jbBuscarAluno = new javax.swing.JButton();
        jTextFieldNumMatricula = new javax.swing.JTextField();
        jTextFieldNomeTurma = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCurso = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbBuscarTurma = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldProfessor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldInicioCurso = new javax.swing.JTextField();
        jbSalvar = new javax.swing.JButton();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jbPesquisar = new javax.swing.JButton();
        jTextFieldDataMatricula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbEditar.setText("Editar Matricula");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir Matricula");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        JTableBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        JTableBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableBuscarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableBuscar);

        jbCancelar.setText("Cancelar Matricula");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jLabelTitulo.setBackground(new java.awt.Color(0, 204, 0));
        jLabelTitulo.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 153, 0));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("FORMULARIO DE MATRÍCULA");

        JTableMatriculados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        JTableMatriculados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableMatriculadosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JTableMatriculados);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel10.setText("Nome Aluno");

        jLabel11.setText("Data Nasc");

        jbBuscarAluno.setText("Buscar");
        jbBuscarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarAlunoActionPerformed(evt);
            }
        });

        jTextFieldNumMatricula.setEnabled(false);

        jLabel1.setText("Curso:");

        jLabel2.setText("Professor:");

        jbBuscarTurma.setText("Buscar");
        jbBuscarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarTurmaActionPerformed(evt);
            }
        });

        jLabel7.setText("Turma:");

        jLabel4.setText("Nº  Matricula");

        jLabel12.setText("Inicio do Curso");

        jTextFieldInicioCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldInicioCursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(26, 26, 26)
                        .addComponent(jTextFieldNomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbBuscarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbBuscarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(10, 10, 10)
                        .addComponent(jTextFieldNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldInicioCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNumMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldProfessor)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscarAluno)
                    .addComponent(jTextFieldNumMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldInicioCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jTextFieldCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jTextFieldNomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbBuscarTurma))))
        );

        jbSalvar.setText("Matricular Aluno");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbPesquisar.setText("Pesquisar Matricula");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jLabel3.setText("Data Matricula");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldDataMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldDataMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisar))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbExcluir)
                    .addComponent(jbEditar)
                    .addComponent(jbSalvar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     public void editarDataMatricua(){
         if(flag == 4){
        jTextFieldDataMatricula.setText("yyyy-MM-DD");
     }else if(flag == 1 ||flag == 2){
           jTextFieldDataMatricula.setText(new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis())));
     }else{jTextFieldDataMatricula.setText(new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis())));}
     }
    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
             flag=4;
             editarDataMatricua();
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void JTableBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableBuscarMouseClicked
       if(flag == 1) {
           conexao.conexao();
         
           try {
          String nomeAluno = ""+JTableBuscar.getValueAt(JTableBuscar.getSelectedRow(),1);
          conexao.executaSql("select * from alunos where nomeAluno = '"+nomeAluno+"'");
               conexao.result.first();
               Date nasc_aluno = conexao.result.getDate("nascAluno");
               jTextFieldNomeAluno.setText(nomeAluno);
               jTextFieldNasc.setText(String.valueOf(nasc_aluno));
               conexao.desconecta();
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,"Aluno não encontrado"+ ex);
           } 
            }else{
           
           conexao.conexao();
           try{
           String nomeTurma=""+JTableBuscar.getValueAt(JTableBuscar.getSelectedRow(),1);
           conexao.executaSql("select * from turmas where nomeTurmas = '"+nomeTurma+"'");
               conexao.result.first();
               Date datainicio = conexao.result.getDate("dataInicio");
               jTextFieldNomeTurma.setText(nomeTurma);
               jTextFieldInicioCurso.setText(String.valueOf(datainicio));
               conexao.desconecta();
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,"Turma  não encontrado"+ ex);
           }
            conexao.conexao();
           try{
               
           String nomeTurma=""+JTableBuscar.getValueAt(JTableBuscar.getSelectedRow(),1);
           conexao.executaSql("select * from turmas where nomeTurmas = '"+nomeTurma+"'");
               conexao.result.first();
               Date datainicio = conexao.result.getDate("dataInicio");
               jTextFieldNomeTurma.setText(nomeTurma);
               jTextFieldInicioCurso.setText(String.valueOf(datainicio));
                       
               ConexaoBD conexPesquisar = new ConexaoBD();
               conexPesquisar.conexao();
               conexPesquisar.executaSql("select * from professores where idProf = "+conexao.result.getInt("tur_idProf"));
               conexPesquisar.result.first();
               jTextFieldProfessor.setText(conexPesquisar.result.getString("nomeProf"));
               conexPesquisar.desconecta();
               
               conexPesquisar.conexao();
               conexPesquisar.executaSql("select * from cursos where idCurso = "+conexao.result.getInt("tur_idCurso"));
               conexPesquisar.result.first();
               jTextFieldCurso.setText(conexPesquisar.result.getString("nomeCurso"));
               conexPesquisar.desconecta();
            
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,"Turma  não encontrado"+ ex);
               }
           conexao.desconecta(); 
       } 
        
    }//GEN-LAST:event_JTableBuscarMouseClicked

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
  
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed

                modmat.setNomealuno((String)jTextFieldNomeAluno.getText());
                modmat.setNomeTurma((String)jTextFieldNomeTurma.getText());
                modmat.setDatamatricula(jTextFieldDataMatricula.getText());
                modmat.setNascaluno(jTextFieldNasc.getText());
                modmat.setNomeprofessor((String)jTextFieldProfessor.getText());
                modmat.setNomecurso((String)jTextFieldCurso.getText());
                modmat.setDatainicio(jTextFieldInicioCurso.getText());
                matdao.Salvar(modmat);

                jTextFieldNumMatricula.setText("");
                jTextFieldNomeAluno.setText("");
                jTextFieldNomeTurma.setText("");
                jTextFieldDataMatricula.setText("");
                jTextFieldNasc.setText("");
                jTextFieldProfessor.setText("");
                jTextFieldCurso.setText("");
                jTextFieldInicioCurso.setText("");
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbBuscarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarAlunoActionPerformed
        flag=1;
        editarDataMatricua();
        preencherTabelaAluno("select * from alunos where nomeAluno like'%"+jTextFieldNomeAluno.getText()+"%'");
    }//GEN-LAST:event_jbBuscarAlunoActionPerformed

    private void jbBuscarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarTurmaActionPerformed
       flag=2;
      // editarDataMatricua();
        preencherTabelaTurmas("select * from turmas where nomeTurmaS like'%"+jTextFieldNomeTurma.getText()+"%'");
    
    }//GEN-LAST:event_jbBuscarTurmaActionPerformed

    private void jTextFieldInicioCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldInicioCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldInicioCursoActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
       jTextFieldDataMatricula.setText("");
       
       jbEditar.setEnabled(true);
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void JTableMatriculadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableMatriculadosMouseClicked
       /* String idMatricula=(""+JTableMatriculados.getValueAt(JTableMatriculados.getSelectedRow(), 0)) ;
        conexao.conexao();
        conexao.executaSql("select * from turmas where nomeCurso= '"+idMatricula+"'");

        try {
            conexao.result.first();

            jTextFieldNumMatricula.setText(String.valueOf(conexao.result.getInt("idMatriculas")));
            ConexaoBD conexPesqturma = new ConexaoBD();
            conexPesqturma.conexao();
            conexPesqturma.executaSql("select * from turmas where idTurmas = "+conexao.result.getInt("mat_idTurmas"));
            conexPesqturma.result.first();
            jTextFieldNomeTurma.setText(conexPesqturma.result.getString("nomeAluno"));
            conexPesqturma.desconecta();
            ConexaoBD conexPesqaluno = new ConexaoBD();
            conexPesqaluno.conexao();
            conexPesqaluno.executaSql("select * from alunos where idAluno = "+conexao.result.getInt("mat_idAluno"));
            conexPesqaluno.result.first();
            jTextFieldNomeAluno.setText(conexPesqaluno.result.getString("nomeAluno"));
            conexPesqaluno.desconecta();
            jTextFieldDataMatricula.setText(conexao.result.getString("data_Matricula"));
            jTextFieldNasc.setText(conexao.result.getString("nascAluno"));
            jTextFieldProfessor.setText(conexao.result.getString("nomeProfessor"));
            jTextFieldCurso.setText(conexao.result.getString("nomeCurso"));
            jTextFieldInicioCurso.setText(format.format(conexao.result.getDate("inicioCurso")));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao selecionar dados   "+ex);
        }
        conexao.desconecta();*/
    }//GEN-LAST:event_JTableMatriculadosMouseClicked
    public void preencherTabelaAluno(String sql){
             ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"Codigo", "Nome", "Nasc Aluno"};
        conexao.conexao();
        conexao.executaSql(sql);
        
         try {
             conexao.result.first();
             do{
                dados.add(new Object[]{conexao.result.getInt("idAluno"),conexao.result.getString("nomeAluno"), conexao.result.getDate("nascAluno")});  
             }while(conexao.result.next());
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Digite outro nome"+ex);
         }
         ModeloTabela modelo = new ModeloTabela(dados, colunas);
         
         JTableBuscar.setModel(modelo);
         JTableBuscar.getColumnModel().getColumn(0).setPreferredWidth(85);
         JTableBuscar.getColumnModel().getColumn(0).setResizable(false);
         JTableBuscar.getColumnModel().getColumn(1).setPreferredWidth(300);
         JTableBuscar.getColumnModel().getColumn(1).setResizable(false);
         JTableBuscar.getColumnModel().getColumn(2).setPreferredWidth(293);
         JTableBuscar.getColumnModel().getColumn(2).setResizable(false);
         JTableBuscar.getTableHeader().setReorderingAllowed(false);
         JTableBuscar.setAutoResizeMode(JTableBuscar.AUTO_RESIZE_OFF);
         JTableBuscar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
         conexao.desconecta();  
    }
    
    public void preencherTabelaTurmas(String sql){
             ArrayList dados = new ArrayList();
        String [] colunas = new String[]{"Codigo", "Turma"};
        conexao.conexao();
        conexao.executaSql(sql);
        
         try {
             conexao.result.first();
             do{
                dados.add(new Object[]{conexao.result.getInt("idTurmas"),conexao.result.getString("nomeTurmaS")});  
             }while(conexao.result.next());
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Digite outro nome"+ex);
         }
         ModeloTabela modelo = new ModeloTabela(dados, colunas);
         
         JTableBuscar.setModel(modelo);
         JTableBuscar.getColumnModel().getColumn(0).setPreferredWidth(85);
         JTableBuscar.getColumnModel().getColumn(0).setResizable(false);
         JTableBuscar.getColumnModel().getColumn(1).setPreferredWidth(600);
         JTableBuscar.getColumnModel().getColumn(1).setResizable(false);
         JTableBuscar.setAutoResizeMode(JTableBuscar.AUTO_RESIZE_OFF);
         JTableBuscar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
            JOptionPane.showMessageDialog(rootPane,"Digite outro nome"+ex);
         }
         ModeloTabela modelo = new ModeloTabela(dados, colunas);
         
         JTableMatriculados.setModel(modelo);
         JTableMatriculados.getColumnModel().getColumn(0).setPreferredWidth(60);
         JTableMatriculados.getColumnModel().getColumn(0).setResizable(false);
         JTableMatriculados.getColumnModel().getColumn(1).setPreferredWidth(200);
         JTableMatriculados.getColumnModel().getColumn(1).setResizable(false);
         JTableMatriculados.getColumnModel().getColumn(2).setPreferredWidth(100);
         JTableMatriculados.getColumnModel().getColumn(2).setResizable(false);
         JTableMatriculados.getColumnModel().getColumn(3).setPreferredWidth(95);
         JTableMatriculados.getColumnModel().getColumn(3).setResizable(false);
         JTableMatriculados.getColumnModel().getColumn(4).setPreferredWidth(95);
         JTableMatriculados.getColumnModel().getColumn(4).setResizable(false);
         JTableMatriculados.getColumnModel().getColumn(5).setPreferredWidth(180);
         JTableMatriculados.getColumnModel().getColumn(5).setResizable(false);
         JTableMatriculados.getColumnModel().getColumn(6).setPreferredWidth(150);
         JTableMatriculados.getColumnModel().getColumn(6).setResizable(false);
         JTableMatriculados.getColumnModel().getColumn(7).setPreferredWidth(80);
         JTableMatriculados.getColumnModel().getColumn(7).setResizable(false);
         JTableMatriculados.getTableHeader().setReorderingAllowed(false);
         JTableMatriculados.setAutoResizeMode(JTableMatriculados.AUTO_RESIZE_OFF);
         JTableMatriculados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
         conexao.desconecta();   
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
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matricula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableBuscar;
    private javax.swing.JTable JTableMatriculados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldCurso;
    private javax.swing.JTextField jTextFieldDataMatricula;
    private javax.swing.JTextField jTextFieldInicioCurso;
    private javax.swing.JTextField jTextFieldNasc;
    private javax.swing.JTextField jTextFieldNomeAluno;
    private javax.swing.JTextField jTextFieldNomeTurma;
    private javax.swing.JTextField jTextFieldNumMatricula;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldProfessor;
    private javax.swing.JButton jbBuscarAluno;
    private javax.swing.JButton jbBuscarTurma;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbSalvar;
    // End of variables declaration//GEN-END:variables
}
