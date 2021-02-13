package tjee.lab1.derby;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbOkno extends javax.swing.JFrame {
String ID, IMIE, NAZWISKO;
    public DbOkno() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tPole = new javax.swing.JTextPane();
        bConnect = new javax.swing.JButton();
        bRozlacz = new javax.swing.JButton();
        bWypisz = new javax.swing.JButton();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldIMIE = new javax.swing.JTextField();
        jTextFieldNAZWISKO = new javax.swing.JTextField();
        bDodaj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(tPole);

        bConnect.setText("Połącz");
        bConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConnectActionPerformed(evt);
            }
        });

        bRozlacz.setText("Rozłącz");
        bRozlacz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRozlaczActionPerformed(evt);
            }
        });

        bWypisz.setText("Wypisz");
        bWypisz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bWypiszActionPerformed(evt);
            }
        });

        jTextFieldID.setText("ID");
        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });

        jTextFieldIMIE.setText("IMIE");
        jTextFieldIMIE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIMIEActionPerformed(evt);
            }
        });

        jTextFieldNAZWISKO.setText("NAZWISKO");
        jTextFieldNAZWISKO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNAZWISKOActionPerformed(evt);
            }
        });

        bDodaj.setText("Dodaj");
        bDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDodajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(bConnect)
                                .addGap(84, 84, 84)
                                .addComponent(bRozlacz))
                            .addComponent(bDodaj))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bWypisz))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldIMIE, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNAZWISKO)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bConnect)
                    .addComponent(bRozlacz)
                    .addComponent(bWypisz))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldIMIE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNAZWISKO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(bDodaj)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConnectActionPerformed
       boolean connect = false;
        try {
            connect = DbManager.Connect();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DbOkno.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (connect) {
            tPole.setText("Połączono");
        } else {
            tPole.setText("Nie połączono");
        }
    }//GEN-LAST:event_bConnectActionPerformed

    private void bRozlaczActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRozlaczActionPerformed
        boolean connect = false;
        try {
            connect = DbManager.Disconnect();
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
                out = DbManager.getData();
                tPole.removeAll();
                tPole.setText(out);
            } else {
                tPole.setText("Nie połączono");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbOkno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bWypiszActionPerformed

    private void bDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDodajActionPerformed
        ID = jTextFieldID.getText();
        IMIE = jTextFieldIMIE.getText();
        NAZWISKO = jTextFieldNAZWISKO.getText();
    try {
        DbManager.insertData(ID, IMIE, NAZWISKO);
    } catch (SQLException ex) {
        Logger.getLogger(DbOkno.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_bDodajActionPerformed

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
    }//GEN-LAST:event_jTextFieldIDActionPerformed

    private void jTextFieldIMIEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIMIEActionPerformed
    }//GEN-LAST:event_jTextFieldIMIEActionPerformed

    private void jTextFieldNAZWISKOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNAZWISKOActionPerformed
    }//GEN-LAST:event_jTextFieldNAZWISKOActionPerformed

    public static void main(String args[]) {
       
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
       

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DbOkno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bConnect;
    private javax.swing.JButton bDodaj;
    private javax.swing.JButton bRozlacz;
    private javax.swing.JButton bWypisz;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldIMIE;
    private javax.swing.JTextField jTextFieldNAZWISKO;
    private javax.swing.JTextPane tPole;
    // End of variables declaration//GEN-END:variables
}
