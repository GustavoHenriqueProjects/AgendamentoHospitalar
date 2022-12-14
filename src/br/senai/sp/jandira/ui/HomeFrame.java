/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 22282227
 */
public class HomeFrame extends javax.swing.JFrame {

    private EspecialidadesPanel especialidadesPanel;
    
    private final int POS_X = 30;
    private final int POS_Y = 170;
    private final int POS_LARGURA = 750;
    private final int POS_ALTURA = 300;
    
    public HomeFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/imagens/equipe-medica1.png")));
        initPanels();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelIcon = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        buttonSair = new javax.swing.JButton();
        buttonPacientes = new javax.swing.JButton();
        buttonEspecialidades = new javax.swing.JButton();
        buttonMedicos = new javax.swing.JButton();
        PanelHome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        buttonPlanoDeSaude = new javax.swing.JButton();
        buttonAgenda1 = new javax.swing.JButton();
        buttonHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Agendamento");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(158, 168, 250));
        jPanel1.setLayout(null);

        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/Calendario.png"))); // NOI18N
        jPanel1.add(labelIcon);
        labelIcon.setBounds(30, 0, 70, 70);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        labelTitulo.setText("Agenda de Consultas");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(190, 10, 240, 32);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 70);

        buttonSair.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        buttonSair.setForeground(new java.awt.Color(255, 255, 255));
        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/Log-Outsair.png"))); // NOI18N
        buttonSair.setToolTipText("Sair do sistema");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSair);
        buttonSair.setBounds(750, 90, 30, 40);

        buttonPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/Paciente.png"))); // NOI18N
        buttonPacientes.setToolTipText("Cadastro De Pacientes");
        buttonPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacientesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPacientes);
        buttonPacientes.setBounds(190, 90, 60, 39);

        buttonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/estetoscopio.png"))); // NOI18N
        buttonEspecialidades.setToolTipText("Cadastro de especialidades M??dicas");
        buttonEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialidades);
        buttonEspecialidades.setBounds(350, 90, 60, 40);

        buttonMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/equipe-medica.png"))); // NOI18N
        buttonMedicos.setToolTipText("Cadastro de M??dicos");
        buttonMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicosActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMedicos);
        buttonMedicos.setBounds(270, 90, 60, 40);

        PanelHome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelHome.setPreferredSize(new java.awt.Dimension(750, 320));
        PanelHome.setRequestFocusEnabled(false);
        PanelHome.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(158, 168, 250));
        jLabel1.setText("SISACON");
        PanelHome.add(jLabel1);
        jLabel1.setBounds(50, 20, 160, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("E-mail: HospitalS??oFransisco@gmail.com");
        PanelHome.add(jLabel2);
        jLabel2.setBounds(423, 220, 260, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Site: www.HospitalSaoFrancisco@gmail.com");
        PanelHome.add(jLabel3);
        jLabel3.setBounds(423, 270, 310, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Sistema para Agendamento de Consultas");
        PanelHome.add(jLabel4);
        jLabel4.setBounds(50, 60, 340, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Telefone: 11 4143-6562");
        PanelHome.add(jLabel5);
        jLabel5.setBounds(423, 170, 150, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Dados T??cnicos:");
        PanelHome.add(jLabel6);
        jLabel6.setBounds(440, 130, 200, 32);

        jPanel2.setBackground(new java.awt.Color(158, 168, 250));
        PanelHome.add(jPanel2);
        jPanel2.setBounds(0, 100, 750, 5);
        jPanel2.getAccessibleContext().setAccessibleName("");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/email.png"))); // NOI18N
        PanelHome.add(jLabel7);
        jLabel7.setBounds(380, 220, 30, 24);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/chamada-telefonica.png"))); // NOI18N
        PanelHome.add(jLabel8);
        jLabel8.setBounds(380, 170, 40, 20);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/rede.png"))); // NOI18N
        PanelHome.add(jLabel9);
        jLabel9.setBounds(380, 270, 30, 24);

        getContentPane().add(PanelHome);
        PanelHome.setBounds(30, 170, 750, 300);

        buttonPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/plano-de-saude.png"))); // NOI18N
        buttonPlanoDeSaude.setToolTipText("Plano de sa??de");
        getContentPane().add(buttonPlanoDeSaude);
        buttonPlanoDeSaude.setBounds(430, 90, 60, 39);

        buttonAgenda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/Agenda.png"))); // NOI18N
        buttonAgenda1.setToolTipText("Agenda");
        buttonAgenda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgenda1ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAgenda1);
        buttonAgenda1.setBounds(110, 90, 60, 40);

        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/home.png"))); // NOI18N
        buttonHome.setToolTipText("Home");
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(20, 90, 70, 40);

        setSize(new java.awt.Dimension(816, 520));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPacientesActionPerformed

    private void buttonEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesActionPerformed
        EspecialidadeDAO.criarListaDeEspecialidade();
        buttonEspecialidades.setBackground(new java.awt.Color(204,255,204));
        buttonHome.setBackground(new java.awt.Color(242,242,242));
        PanelHome.setVisible(false);
        especialidadesPanel.setVisible(true);
        
    }//GEN-LAST:event_buttonEspecialidadesActionPerformed

    private void buttonMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonMedicosActionPerformed

    private void buttonAgenda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgenda1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAgenda1ActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        buttonEspecialidades.setBackground(new java.awt.Color(242,242,242));
        buttonHome.setBackground(new java.awt.Color(204,255,204));
        PanelHome.setVisible(true);
        especialidadesPanel.setVisible(false);
    }//GEN-LAST:event_buttonHomeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelHome;
    private javax.swing.JButton buttonAgenda1;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedicos;
    private javax.swing.JButton buttonPacientes;
    private javax.swing.JButton buttonPlanoDeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {
        
        especialidadesPanel = new EspecialidadesPanel();
        especialidadesPanel.setBounds(POS_X, POS_Y, POS_LARGURA, POS_ALTURA);
        getContentPane().add(especialidadesPanel);
        especialidadesPanel.setVisible(false);
    }

}
