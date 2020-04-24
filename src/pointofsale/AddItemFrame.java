/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsale;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AddItemFrame extends javax.swing.JFrame {

    /**
     * Creates new form BuyItemFrame
     */
    public AddItemFrame() {
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

        lblName = new javax.swing.JLabel();
        lblUnitPrice = new javax.swing.JLabel();
        lblCode = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        TFNameOfItem = new javax.swing.JTextField();
        tfUnitPrice = new javax.swing.JTextField();
        tfCodeOfItem = new javax.swing.JTextField();
        tfQuantityOfItem = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Point Of Sale");
        setMinimumSize(new java.awt.Dimension(734, 400));
        setPreferredSize(new java.awt.Dimension(734, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        lblName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblName.setText("Name");
        getContentPane().add(lblName);
        lblName.setBounds(180, 110, 60, 30);

        lblUnitPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUnitPrice.setText("Unit Price");
        getContentPane().add(lblUnitPrice);
        lblUnitPrice.setBounds(170, 150, 180, 60);

        lblCode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCode.setText("Item Code");
        getContentPane().add(lblCode);
        lblCode.setBounds(170, 230, 83, 22);

        lblQuantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblQuantity.setText("Item Quantity");
        getContentPane().add(lblQuantity);
        lblQuantity.setBounds(160, 280, 110, 50);

        TFNameOfItem.setText("Enter Name");
        getContentPane().add(TFNameOfItem);
        TFNameOfItem.setBounds(340, 110, 160, 30);

        tfUnitPrice.setText("Enter Unit Price");
        getContentPane().add(tfUnitPrice);
        tfUnitPrice.setBounds(340, 170, 160, 30);

        tfCodeOfItem.setText("Enter Code of Item");
        getContentPane().add(tfCodeOfItem);
        tfCodeOfItem.setBounds(340, 230, 160, 30);

        tfQuantityOfItem.setText("Enter Quantity ");
        tfQuantityOfItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQuantityOfItemActionPerformed(evt);
            }
        });
        getContentPane().add(tfQuantityOfItem);
        tfQuantityOfItem.setBounds(340, 290, 160, 30);

        btnSave.setText("Save Item");
        btnSave.setToolTipText("Save Item to Inventory");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave);
        btnSave.setBounds(240, 330, 140, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Add Item");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 50, 112, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pointofsale/446033.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(734, 400));
        jLabel1.setMinimumSize(new java.awt.Dimension(734, 400));
        jLabel1.setPreferredSize(new java.awt.Dimension(770, 400));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -90, 740, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfQuantityOfItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQuantityOfItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfQuantityOfItemActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            itemAdding item1=new itemAdding(TFNameOfItem.getText(),tfCodeOfItem.getText(),tfUnitPrice.getText(),tfQuantityOfItem.getText());
        } catch (IOException ex) {
            Logger.getLogger(AddItemFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnSave.setLabel("Item Added");
    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(AddItemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddItemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddItemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddItemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddItemFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFNameOfItem;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblUnitPrice;
    private javax.swing.JTextField tfCodeOfItem;
    private javax.swing.JTextField tfQuantityOfItem;
    private javax.swing.JTextField tfUnitPrice;
    // End of variables declaration//GEN-END:variables

}