package alapmuvgyak;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.FileChooser;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Muveletek extends javax.swing.JFrame {

    String mentettFajl;
    Random r = new Random();
    int valasz;
    int eredmeny;
    int a;
    int b;
    int osztasKerdes = 0;
    int osszesKerdes = 0;
    int szorzasKerdes = 0;
    int osszesProba=0;
    int osztasProba=0;
    int szorzasProba=0;

    public Muveletek() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlGyakorlas = new javax.swing.JPanel();
        lblFeladat = new javax.swing.JLabel();
        txtEredmeny = new javax.swing.JTextField();
        btnEllenorzes = new javax.swing.JButton();
        lblValasz = new javax.swing.JLabel();
        btnUj = new javax.swing.JButton();
        btnMegoldas = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblOsszKerdes = new javax.swing.JLabel();
        lbllblOsszProba = new javax.swing.JLabel();
        lblEredmeny = new javax.swing.JLabel();
        lblOsszeadKerdes = new javax.swing.JLabel();
        lblKivonasKerdes = new javax.swing.JLabel();
        lblOsztasKerdes = new javax.swing.JLabel();
        lblSzorzasKerdes = new javax.swing.JLabel();
        lblOsszeadProba = new javax.swing.JLabel();
        lblKivonasProba = new javax.swing.JLabel();
        lblOsztasProba = new javax.swing.JLabel();
        lblSzorzasProba = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFajl = new javax.swing.JMenu();
        mnuFajlMegnyit = new javax.swing.JMenuItem();
        mnuFajlMent = new javax.swing.JMenuItem();
        mnuFajlMentesMaskent = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuFajlKilep = new javax.swing.JMenuItem();
        mnuMuvelet = new javax.swing.JMenu();
        mnuMuveletOsszeadas = new javax.swing.JRadioButtonMenuItem();
        mnuMuveletKivonas = new javax.swing.JRadioButtonMenuItem();
        mnuMuveletOsztas = new javax.swing.JRadioButtonMenuItem();
        mnuMuveletSzorzas = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alapműveletek gyakoroltatása");

        pnlGyakorlas.setBorder(javax.swing.BorderFactory.createTitledBorder("Gyakorlás"));

        lblFeladat.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btnEllenorzes.setText("Ellenőrzés");
        btnEllenorzes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEllenorzesActionPerformed(evt);
            }
        });

        lblValasz.setText("visszajelzés");

        javax.swing.GroupLayout pnlGyakorlasLayout = new javax.swing.GroupLayout(pnlGyakorlas);
        pnlGyakorlas.setLayout(pnlGyakorlasLayout);
        pnlGyakorlasLayout.setHorizontalGroup(
            pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblValasz, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                        .addComponent(lblFeladat, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEllenorzes)
                .addContainerGap())
        );
        pnlGyakorlasLayout.setVerticalGroup(
            pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGyakorlasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFeladat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlGyakorlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEllenorzes)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValasz, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnUj.setText("Új feladat");
        btnUj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUjActionPerformed(evt);
            }
        });

        btnMegoldas.setText("Megoldás");
        btnMegoldas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMegoldasActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Statisztika"));

        lblOsszKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszKerdes.setText("Össz kérdések száma: 0");

        lbllblOsszProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbllblOsszProba.setText("Össz Probálkozások száma: 1");

        lblEredmeny.setText("Eredmény: 0 %");

        lblOsszeadKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszeadKerdes.setText("Összeadás: 1");

        lblKivonasKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblKivonasKerdes.setText("Kivonás: 0");

        lblOsztasKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsztasKerdes.setText("Osztás: 0");

        lblSzorzasKerdes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSzorzasKerdes.setText("Szorzás: 0");

        lblOsszeadProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsszeadProba.setText("Összeadás: 1");

        lblKivonasProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblKivonasProba.setText("Kivonás: 0");

        lblOsztasProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOsztasProba.setText("Osztás: 0");

        lblSzorzasProba.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSzorzasProba.setText("Szorzás: 0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEredmeny)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOsszeadKerdes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblKivonasKerdes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsztasKerdes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSzorzasKerdes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOsszKerdes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblKivonasProba, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSzorzasProba, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblOsszeadProba, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblOsztasProba, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbllblOsszProba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblKivonasKerdes, lblOsszeadKerdes, lblOsztasKerdes, lblSzorzasKerdes});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOsszKerdes)
                    .addComponent(lbllblOsszProba))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblOsszeadKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblKivonasKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOsztasKerdes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSzorzasKerdes))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblOsszeadProba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblKivonasProba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOsztasProba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSzorzasProba)))
                .addGap(18, 18, 18)
                .addComponent(lblEredmeny)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mnuFajl.setText("Fájl");

        mnuFajlMegnyit.setText("Megnyit");
        mnuFajlMegnyit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFajlMegnyitActionPerformed(evt);
            }
        });
        mnuFajl.add(mnuFajlMegnyit);

        mnuFajlMent.setText("Ment");
        mnuFajlMent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFajlMentActionPerformed(evt);
            }
        });
        mnuFajl.add(mnuFajlMent);

        mnuFajlMentesMaskent.setText("Mentés másként...");
        mnuFajlMentesMaskent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFajlMentesMaskentActionPerformed(evt);
            }
        });
        mnuFajl.add(mnuFajlMentesMaskent);
        mnuFajl.add(jSeparator1);

        mnuFajlKilep.setText("Kilép");
        mnuFajl.add(mnuFajlKilep);

        jMenuBar1.add(mnuFajl);

        mnuMuvelet.setText("Műveletek");

        buttonGroup1.add(mnuMuveletOsszeadas);
        mnuMuveletOsszeadas.setText("Összeadás");
        mnuMuvelet.add(mnuMuveletOsszeadas);

        buttonGroup1.add(mnuMuveletKivonas);
        mnuMuveletKivonas.setText("Kivonás");
        mnuMuveletKivonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMuveletKivonasActionPerformed(evt);
            }
        });
        mnuMuvelet.add(mnuMuveletKivonas);

        buttonGroup1.add(mnuMuveletOsztas);
        mnuMuveletOsztas.setText("Osztás");
        mnuMuveletOsztas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMuveletOsztasActionPerformed(evt);
            }
        });
        mnuMuvelet.add(mnuMuveletOsztas);

        buttonGroup1.add(mnuMuveletSzorzas);
        mnuMuveletSzorzas.setText("Szorzás");
        mnuMuveletSzorzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMuveletSzorzasActionPerformed(evt);
            }
        });
        mnuMuvelet.add(mnuMuveletSzorzas);

        jMenuBar1.add(mnuMuvelet);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlGyakorlas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUj, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMegoldas, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMegoldas))
                    .addComponent(pnlGyakorlas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEllenorzesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEllenorzesActionPerformed
        
        
        try {
            valasz = Integer.parseInt(txtEredmeny.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Nem egész!");
        }
        if (eredmeny == valasz && valasz != 0) {
            btnEllenorzes.setEnabled(false);
        }
        if (mnuMuveletOsztas.isSelected()) {
            osztasProba++;
            lblOsztasProba.setText("Osztás: "+osztasProba);
        }
        else if(mnuMuveletSzorzas.isSelected()){
            szorzasProba++;
            lblSzorzasProba.setText("Szorzás: "+szorzasProba);
        }
        osszesProba++;
        lbllblOsszProba.setText("Össz Probálkozások száma: "+osszesProba);

    }//GEN-LAST:event_btnEllenorzesActionPerformed

    private void btnMegoldasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMegoldasActionPerformed

    }//GEN-LAST:event_btnMegoldasActionPerformed

    private void mnuMuveletKivonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMuveletKivonasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuMuveletKivonasActionPerformed

    private void mnuFajlMentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFajlMentActionPerformed
