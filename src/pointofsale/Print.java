/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointofsale;

import java.awt.Label;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author shah
 */
public class Print extends javax.swing.JFrame {

    /**
     * Creates new form Print
     */
    public Print() throws FileNotFoundException, IOException {
        Object result = JOptionPane.showInputDialog(getContentPane(), "Enter Payment Received:");
        initComponents();
        double totalAmountOfBill=0.0;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now();  
   date.setText(dtf.format(now));
   ArrayList<String> itemArrayList=new ArrayList<>();
    
        String file="D:\\java\\PointOfSale\\src\\pointofsale\\bill.txt";
        BufferedReader br = null;        
            br = new BufferedReader(new FileReader(file));
        String line;      
            while((line=br.readLine())!=null){
                itemArrayList.add(line);
            }
           

//           Label label=new Label();
//           getContentPane().add(label);
//           label.setBounds(140, 180, 530, 30);
//           label.setText("fuck");
//           label.setVisible(true);
//           getContentPane().add(label);
int size=itemArrayList.size();
size=size/4;
int j=215,count=0;
for(int i=1;i<=size;i++){
     javax.swing.JLabel ItemNamelbl1;
     javax.swing.JLabel amountlbl1;
     javax.swing.JLabel quantitylbl1;
     javax.swing.JLabel slash11;
     javax.swing.JLabel slash21;
     javax.swing.JLabel slash31;
     javax.swing.JLabel unitPricelbl1;
    ItemNamelbl1 = new javax.swing.JLabel();
        slash11 = new javax.swing.JLabel();
        unitPricelbl1 = new javax.swing.JLabel();
        slash21 = new javax.swing.JLabel();
        quantitylbl1 = new javax.swing.JLabel();
        slash31 = new javax.swing.JLabel();
        amountlbl1 = new javax.swing.JLabel();
        
           ItemNamelbl1.setText(itemArrayList.get(count++));
        getContentPane().add(ItemNamelbl1);
        ItemNamelbl1.setBounds(140, j, 220, 20);

        slash11.setText("|");
        getContentPane().add(slash11);
        slash11.setBounds(360, j, 10, 20);

        unitPricelbl1.setText(itemArrayList.get(count));
        getContentPane().add(unitPricelbl1);
        unitPricelbl1.setBounds(370, j, 60, 20);
double a=Double.parseDouble(itemArrayList.get(count));
count++;
        slash21.setText("|");
        getContentPane().add(slash21);
        slash21.setBounds(440, j, 10, 20);
count++;
        quantitylbl1.setText(itemArrayList.get(count));
        getContentPane().add(quantitylbl1);
        quantitylbl1.setBounds(450, j, 60, 20);
        double b=Double.parseDouble(itemArrayList.get(count));
        count++;
/////////////////////////////////////////////////////
        slash31.setText("|");
        getContentPane().add(slash31);
        slash31.setBounds(510, j, 10, 20);

    
    double amountSpecificItem=0.0;
    amountSpecificItem=a*b;
    totalAmountOfBill=totalAmountOfBill+amountSpecificItem;
    
        amountlbl1.setText(Double.toString(amountSpecificItem));
        getContentPane().add(amountlbl1);
        amountlbl1.setBounds(520, j, 60, 20);
j=j+15;        
}

//for(int i=0;i<itemArrayList.size();){
//    i++;
//    double a=Double.parseDouble(itemArrayList.get(i++));
//    double b=Double.parseDouble(itemArrayList.get(i++));
//    i++;
//    
//}
javax.swing.JLabel netAmount;
netAmount = new javax.swing.JLabel();
netAmount.setText("         Net Amount :   "+totalAmountOfBill);
        getContentPane().add(netAmount);
        netAmount.setBounds(309, j=j+15, 220, 20);
        javax.swing.JLabel payment;
payment = new javax.swing.JLabel();
        payment.setText("Payment Received:   "+(String) result);
        getContentPane().add(payment);
        payment.setBounds(300, j=j+15, 220, 20);
        javax.swing.JLabel balanceReturn;
        balanceReturn = new javax.swing.JLabel();
        double returnn=Double.parseDouble((String) result);
        balanceReturn.setText("Balance Returned to Customer:   "+(returnn-totalAmountOfBill));
        getContentPane().add(balanceReturn);
        balanceReturn.setBounds(233, j=j+15, 250, 20);
        javax.swing.JLabel thankyou;
        thankyou = new javax.swing.JLabel();
        thankyou.setText("THANK YOU FOR VISITING US!");
        getContentPane().add(thankyou);
        thankyou.setBounds(300, j=j+30, 500, 20);
        thankyou.setFont(new java.awt.Font("Tahoma", 2, 24));
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
        jLabel5 = new javax.swing.JLabel();
        CounterPersonName = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        ItemNamelbl = new javax.swing.JLabel();
        slash1 = new javax.swing.JLabel();
        unitPricelbl = new javax.swing.JLabel();
        slash2 = new javax.swing.JLabel();
        quantitylbl = new javax.swing.JLabel();
        slash3 = new javax.swing.JLabel();
        amountlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(733, 543));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel1.setText("SSW MALL");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(290, 20, 159, 51);

        jLabel2.setText("Mansehra Road Mandian, Abbottabad.");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(260, 60, 290, 20);

        jLabel3.setText("Ph:03369195539");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 80, 120, 14);

        jLabel4.setText("Bil Payment Id:1017633");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 120, 120, 20);

        jLabel5.setText("Bill #1009825");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(140, 140, 90, 20);

        CounterPersonName.setText("Counter by:XYZ");
        getContentPane().add(CounterPersonName);
        CounterPersonName.setBounds(140, 160, 100, 20);

        date.setText("date");
        date.setToolTipText("");
        getContentPane().add(date);
        date.setBounds(340, 140, 310, 14);

        ItemNamelbl.setText("Iteam Name");
        getContentPane().add(ItemNamelbl);
        ItemNamelbl.setBounds(140, 200, 220, 20);

        slash1.setText("|");
        getContentPane().add(slash1);
        slash1.setBounds(360, 200, 10, 20);

        unitPricelbl.setText("Unit Price");
        getContentPane().add(unitPricelbl);
        unitPricelbl.setBounds(370, 200, 60, 20);

        slash2.setText("|");
        getContentPane().add(slash2);
        slash2.setBounds(440, 200, 10, 20);

        quantitylbl.setText("Quantity");
        getContentPane().add(quantitylbl);
        quantitylbl.setBounds(450, 200, 60, 20);

        slash3.setText("|");
        getContentPane().add(slash3);
        slash3.setBounds(510, 200, 10, 20);

        amountlbl.setText("Amount");
        amountlbl.setMinimumSize(new java.awt.Dimension(42, 14));
        amountlbl.setPreferredSize(new java.awt.Dimension(42, 14));
        getContentPane().add(amountlbl);
        amountlbl.setBounds(520, 200, 60, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Print().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Print.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CounterPersonName;
    private javax.swing.JLabel ItemNamelbl;
    private javax.swing.JLabel amountlbl;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel quantitylbl;
    private javax.swing.JLabel slash1;
    private javax.swing.JLabel slash2;
    private javax.swing.JLabel slash3;
    private javax.swing.JLabel unitPricelbl;
    // End of variables declaration//GEN-END:variables
}
