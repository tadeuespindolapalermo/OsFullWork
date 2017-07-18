package br.com.osfullwork.telas;

import br.com.osfullwork.dal.ModuloConexao;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.*;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class TelaPrincipal extends javax.swing.JFrame {

    Connection conexao = null;
   
    public TelaPrincipal() {
        initComponents();
        conexao = ModuloConexao.conector();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        menCad = new javax.swing.JMenu();
        MenCadCli = new javax.swing.JMenuItem();
        MenCadOs = new javax.swing.JMenuItem();
        menCadUsu = new javax.swing.JMenuItem();
        menRel = new javax.swing.JMenu();
        menRelCli = new javax.swing.JMenuItem();
        MenRelSer = new javax.swing.JMenuItem();
        MenAju = new javax.swing.JMenu();
        MenAjuSob = new javax.swing.JMenuItem();
        MenOpc = new javax.swing.JMenu();
        MenOpcSai = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OS Full Work - Sistema de Controle para Ordem de Serviço");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        desktop.setPreferredSize(new java.awt.Dimension(640, 484));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/osfullwork/imagens/OS.JPG"))); // NOI18N

        lblUsuario.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblUsuario.setText("Usuário");

        lblData.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblData.setText("Data");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setText("Data de Hoje:");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel3.setText("Usuário Logado:");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel4.setText("Bem-vindo(a) ao OS Full Work!");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel5.setText("Sistema para Controle de OS.");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 2, 12)); // NOI18N
        jLabel6.setText("Desenvolvido por: Tadeu E. Palermo");

        menCad.setText("Cadastro");

        MenCadCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        MenCadCli.setText("Cliente");
        MenCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenCadCliActionPerformed(evt);
            }
        });
        menCad.add(MenCadCli);

        MenCadOs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        MenCadOs.setText("Ordem de Serviço");
        MenCadOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenCadOsActionPerformed(evt);
            }
        });
        menCad.add(MenCadOs);

        menCadUsu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        menCadUsu.setText("Usuários");
        menCadUsu.setEnabled(false);
        menCadUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadUsuActionPerformed(evt);
            }
        });
        menCad.add(menCadUsu);

        Menu.add(menCad);

        menRel.setText("Relatório");
        menRel.setEnabled(false);

        menRelCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        menRelCli.setText("Clientes");
        menRelCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menRelCliActionPerformed(evt);
            }
        });
        menRel.add(menRelCli);

        MenRelSer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        MenRelSer.setText("Serviços");
        MenRelSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenRelSerActionPerformed(evt);
            }
        });
        menRel.add(MenRelSer);

        Menu.add(menRel);

        MenAju.setText("Ajuda");

        MenAjuSob.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_MASK));
        MenAjuSob.setText("Sobre");
        MenAjuSob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenAjuSobActionPerformed(evt);
            }
        });
        MenAju.add(MenAjuSob);

        Menu.add(MenAju);

        MenOpc.setText("Opções");

        MenOpcSai.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        MenOpcSai.setText("Sair");
        MenOpcSai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenOpcSaiActionPerformed(evt);
            }
        });
        MenOpc.add(MenOpcSai);

        Menu.add(MenOpc);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUsuario))
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblData))
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblData)
                            .addComponent(jLabel2))
                        .addGap(90, 90, 90)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(20, 20, 20)))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(915, 523));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenCadOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenCadOsActionPerformed
        // chamando a tela Ordem de Serviço
        TelaOS os = new TelaOS();
        os.setVisible(true);
        desktop.add(os);
    }//GEN-LAST:event_MenCadOsActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // As linhas abaixo substitui a label lblData pela data atual do sistema ao iniciar o form
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        lblData.setText(formatador.format(data));
    }//GEN-LAST:event_formWindowActivated

    private void MenOpcSaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenOpcSaiActionPerformed
        // as linhas abaixo exibem uma caixa de diálogo
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Atenção!", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_MenOpcSaiActionPerformed

    private void MenAjuSobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenAjuSobActionPerformed
        // Chamando a tela sobre
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_MenAjuSobActionPerformed

    private void menCadUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadUsuActionPerformed
        // As linhas abaixo abrem o form TelaUsuário dentro do DesktopPane
        TelaUsuario usuario = new TelaUsuario();
        usuario.setVisible(true);
        desktop.add(usuario);
    }//GEN-LAST:event_menCadUsuActionPerformed

    private void MenCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenCadCliActionPerformed
        // chamar a tela de clientes
        TelaCliente cliente = new TelaCliente();
        cliente.setVisible(true);
        desktop.add(cliente);
    }//GEN-LAST:event_MenCadCliActionPerformed

    private void menRelCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menRelCliActionPerformed
        // gerando um relatório de clientes
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a impressão deste relatório?",
                "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            // imprimindo relatório com o Framework JasperReports
            try {
                // usando a classe JasperPrint para preparar a impressão de um relatório
                JasperPrint print = JasperFillManager.fillReport("/home/tadeu/Documentos/reports_prjinfox/clientes.jasper",
                        null, conexao);
                // a linha exibe o relatório através da classe JasperViewer
                JasperViewer.viewReport(print, false);
            } catch (JRException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_menRelCliActionPerformed

    private void MenRelSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenRelSerActionPerformed
        // gerando um relatório de Serviços
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a emissão deste relatório?",
                "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            // emitindo o relatório com o Framework JasperReports
            try {
                // usando a classe JasperPrint para preparar a impressão de um relatório
                JasperPrint print = JasperFillManager.fillReport("/home/tadeu/Documentos/reports_prjinfox/servicos.jasper",
                        null, conexao);
                // a linha exibe o relatório através da classe JasperViewer
                JasperViewer.viewReport(print, false);
            } catch (JRException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_MenRelSerActionPerformed
        
    public static void main(String args[]) {       
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }     
       
        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenAju;
    private javax.swing.JMenuItem MenAjuSob;
    private javax.swing.JMenuItem MenCadCli;
    private javax.swing.JMenuItem MenCadOs;
    private javax.swing.JMenu MenOpc;
    private javax.swing.JMenuItem MenOpcSai;
    private javax.swing.JMenuItem MenRelSer;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblData;
    public static javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu menCad;
    public static javax.swing.JMenuItem menCadUsu;
    public static javax.swing.JMenu menRel;
    private javax.swing.JMenuItem menRelCli;
    // End of variables declaration//GEN-END:variables
}