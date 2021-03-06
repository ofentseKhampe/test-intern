/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_Interface;

import data.NotFoundException;
import data.userPD;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author ofentse
 */
public class results extends javax.swing.JFrame {

    /**
     * Creates new form results
     */
    public results() {
        initComponents();
        int cntSurvey,minimumAge,maximumAge,cntPizz,cntPasta,cntPap;
        double pizzaPerc,pastaPerc,PapPerc;
        DecimalFormat df=new DecimalFormat("0.00");
        double avgAge;
        userPD objUser;
        
        try {
            
            objUser=new userPD();
            cntSurvey=objUser.cntSurvey();
            avgAge=objUser.AverageAge();
            maximumAge=objUser.maxAge();
            minimumAge=objUser.minAge();
            
            cntPasta=objUser.cntPasta();
            cntPizz=objUser.cntPizza();
            cntPap=objUser.cntPap();
            
            pastaPerc=(cntPasta/100)*cntSurvey;
            pizzaPerc=(cntPizz/cntSurvey)*100;
            PapPerc=(cntPap/cntSurvey)*100;
            
            
            
            taDisplay.append("\nTotal number of surveys     : "+cntSurvey+"\n");
            taDisplay.append("Average Age     : "+avgAge+"\n");
            taDisplay.append("Oldest person who participated in survey    : "+maximumAge+"\n");
            taDisplay.append("Youngest person who participated in survey  : "+minimumAge+"\n");
            taDisplay.append("\n");
            taDisplay.append("Percentage of people who like Pizza     : "+String.format("%.3f",pastaPerc)+"%\n");
            taDisplay.append("Percentage of people who like Pasta     : "+cntPizz+"%\n");
            taDisplay.append("Percentage of people who like Pap and Wors     : "+cntPap+"%\n");
            
        } catch (NotFoundException e) {
            
            JOptionPane.showMessageDialog(null, e.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDisplay = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        taDisplay.setEditable(false);
        taDisplay.setColumns(20);
        taDisplay.setRows(5);
        taDisplay.setBorder(null);
        jScrollPane1.setViewportView(taDisplay);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 56, 598, 414));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_logout_rounded_left_50px.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, -1, 50));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new results().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taDisplay;
    // End of variables declaration//GEN-END:variables
}
