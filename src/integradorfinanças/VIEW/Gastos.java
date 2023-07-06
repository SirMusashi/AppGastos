/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package integradorfinanças.VIEW;

import integradorfinanças.CONEXAO.ConexaoDB;

import integradorfinanças.MODEL.GastosFixos;
import integradorfinanças.VALIDATION.Metodos;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno.costa2
 */
public class Gastos extends javax.swing.JFrame {
    GastosFixos gf;

    /**
     * Creates new form Gastos
     */
    public Gastos() {
        initComponents();
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
        jTextFieldAgua = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldLuz = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldAluguel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldInternet = new javax.swing.JTextField();
        jButtonOkGastosFixos = new javax.swing.JButton();
        jButtonGastosFixosOutros = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Água :");

        jTextFieldAgua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAguaKeyTyped(evt);
            }
        });

        jLabel2.setText("Luz :");

        jTextFieldLuz.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldLuzKeyTyped(evt);
            }
        });

        jLabel3.setText("Telefone :");

        jTextFieldTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTelefoneKeyTyped(evt);
            }
        });

        jLabel4.setText("Internet :");

        jTextFieldAluguel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAluguelKeyTyped(evt);
            }
        });

        jLabel5.setText("GASTOS FIXOS");

        jLabel6.setText("Aluguel :");

        jTextFieldInternet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldInternetKeyTyped(evt);
            }
        });

        jButtonOkGastosFixos.setText("OK");
        jButtonOkGastosFixos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkGastosFixosActionPerformed(evt);
            }
        });

        jButtonGastosFixosOutros.setText("Outros");
        jButtonGastosFixosOutros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGastosFixosOutrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(113, 113, 113)
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldLuz, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(96, 96, 96)
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldInternet, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 100, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonOkGastosFixos)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonGastosFixosOutros)
                .addGap(162, 162, 162))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLuz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldInternet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonGastosFixosOutros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jButtonOkGastosFixos)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGastosFixosOutrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGastosFixosOutrosActionPerformed
        Outros outros = new Outros();
        outros.setVisible(true);
    }//GEN-LAST:event_jButtonGastosFixosOutrosActionPerformed

    private void jButtonOkGastosFixosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkGastosFixosActionPerformed
    ConexaoDB cDB = new ConexaoDB();
    
    float soma;
             
        if(gf == null) {
            
            gf = new GastosFixos(Float.parseFloat(jTextFieldAgua.getText()),Float.parseFloat(jTextFieldLuz.getText()), 
                                 Float.parseFloat(jTextFieldInternet.getText()), Float.parseFloat(jTextFieldTelefone.getText()),
                                  Float.parseFloat(jTextFieldAluguel.getText()));
        Metodos metodo = new Metodos();
        
         soma =  metodo.somaGastosFixos(Float.parseFloat(jTextFieldAgua.getText()),
                Float.parseFloat(jTextFieldLuz.getText()),
                Float.parseFloat(jTextFieldTelefone.getText()),
                Float.parseFloat(jTextFieldInternet.getText()),
                Float.parseFloat(jTextFieldAluguel.getText()));
            
            
            
            cDB.inserir("gastosfixos(gastofixototal)" , "(" +
                     "\'" +soma+ "\'"+
                        
                    ")");
            
            gf = null;
            
        }       
        dispose();
        
               
        
    }//GEN-LAST:event_jButtonOkGastosFixosActionPerformed

    private void jTextFieldAguaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAguaKeyTyped
       String caracteres="0987654321";
    if(!caracteres.contains(evt.getKeyChar()+"") || caracteres.isBlank()){
        JOptionPane.showMessageDialog(rootPane, "Apenas números");
    evt.consume();
}
    }//GEN-LAST:event_jTextFieldAguaKeyTyped

    private void jTextFieldLuzKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLuzKeyTyped
        String caracteres="0987654321";
if(!caracteres.contains(evt.getKeyChar()+"") || caracteres.isBlank()){
        JOptionPane.showMessageDialog(rootPane, "Apenas números");
evt.consume();
}
    }//GEN-LAST:event_jTextFieldLuzKeyTyped

    private void jTextFieldTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefoneKeyTyped
        String caracteres="0987654321";
if(!caracteres.contains(evt.getKeyChar()+"") || caracteres.isBlank()){
        JOptionPane.showMessageDialog(rootPane, "Apenas números");
evt.consume();
}
    }//GEN-LAST:event_jTextFieldTelefoneKeyTyped

    private void jTextFieldInternetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldInternetKeyTyped
        String caracteres="0987654321";
if(!caracteres.contains(evt.getKeyChar()+"") || caracteres.isBlank()){
        JOptionPane.showMessageDialog(rootPane, "Apenas números");
evt.consume();
}
    }//GEN-LAST:event_jTextFieldInternetKeyTyped

    private void jTextFieldAluguelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAluguelKeyTyped
        String caracteres="0987654321";
if(!caracteres.contains(evt.getKeyChar()+"") || caracteres.isBlank()){
        JOptionPane.showMessageDialog(rootPane, "Apenas números");
evt.consume();
}
    }//GEN-LAST:event_jTextFieldAluguelKeyTyped

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
            java.util.logging.Logger.getLogger(Gastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gastos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGastosFixosOutros;
    private javax.swing.JButton jButtonOkGastosFixos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextFieldAgua;
    private javax.swing.JTextField jTextFieldAluguel;
    private javax.swing.JTextField jTextFieldInternet;
    private javax.swing.JTextField jTextFieldLuz;
    private javax.swing.JTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
