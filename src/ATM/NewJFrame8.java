/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM;

/**
 *
 * @author kashy
 */
public class NewJFrame8 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame8
     */
    public NewJFrame8() {
        initComponents();
        setSize(900, 500);
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
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 3, 24)); // NOI18N
        jLabel1.setText("BANK  OF  INDORE... :-)");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(53, 43, 461, 59);

        jLabel2.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel2.setText("BANKING ISSUES ..... NO PROBLEM!!!!");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(261, 108, 361, 28);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel3.setText("ACTIVATE INTERNET BANKING THROUGH OTP--->");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(69, 195, 285, 33);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel4.setText("ENTER MOBILE NUMBER->");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(69, 260, 185, 29);

        jTextField1.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(285, 262, 217, 24);

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jButton1.setText("GENERATE OTP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(197, 320, 146, 39);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ATM/graphicstock-white-piggy-bank-isolated-on-blue-background_HYdxD3IbGOZ_SB_PM.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 900, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
