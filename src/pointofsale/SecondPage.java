/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsale;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author shah
 */
public class SecondPage extends javax.swing.JFrame {

    /**
     * Creates new form SecondPage
     */
    public SecondPage() {
        initComponents();
//        setVisible(true);
//        setSize(600, 600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuyIteam = new javax.swing.JButton();
        btnAddIteam = new javax.swing.JButton();
        BtnExit = new javax.swing.JButton();
        btnShowList = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Point Of Sale");
        setMinimumSize(new java.awt.Dimension(770, 400));
        setPreferredSize(null);
        setResizable(false);
        setSize(new java.awt.Dimension(770, 400));
        getContentPane().setLayout(null);

        btnBuyIteam.setText("Buy Iteam");
        btnBuyIteam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyIteamActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuyIteam);
        btnBuyIteam.setBounds(150, 60, 110, 40);

        btnAddIteam.setText("Add item");
        btnAddIteam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddIteamActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddIteam);
        btnAddIteam.setBounds(460, 60, 110, 40);

        BtnExit.setText("Exit");
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });
        getContentPane().add(BtnExit);
        BtnExit.setBounds(460, 160, 110, 40);

        btnShowList.setText("Show Iteam");
        btnShowList.setToolTipText("Show Inventory Iteams");
        btnShowList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowListActionPerformed(evt);
            }
        });
        getContentPane().add(btnShowList);
        btnShowList.setBounds(150, 160, 110, 40);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pointofsale/Grocery_shopping_cart.jpg"))); // NOI18N
        jButton1.setMaximumSize(new java.awt.Dimension(770, 440));
        jButton1.setMinimumSize(new java.awt.Dimension(770, 440));
        jButton1.setPreferredSize(new java.awt.Dimension(770, 440));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(-10, 0, 790, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAddIteamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddIteamActionPerformed
        AddItemFrame b=new AddItemFrame();
        b.setVisible(true);
    }//GEN-LAST:event_btnAddIteamActionPerformed

    private void btnShowListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowListActionPerformed
         ArrayList<String> itemArrayList=new ArrayList<>();
    
        String file="D:\\java\\PointOfSale\\src\\pointofsale\\item.txt";
        BufferedReader br = null;
        
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SecondPage.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        String line;
        
        try {
            while((line=br.readLine())!=null){
                itemArrayList.add(line);
            }
        } catch (IOException ex) {
            Logger.getLogger(SecondPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        ArrayList<String> al = new ArrayList<String>();
for(int i=0;i<itemArrayList.size();){
    
    al.add(itemArrayList.get(i++)+","+itemArrayList.get(i++)+","+itemArrayList.get(i++)+","+itemArrayList.get(i++));
        
}
//        for(int i=0;i<al.size();i++)
//            System.out.println(al.get(i));

        new tableOfItem(al);
    }//GEN-LAST:event_btnShowListActionPerformed

    private void btnBuyIteamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyIteamActionPerformed
BuyItem b=new BuyItem();
b.setVisible(true);

b.setBounds(400, 0, 400, 350);/////////////////////////////////////////////working here 1:51Am
b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
ArrayList<String> itemArrayList=new ArrayList<>();
    
        String file="D:\\java\\PointOfSale\\src\\pointofsale\\item.txt";
        BufferedReader br = null;
        
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SecondPage.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        String line;
        
        try {
            while((line=br.readLine())!=null){
                itemArrayList.add(line);
            }
        } catch (IOException ex) {
            Logger.getLogger(SecondPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        ArrayList<String> al = new ArrayList<String>();
for(int i=0;i<itemArrayList.size();){
    
    al.add(itemArrayList.get(i++)+","+itemArrayList.get(i++)+","+itemArrayList.get(i++)+","+itemArrayList.get(i++));
        
}
//        for(int i=0;i<al.size();i++)
//            System.out.println(al.get(i));

        tableOfItem table=new tableOfItem(al);
        table.setBounds(0, 0, 400, 350);
    }//GEN-LAST:event_btnBuyIteamActionPerformed

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        setVisible(false);
    }//GEN-LAST:event_BtnExitActionPerformed

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
            java.util.logging.Logger.getLogger(SecondPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecondPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecondPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecondPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecondPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnExit;
    private javax.swing.JButton btnAddIteam;
    private javax.swing.JButton btnBuyIteam;
    private javax.swing.JButton btnShowList;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
