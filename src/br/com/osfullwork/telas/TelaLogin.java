package br.com.osfullwork.telas;

import java.sql.*; 
import br.com.osfullwork.dal.ModuloConexao; 
import java.awt.Color;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    Connection conexao = null; 
    PreparedStatement pst = null; 
    ResultSet rs = null; 

    public void logar() { 

        String sql = "select * from tbusuarios where login = ? and senha = ?";
        try {
            // as linhas abaixo preparam a consulta ao Banco em função do que foi digitado nas caixas de texto
            // o interroga é substituído pelo conteúdo das variáveis
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtUsuario.getText());
            pst.setString(2, txtSenha.getText());
            // a linha abaixo executa a query
            rs = pst.executeQuery();
            // se existir usuário e senha correspondente
            if (rs.next()) {
                // a linha abaixo obtém o conteúdo do campo perfil da tabela tbusuarios
                String perfil = rs.getString(6);                            
                // A estrutura abaixo faz o tratamento do perfil so usuário
                if (perfil.equals("admin")) {
                    // a linha abaixo exibe o conteúdo do campo da tabela                
                    TelaPrincipal principal = new TelaPrincipal();
                    principal.setVisible(true);
                    TelaPrincipal.menRel.setEnabled(true);
                    TelaPrincipal.menCadUsu.setEnabled(true);
                    TelaPrincipal.lblUsuario.setText(rs.getString(2));
                    TelaPrincipal.lblUsuario.setForeground(Color.red);
                    this.dispose(); // fechar a tela de login
                    //conexao.close(); // fechar a conexão do banco de dados                 
                } else {
                    TelaPrincipal principal = new TelaPrincipal();
                    principal.setVisible(true);         
                    TelaPrincipal.lblUsuario.setText(rs.getString(2));
                    this.dispose(); // fechar a tela de login
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválido(s)!");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
   
    public TelaLogin() {
        initComponents();

        conexao = ModuloConexao.conector();        
        if (conexao != null) {
            lblMsgStatus.setText("Banco de Dados conectado com sucesso!");
            lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/osfullwork/imagens/dbok.png")));
        } else {
            lblMsgStatus.setText("Falha ao tentar se conectar com o Banco de Dados!");
            lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/osfullwork/imagens/dberror.png")));
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        lblStatus = new javax.swing.JLabel();
        lblMsgStatus = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OS Full Work v1.0");
        setResizable(false);

        jLabel1.setText("Usuário");

        jLabel2.setText("Senha");

        btnLogin.setText("Efetuar Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/osfullwork/imagens/dberror.png"))); // NOI18N

        lblMsgStatus.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        lblMsgStatus.setPreferredSize(new java.awt.Dimension(200, 20));

        jLabel3.setFont(new java.awt.Font("Ubuntu Light", 1, 24)); // NOI18N
        jLabel3.setText("OS Full Work v1.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLogin)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(lblMsgStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(8, 8, 8)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(17, 17, 17)
                                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStatus)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addGap(2, 2, 2)
                        .addComponent(lblMsgStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(354, 219));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // chamando o método logar
        logar();
    }//GEN-LAST:event_btnLoginActionPerformed

    public static void main(String args[]) {            
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new TelaLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblMsgStatus;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