//        JFileChooser fc = new JFileChooser();
//        fc.setDialogTitle("Fájl mentése");
//        fc.setCurrentDirectory(new File("."));
//        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//        
//        int valasztottGomb = fc.showSaveDialog(this);
//        if (valasztottGomb == JFileChooser.APPROVE_OPTION) {
//            File f = fc.getSelectedFile();
//            if (f.isDirectory()) {
//                lblEredmeny.setText("<html>Elérés: " + f.getPath() + "<br>könyvtár: " + f.getName() + "</html>");
//                try {
//                    Files.write(Paths.get(f.getPath(), "stat.txt"), "Statisztika:".getBytes());
//                } catch (IOException ex) {
//                    Logger.getLogger(Muveletek.class.getName()).log(Level.SEVERE, null, ex);
//                }
//
//            }
//        }
        // 1. mentés során
        if (mentettFajl == null) {

            mnuFajlMentesMaskentActionPerformed(evt);

        } else {
            try {
                /*további mentéseknél a megadott helyre és a megadott néven kell menteni*/
                Files.write(Paths.get(mentettFajl), tartalomOsszeallitas().getBytes());
            } catch (IOException ex) {
                Logger.getLogger(Muveletek.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_mnuFajlMentActionPerformed

    private void mnuFajlMentesMaskentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFajlMentesMaskentActionPerformed
        JFileChooser fc = new JFileChooser(new File("."));
        fc.setDialogTitle("Fájl mentés másként...");
        fc.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter imgfilter = new FileNameExtensionFilter("PNG és GIF képek", "png", "gif");
        fc.addChoosableFileFilter(imgfilter);
        FileNameExtensionFilter txtfilter = new FileNameExtensionFilter("Szöveg", "txt");
        fc.addChoosableFileFilter(txtfilter);
        FileNameExtensionFilter xlsfilter = new FileNameExtensionFilter("Excel", "xls");
        fc.addChoosableFileFilter(xlsfilter);
        fc.setFileFilter(txtfilter);

        int valasztottGomb = fc.showSaveDialog(this);
        if (valasztottGomb == JFileChooser.APPROVE_OPTION) {
            File f = fc.getSelectedFile();
            String[] kit = ((FileNameExtensionFilter) fc.getFileFilter()).getExtensions();
            String fn = f.getName();// + "." + kit[0];

            if (!fn.contains("." + kit[0])) {
                fn += "." + kit[0];
            }
            mentettFajl = fn;
            Path path = Paths.get(fn);
            boolean mentes = true;

            if (Files.exists(path)) {
                valasztottGomb = JOptionPane.showConfirmDialog(this, "Biztosan felülírod?", "A fájl létezik", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (valasztottGomb == JOptionPane.NO_OPTION) {
                    mentes = false;
                }
            }

            lblEredmeny.setText("<html>Elérés: " + f.getPath() + "<br>Fájl neve: " + f.getName() + "</html>");
            try {

                if (mentes) {
                    Files.write(path, tartalomOsszeallitas().getBytes());
                }
            } catch (IOException ex) {
                Logger.getLogger(Muveletek.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "mentés megszakítva", "Mentés állapota:", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_mnuFajlMentesMaskentActionPerformed

    private void mnuFajlMegnyitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFajlMegnyitActionPerformed
        JFileChooser fc = new JFileChooser(new File("."));
        fc.setDialogTitle("Fájl megnyitása...");
        fc.setAcceptAllFileFilterUsed(true);
        int valasztottGomb = fc.showOpenDialog(this);
        if (valasztottGomb == JFileChooser.APPROVE_OPTION) {

            File f = fc.getSelectedFile();
            lblEredmeny.setText("<html>Elérés: " + f.getPath() + "<br>Fájl neve: " + f.getName() + "</html>");

        } else {
            JOptionPane.showMessageDialog(this, "Megnyitás megszakítva", "Megnyitás állapota:", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_mnuFajlMegnyitActionPerformed

    private void mnuMuveletOsztasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMuveletOsztasActionPerformed

        osztas();
    }//GEN-LAST:event_mnuMuveletOsztasActionPerformed

    private void btnUjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUjActionPerformed
        if (mnuMuveletOsztas.isSelected()) {
            //osztás
            osztas();
        }
        if (mnuMuveletSzorzas.isSelected()) {
            mnuMuveletSzorzasActionPerformed(evt);
        }
    }//GEN-LAST:event_btnUjActionPerformed

    private void mnuMuveletSzorzasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMuveletSzorzasActionPerformed
        osszesKerdes++;
        lblOsszKerdes.setText("Össz kérdések száma: " + osszesKerdes);
        szorzasKerdes++;
        lblSzorzasKerdes.setText("Szorzas: " + szorzasKerdes);
    }//GEN-LAST:event_mnuMuveletSzorzasActionPerformed

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
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Muveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Muveletek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEllenorzes;
    private javax.swing.JButton btnMegoldas;
    private javax.swing.JButton btnUj;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblEredmeny;
    private javax.swing.JLabel lblFeladat;
    private javax.swing.JLabel lblKivonasKerdes;
    private javax.swing.JLabel lblKivonasProba;
    private javax.swing.JLabel lblOsszKerdes;
    private javax.swing.JLabel lblOsszeadKerdes;
    private javax.swing.JLabel lblOsszeadProba;
    private javax.swing.JLabel lblOsztasKerdes;
    private javax.swing.JLabel lblOsztasProba;
    private javax.swing.JLabel lblSzorzasKerdes;
    private javax.swing.JLabel lblSzorzasProba;
    private javax.swing.JLabel lblValasz;
    private javax.swing.JLabel lbllblOsszProba;
    private javax.swing.JMenu mnuFajl;
    private javax.swing.JMenuItem mnuFajlKilep;
    private javax.swing.JMenuItem mnuFajlMegnyit;
    private javax.swing.JMenuItem mnuFajlMent;
    private javax.swing.JMenuItem mnuFajlMentesMaskent;
    private javax.swing.JMenu mnuMuvelet;
    private javax.swing.JRadioButtonMenuItem mnuMuveletKivonas;
    private javax.swing.JRadioButtonMenuItem mnuMuveletOsszeadas;
    private javax.swing.JRadioButtonMenuItem mnuMuveletOsztas;
    private javax.swing.JRadioButtonMenuItem mnuMuveletSzorzas;
    private javax.swing.JPanel pnlGyakorlas;
    private javax.swing.JTextField txtEredmeny;
    // End of variables declaration//GEN-END:variables

    private String tartalomOsszeallitas() {
        String statisztika = "Statisztika: \n";
        JLabel[] lblTomb = new JLabel[]{lblOsszKerdes,lblOsszeadProba, lblOsszeadProba, lblOsszeadKerdes, lblOsszeadProba, lblKivonasKerdes, lblKivonasProba, lblSzorzasKerdes, lblSzorzasProba, lblOsztasKerdes, lblOsztasProba};
        final int probaMaxHossz = lblOsszeadProba.getText().length();
        final int kerdesMaxHossz = lblOsszeadKerdes.getText().length();
        final int HE = 3;
        for (int i = 0; i < lblTomb.length - 1; i += 2) {
            JLabel labKerdes = lblTomb[i];
            JLabel labProba = lblTomb[i + 1];
            String formazo = "%" + (kerdesMaxHossz + HE) + "s%" + (probaMaxHossz + HE) + "s\n";
            statisztika += String.format(formazo, labKerdes.getText(), labProba.getText());

        }

        return statisztika;
    }

    private void osztas() {
        do {
            a = r.nextInt(100) + 1;
            b = r.nextInt(100) + 1;
        } while (a / b == 0 && b != 0);

        if (a > b) {
            lblFeladat.setText(a + "/" + b + "=");
            eredmeny = a / b;
        } else {
            lblFeladat.setText(b + "/" + a + "=");
            eredmeny = b / a;
        }
        osztasKerdes++;
        osszesKerdes++;
        lblOsztasKerdes.setText("Osztás: " + osztasKerdes);
        lblOsszKerdes.setText("Össz kérdések száma: " + osszesKerdes);

    }
}
