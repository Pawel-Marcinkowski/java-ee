package tjee.marcinkowski_pawel_lab1;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbOkno extends javax.swing.JFrame {

    String id, pracownik, stanowisko, nrPokoju, dataZatrudnienia;
    boolean czyZdalnie, czyUrlop;
    
    public DbOkno() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tPole = new javax.swing.JTextArea();
        bPolacz = new javax.swing.JButton();
        bRozlacz = new javax.swing.JButton();
        bWypisz = new javax.swing.JButton();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldPracownik = new javax.swing.JTextField();
        jTextFieldStanowisko = new javax.swing.JTextField();
        jTextFieldPokoj = new javax.swing.JTextField();
        jTextFieldData = new javax.swing.JTextField();
        jCheckBoxZdalne = new javax.swing.JCheckBox();
        jCheckBoxUrlop = new javax.swing.JCheckBox();
        bDodaj = new javax.swing.JButton();
        bEksportuj = new javax.swing.JButton();
        bUsun = new javax.swing.JButton();
        jTextFieldUsun = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tPole.setColumns(20);
        tPole.setRows(5);
        jScrollPane1.setViewportView(tPole);

        bPolacz.setText("Połącz");
        bPolacz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPolaczActionPerformed(evt);
            }
        });

        bRozlacz.setText("Rozłącz");
        bRozlacz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRozlaczActionPerformed(evt);
            }
        });

        bWypisz.setText("Wypisz / Aktualizuj");
        bWypisz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bWypiszActionPerformed(evt);
            }
        });

        jTextFieldID.setText("ID Pracownika");
        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });

        jTextFieldPracownik.setText("Pracownik");
        jTextFieldPracownik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPracownikActionPerformed(evt);
            }
        });

        jTextFieldStanowisko.setText("Stanowisko");
        jTextFieldStanowisko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldStanowiskoActionPerformed(evt);
            }
        });

        jTextFieldPokoj.setText("Nr pokoju");
        jTextFieldPokoj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPokojActionPerformed(evt);
            }
        });

        jTextFieldData.setText("Data zatrudnienia");
        jTextFieldData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataActionPerformed(evt);
            }
        });

        jCheckBoxZdalne.setText("Czy zdalnie?");
        jCheckBoxZdalne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxZdalneActionPerformed(evt);
            }
        });

        jCheckBoxUrlop.setText("Czy urlop?");
        jCheckBoxUrlop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxUrlopActionPerformed(evt);
            }
        });

        bDodaj.setText("Dodaj");
        bDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDodajActionPerformed(evt);
            }
        });

        bEksportuj.setText("Eksportuj");
        bEksportuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEksportujActionPerformed(evt);
            }
        });

        bUsun.setText("Usuń");
        bUsun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUsunActionPerformed(evt);
            }
        });

        jTextFieldUsun.setText("ID Pracownika");
        jTextFieldUsun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 53, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bPolacz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bRozlacz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(bWypisz, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextFieldUsun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bDodaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bUsun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(90, 90, 90))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldPracownik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldStanowisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldPokoj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBoxZdalne)
                                .addGap(10, 10, 10)
                                .addComponent(jCheckBoxUrlop)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bEksportuj)
                                .addGap(32, 32, 32))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPolacz)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPracownik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldStanowisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPokoj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxZdalne)
                    .addComponent(jCheckBoxUrlop))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bRozlacz)
                    .addComponent(bDodaj))
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldUsun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(bUsun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(bEksportuj))
                    .addComponent(bWypisz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bPolaczActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPolaczActionPerformed
         boolean connect = false;
        try {
            connect = Marcinkowski_pawel_lab1.Connect();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DbOkno.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (connect) {
            tPole.setText("Połączono");
        } else {
            tPole.setText("Nie połączono");
        }
    }//GEN-LAST:event_bPolaczActionPerformed

    private void bRozlaczActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRozlaczActionPerformed
        boolean connect = false;
        try {
            connect = Marcinkowski_pawel_lab1.Disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(DbOkno.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (connect) {
            tPole.setText("Rozłączono");
        } else {
            tPole.setText("Nie rozłączono");
        }
    }//GEN-LAST:event_bRozlaczActionPerformed

    private void bWypiszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bWypiszActionPerformed
        boolean connect = true;
        String out;
        try {
            if (connect) {
                out = Marcinkowski_pawel_lab1.getData();
                tPole.removeAll();
                tPole.setText(out);
            } else {
                tPole.setText("Nie połączono");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbOkno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bWypiszActionPerformed

    private void jTextFieldPokojActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPokojActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPokojActionPerformed

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDActionPerformed

    private void jTextFieldPracownikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPracownikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPracownikActionPerformed

    private void jTextFieldStanowiskoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldStanowiskoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldStanowiskoActionPerformed

    private void jTextFieldDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDataActionPerformed

    private void jCheckBoxZdalneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxZdalneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxZdalneActionPerformed

    private void jCheckBoxUrlopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxUrlopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxUrlopActionPerformed

    private void bDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDodajActionPerformed
        id = jTextFieldID.getText();
        pracownik = jTextFieldPracownik.getText();
        stanowisko = jTextFieldStanowisko.getText();
        nrPokoju = jTextFieldPokoj.getText();
        dataZatrudnienia = jTextFieldData.getText();
        
        if (jCheckBoxZdalne.isSelected()) {
            czyZdalnie = true;
        } else {
            czyZdalnie = false;
        }
        
        if (jCheckBoxUrlop.isSelected()) {
            czyUrlop = true;
        } else {
            czyUrlop = false;
        }
        
    try {
        Marcinkowski_pawel_lab1.insertData(id, pracownik, stanowisko, nrPokoju, dataZatrudnienia, czyZdalnie, czyUrlop);
    } catch (SQLException ex) {
        Logger.getLogger(DbOkno.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_bDodajActionPerformed

    private void bUsunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUsunActionPerformed
        id = jTextFieldUsun.getText();
        try {
        Marcinkowski_pawel_lab1.deleteData(id);
    } catch (SQLException ex) {
        Logger.getLogger(DbOkno.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_bUsunActionPerformed

    private void jTextFieldUsunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsunActionPerformed

    private void bEksportujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEksportujActionPerformed
        
        try {
            Marcinkowski_pawel_lab1.saveData();
        } catch (SQLException ex) {
            Logger.getLogger(DbOkno.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_bEksportujActionPerformed

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
            java.util.logging.Logger.getLogger(DbOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DbOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DbOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DbOkno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DbOkno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDodaj;
    private javax.swing.JButton bEksportuj;
    private javax.swing.JButton bPolacz;
    private javax.swing.JButton bRozlacz;
    private javax.swing.JButton bUsun;
    private javax.swing.JButton bWypisz;
    private javax.swing.JCheckBox jCheckBoxUrlop;
    private javax.swing.JCheckBox jCheckBoxZdalne;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldPokoj;
    private javax.swing.JTextField jTextFieldPracownik;
    private javax.swing.JTextField jTextFieldStanowisko;
    private javax.swing.JTextField jTextFieldUsun;
    private javax.swing.JTextArea tPole;
    // End of variables declaration//GEN-END:variables
}
