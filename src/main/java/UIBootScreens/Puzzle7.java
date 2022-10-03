/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UIBootScreens;

import backend.TextRenderer;
import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import backend.AnswerChecker;
import java.io.FileNotFoundException;
import backend.AccountManeger;

/**
 *
 * @author darrenl
 */


public class Puzzle7 extends javax.swing.JFrame {

    /**
     * Creates new form BootUp
     */
    public Puzzle7() {
        initComponents();
        setLocationRelativeTo(null);
        
        // DOESNT work without direct file path. I AM NOT GOING INSANE IT DOESTN WORK. 
        printDisplayText("Data\\Puzzles\\Puzzle7.txt");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        DisplayTextArea = new javax.swing.JTextArea();
        AnswerTextField = new javax.swing.JTextField();
        AnswerCheckButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        DisplayTextArea.setEditable(false);
        DisplayTextArea.setBackground(new java.awt.Color(0, 0, 0));
        DisplayTextArea.setColumns(20);
        DisplayTextArea.setForeground(new java.awt.Color(0, 153, 0));
        DisplayTextArea.setRows(5);
        jScrollPane1.setViewportView(DisplayTextArea);

        AnswerTextField.setBackground(new java.awt.Color(0, 0, 0));
        AnswerTextField.setForeground(new java.awt.Color(51, 102, 0));
        AnswerTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerTextFieldActionPerformed(evt);
            }
        });

        AnswerCheckButton.setBackground(new java.awt.Color(0, 0, 0));
        AnswerCheckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerCheckButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AnswerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AnswerCheckButton, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AnswerTextField)
                    .addComponent(AnswerCheckButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AnswerTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnswerTextFieldActionPerformed

    private void AnswerCheckButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerCheckButtonActionPerformed

          
        try {
             boolean cuurentStatus = AnswerChecker.checkAnswer(AnswerTextField.getText(), false, 7);
             
             if (cuurentStatus == true){
                 AccountManeger.LevelSaver("FINISHED!");
                 dispose();
             }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Puzzle7.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Puzzle7.class.getName()).log(Level.SEVERE, null, ex);
        }
          

  
              

                   
          
          
    }//GEN-LAST:event_AnswerCheckButtonActionPerformed
        private void printDisplayText(String File) {

        TextRenderer renderer = new TextRenderer(DisplayTextArea, 10, File);

        Thread thread = new Thread(renderer);
        
        thread.start();
        

       
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
            java.util.logging.Logger.getLogger(Puzzle7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Puzzle7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Puzzle7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Puzzle7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Puzzle7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnswerCheckButton;
    private javax.swing.JTextField AnswerTextField;
    private javax.swing.JTextArea DisplayTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
