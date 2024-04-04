/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form;

public class form extends javax.swing.JFrame {
    public form() {
        initComponents();
        Desabilitar();
        Habilitar();
    }
void Desabilitar(){
 txn1.setEditable(false);
 txn2.setEditable(false);
 txres.setEditable(false);
 
 }
void Habilitar(){
 txn1.setEditable(true);
 txn2.setEditable(true);
 txres.setEditable(true);
 
 }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txn1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txn2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txres = new javax.swing.JTextField();
        btn_soma = new javax.swing.JButton();
        btn_sub = new javax.swing.JButton();
        btn_mult = new javax.swing.JButton();
        btn_div = new javax.swing.JButton();
        btn_new = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        btn_comparison = new javax.swing.JButton();
        btn_return = new javax.swing.JButton();
        btn_par = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("N1");

        txn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txn1ActionPerformed(evt);
            }
        });

        jLabel2.setText("N2");

        txn2.setToolTipText("");

        jLabel3.setText("RES");

        btn_soma.setText("+");
        btn_soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_somaActionPerformed(evt);
            }
        });

        btn_sub.setText("-");
        btn_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subActionPerformed(evt);
            }
        });

        btn_mult.setText("*");
        btn_mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multActionPerformed(evt);
            }
        });

        btn_div.setText("/");
        btn_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divActionPerformed(evt);
            }
        });

        btn_new.setText("novo");
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });

        btn_clear.setText("limpar");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn_exit.setText("sair");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        btn_comparison.setText("comparaçao");
        btn_comparison.setToolTipText("");
        btn_comparison.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comparisonActionPerformed(evt);
            }
        });

        btn_return.setText("Retornar");
        btn_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnActionPerformed(evt);
            }
        });

        btn_par.setText("Impar/Par");
        btn_par.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_parActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(txn1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txn2)
                                .addComponent(txres))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btn_soma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_sub)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_mult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_div)
                        .addGap(18, 18, 18)
                        .addComponent(btn_return))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_new)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_clear)
                        .addGap(18, 18, 18)
                        .addComponent(btn_exit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_comparison)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_par)))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_soma)
                    .addComponent(btn_sub)
                    .addComponent(btn_mult)
                    .addComponent(btn_div)
                    .addComponent(btn_return))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_new)
                    .addComponent(btn_clear)
                    .addComponent(btn_exit)
                    .addComponent(btn_comparison)
                    .addComponent(btn_par))
                .addGap(0, 119, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txn1ActionPerformed

    }//GEN-LAST:event_txn1ActionPerformed

    private void btn_somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_somaActionPerformed

        double x, y, z;
        String r;
        x =Double.parseDouble(txn1.getText());
        y = Double.parseDouble(txn2.getText());
        
        z = x + y;
        r = String.valueOf(z);
        txres.setText(r);

    }//GEN-LAST:event_btn_somaActionPerformed

    private void btn_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subActionPerformed

        double x, y, z;
        String r;
        x =Double.parseDouble(txn1.getText());
        y = Double.parseDouble(txn2.getText());
        
        z = x - y;
        r = String.valueOf(z);
        txres.setText(r);
    }//GEN-LAST:event_btn_subActionPerformed

    private void btn_multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multActionPerformed

        double x, y, z;
        String r;
        x =Double.parseDouble(txn1.getText());
        y = Double.parseDouble(txn2.getText());
        
        z = x * y;
        r = String.valueOf(z);
        txres.setText(r);
    }//GEN-LAST:event_btn_multActionPerformed

    private void btn_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divActionPerformed

        double x, y, z;
        String r;
        x =Double.parseDouble(txn1.getText());
        y = Double.parseDouble(txn2.getText());
        
        z = x / y;
        r = String.valueOf(z);
        txres.setText(r);
    }//GEN-LAST:event_btn_divActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed

        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed

        txn1.setText("");
        txn2.setText("");
        txres.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed

        Habilitar();
        
        
    }//GEN-LAST:event_btn_newActionPerformed

    private void btn_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnActionPerformed

        index frame1 = new index (); 
 
        frame1.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_returnActionPerformed

    private void btn_comparisonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comparisonActionPerformed

        double x,y; 
        
        x = Double.parseDouble(txn1.getText());
        y = Double.parseDouble(txn2.getText());
        
        if(x == y){
            txres.setText("O número 1 é igual ao número 2");
        }
        else{
            txres.setText("Os números não são iguais");
        }
    }//GEN-LAST:event_btn_comparisonActionPerformed

    private void btn_parActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_parActionPerformed

        double x,y;
        x = Double.parseDouble(txn1.getText());
        y = Double.parseDouble(txn2.getText());
        
        if(x%2==0 && y%2 == 0){
            txres.setText("Ambos sao pares");
    }//GEN-LAST:event_btn_parActionPerformed
        else if(x%2==0 && y%2!=0){
            txres.setText("Somente o primeiro numero é par");
        }
        else if(x%2!=0 && y%2==0){
            txres.setText("Somente o numero dois é par");
        }
        else{
            txres.setText("Ambos os numeros sao impares");
        }
    }

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
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_comparison;
    private javax.swing.JButton btn_div;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_mult;
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_par;
    private javax.swing.JButton btn_return;
    private javax.swing.JButton btn_soma;
    private javax.swing.JButton btn_sub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txn1;
    private javax.swing.JTextField txn2;
    private javax.swing.JTextField txres;
    // End of variables declaration//GEN-END:variables
}
