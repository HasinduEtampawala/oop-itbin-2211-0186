/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class review extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    
    
    
    
    public review() {
        initComponents();
        
        conn = DBconnect.connect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jDialog1 = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rbox = new javax.swing.JComboBox<>();
        fdbox = new javax.swing.JTextField();
        rtbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        canvas1 = new java.awt.Canvas();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bckbtn = new javax.swing.JButton();

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Feedback");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        jLabel2.setText("Rating");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        rbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rate", "1", "2", "3", "4", "5" }));
        jPanel1.add(rbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 70, -1));

        fdbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fdboxActionPerformed(evt);
            }
        });
        jPanel1.add(fdbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 240, 100));

        rtbtn.setText("Rate");
        rtbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtbtnActionPerformed(evt);
            }
        });
        jPanel1.add(rtbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, -1, -1));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, -30, -1, -1));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(100, 149, 237));
        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(100, 149, 237));
        jLabel3.setText("About Us");
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));
        jPanel8.add(canvas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        jTextArea1.setBackground(new java.awt.Color(100, 149, 237));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("\n\n         Welcome to Dream Spices,your \n        Ultimate destination for premium \n           spices sourced from the finest \n             regions around the world.\n\n           Our mission is to bring the rich,\n        authentic flavors of global cuisine\n         right to your kitchen, enhancing \n          your culinary creations with our \n             diverse range of high-quality \n                              spices.\n\nOur Story\n\n         Founded in 2022, Dream Spices was \n            born out of a passion for culinary \n        excellence and a deep appreciation \n               for the intricate flavors that \n         spices bring to food. What started \n      as a small venture has now blossomed\n          into a trusted name in the spice \n       industry, known for our commitment to \n          quality, sustainability, and customer \n                             satisfaction.");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel8.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 310, 550));

        jLabel4.setText("jLabel4");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 190, 50));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 310, 600));

        jPanel7.setBackground(new java.awt.Color(100, 149, 237));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Happy With Our Service ?");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jPanel9.setBackground(new java.awt.Color(100, 149, 237));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 360, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/5 star.png"))); // NOI18N
        jLabel6.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 200, 80));

        jLabel7.setFont(new java.awt.Font("Stencil", 0, 48)); // NOI18N
        jLabel7.setText("4.3");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 90, 80));

        jLabel9.setText("68 reviews");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fback.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 130, 120));

        bckbtn.setText("Back");
        bckbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bckbtnActionPerformed(evt);
            }
        });
        jPanel1.add(bckbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rtbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtbtnActionPerformed
        
        String feed;
        int rate;
        
        feed = fdbox.getText();
        rate = Integer.parseInt(rbox.getSelectedItem().toString());
        
        
        try {
            
            String sql ="INSERT INTO dlrrev (feedback,rate) VALUES ('"+feed+"','"+rate+"')";
            
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Thank you for your Valuable Rating..!");
           
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            
            
        }
        
        
    }//GEN-LAST:event_rtbtnActionPerformed

    private void fdboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fdboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fdboxActionPerformed

    private void bckbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bckbtnActionPerformed
      new Register().setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_bckbtnActionPerformed

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
            java.util.logging.Logger.getLogger(review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(review.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new review().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bckbtn;
    private java.awt.Canvas canvas1;
    private javax.swing.JTextField fdbox;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> rbox;
    private javax.swing.JButton rtbtn;
    // End of variables declaration//GEN-END:variables
}