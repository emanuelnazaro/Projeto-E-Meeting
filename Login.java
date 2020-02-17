/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Modelos.Classe_Usuario_Comum;
import Modelos.Comum;
import Modelos.Coordenador;
import Modelos.Gestor;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author junior
 */
public class Login extends javax.swing.JFrame {
    
    Formulario_CadU_Comum fcu;
    Comum comum = new Comum();
    Gestor gestor = new Gestor();
    Coordenador coordenador = new Coordenador();
    ArrayList<Comum> listaUsuarioComum = new ArrayList<>();
    private String nome;
    private String senha;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }
    public String percorrendoListaU(){
        
        String info = "";
        
        for(Comum comum: listaUsuarioComum){
            info += comum;
        }
        return info;
    }
    
    public void dadosUsuario_Comum(){
        comum.setUsuario(txtLogin.getText());
        comum.setSenha(txtPassword.getText());
    }
    
    public void dadosUsuarioGestor(){
        gestor.setUsuario(txtLogin.getText());
        gestor.setSenha(txtPassword.getText());
    }
    
    public void dadosUsuarioCoordenador(){
        coordenador.setUsuario(txtLogin.getText());
        coordenador.setSenha(txtPassword.getText());
    }
    
    
    
    public void recebendoObjeto(){
        
        dadosUsuario_Comum();
        listaUsuarioComum.add(comum);
    }
    
    public void validarAcesso(){
          
          dadosUsuario_Comum();
         
          if (comum.getUsuario().equals("") && comum.getSenha().equals("")) {
              JOptionPane.showMessageDialog(null, "Preencha os Campos");
          }
          else
             if (comum.getUsuario().equals("") && comum.getSenha() != "") {
                 JOptionPane.showMessageDialog(null, "Campo Login esta vazio!");
          }
          else
             if (comum.getUsuario().equals("user") && comum.getSenha().equals("adm123")) {
                 JOptionPane.showMessageDialog(null, "Bem-Vindo(a) Usuario!");
                
                 dispose();
                 Menu_Comum menu = new Menu_Comum();
                 menu.setVisible(true);
          }
          else{
                 
                 dadosUsuarioGestor();
          
                 if (gestor.getUsuario().equals("") && gestor.getSenha().equals("")) {
                     JOptionPane.showMessageDialog(null, "Preencha os Campos");
                 }
              else
                 if (gestor.getUsuario().equals("") && gestor.getSenha() != "") {
                     JOptionPane.showMessageDialog(null, "Campo Login esta vazio!");
                 }
                 else
                  if (gestor.getUsuario().equals("admin") && gestor.getSenha().equals("admin")) {
                      JOptionPane.showMessageDialog(null, "Bem-Vindo(a) Gestor!");
                      dispose();
                      Menu_Gestor mg = new  Menu_Gestor();
                      mg.setVisible(true);
                 }
                 else{
                   
                     dadosUsuarioCoordenador();
                     if (coordenador.getUsuario().equals("") && coordenador.getSenha().equals("")) {
                         JOptionPane.showMessageDialog(null, "Preencha os Campos");
                      }
                   else
                      if (coordenador.getUsuario().equals("") && coordenador.getSenha() != "") {
                          JOptionPane.showMessageDialog(null, "Campo Login esta vazio!");
                       }
                    else
                       if (coordenador.getUsuario().equals("admin1") && coordenador.getSenha().equals("12345")) {
                           JOptionPane.showMessageDialog(null, "Bem-Vindo(a) Coordenador!");
                           dispose();
                           Menu_Coordenador mc = new Menu_Coordenador();
                           mc.setVisible(true);
                       }
                       else{
                            dispose();
                            Formulario_CadU_Comum f = new Formulario_CadU_Comum();
                            f.logandoNovoUsuario(txtLogin.getText(), txtPassword.getText());
                           
                       }
                     
                    }
             
             
            }
   
    
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setText("E-Meeting");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Login:");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setText("Password:");

        btnEntrar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEntrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtLogin)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrar)
                    .addComponent(btnSair))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
        validarAcesso();
        recebendoObjeto();
        txtLogin.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
