/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CountingGame;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Nadir K T
 */
public class OddEven extends javax.swing.JFrame {

    static int score=0;
    static int count=0;
    Random r=new Random();
    int randNum;
    public OddEven() {
        initComponents();
        randNum=r.nextInt();
        lblNumber.setText(String.valueOf(randNum));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNumber = new javax.swing.JLabel();
        btnOdd = new javax.swing.JButton();
        btnEven = new javax.swing.JButton();
        lblScore = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNumber.setText("jLabel1");

        btnOdd.setText("ODD");
        btnOdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOddActionPerformed(evt);
            }
        });

        btnEven.setText("EVEN");

        lblScore.setText("jLabel2");

        jTextField1.setText("SCORE");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(lblNumber)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblScore)
                        .addGap(172, 172, 172))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addComponent(btnEven)
                        .addGap(91, 91, 91))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(lblNumber)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOdd)
                    .addComponent(btnEven))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblScore)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOddActionPerformed
        count=count+1;
        int number=Integer.parseInt(lblNumber.getText());
        if(count==10){
            if(number%2!=0){
                score=score+1;
                lblNumber.setText(String.valueOf(score));
                randNum=r.nextInt(100);
            }else{
                randNum=r.nextInt(100);
                lblNumber.setText(String.valueOf(randNum));
            }
            JOptionPane.showMessageDialog(this,"Your SCORE is :"+score+"/10");
            count=0;
            score=0;
            lblScore.setText("");
            randNum=r.nextInt(100);
            lblNumber.setText(String.valueOf(randNum));
        }
        else{
            if(number%2!=0){
                score=score+1;
                lblScore.setText(String.valueOf(score));
                randNum=r.nextInt(100);
                lblNumber.setText(String.valueOf(randNum));
            }
            else{
                randNum=r.nextInt(100);
                lblNumber.setText(String.valueOf(randNum));
            }
        }
    }//GEN-LAST:event_btnOddActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnEvenActionPerformed(java.awt.event.ActionEvent evt) {                                       
        count=count+1;
        int number=Integer.parseInt(lblNumber.getText());
        if(count==10){
            if(number%2==0){
                score=score+1;
                lblNumber.setText(String.valueOf(score));
                randNum=r.nextInt(100);
            }else{
                randNum=r.nextInt(100);
                lblNumber.setText(String.valueOf(randNum));
            }
            JOptionPane.showMessageDialog(this,"Your SCORE is :"+score+"/10");
            count=0;
            score=0;
            lblScore.setText("");
            randNum=r.nextInt(100);
            lblNumber.setText(String.valueOf(randNum));
        }
        else{
            if(number%2==0){
                score=score+1;
                lblScore.setText(String.valueOf(score));
                randNum=r.nextInt(100);
                lblNumber.setText(String.valueOf(randNum));
            }
            else{
                randNum=r.nextInt(100);
                lblNumber.setText(String.valueOf(randNum));
            }
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(OddEven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OddEven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OddEven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OddEven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OddEven().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEven;
    private javax.swing.JButton btnOdd;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblScore;
    // End of variables declaration//GEN-END:variables
}
