/*
 * Peter Horne-Deus
 * PutridPizza.java
 * calculates cost of pizza determind by diamater of pizza inputed by user
 * October 9,2018
 */

package PutridPizza;

import java.text.*;

public class PutridPizza extends javax.swing.JFrame {

    
    
    public PutridPizza() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPnl = new javax.swing.JPanel();
        titelLbl = new javax.swing.JLabel();
        titelLbl2 = new javax.swing.JLabel();
        diameterLbl = new javax.swing.JLabel();
        subtotalLbl = new javax.swing.JLabel();
        taxLbl = new javax.swing.JLabel();
        totalLbl = new javax.swing.JLabel();
        diameterInputTxtField = new javax.swing.JTextField();
        AnchoviesLbl = new javax.swing.JLabel();
        olivesLbl = new javax.swing.JLabel();
        calculateBtn = new javax.swing.JButton();
        messageLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundPnl.setBackground(new java.awt.Color(255, 255, 0));
        backgroundPnl.setForeground(new java.awt.Color(0, 204, 0));
        backgroundPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titelLbl.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        titelLbl.setForeground(new java.awt.Color(255, 255, 255));
        titelLbl.setText("Putrids Pizza");
        backgroundPnl.add(titelLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, 50));

        titelLbl2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        titelLbl2.setForeground(new java.awt.Color(255, 0, 0));
        titelLbl2.setText("Putrids Pizza");
        backgroundPnl.add(titelLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        diameterLbl.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        diameterLbl.setForeground(new java.awt.Color(204, 0, 0));
        diameterLbl.setText("Diameter Of Pizza (cm): ");
        backgroundPnl.add(diameterLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        subtotalLbl.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        subtotalLbl.setForeground(new java.awt.Color(204, 0, 0));
        subtotalLbl.setText("Subtotal:");
        backgroundPnl.add(subtotalLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        taxLbl.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        taxLbl.setForeground(new java.awt.Color(204, 0, 0));
        taxLbl.setText("Tax:");
        backgroundPnl.add(taxLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        totalLbl.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        totalLbl.setForeground(new java.awt.Color(204, 0, 0));
        totalLbl.setText("Total: ");
        backgroundPnl.add(totalLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));
        backgroundPnl.add(diameterInputTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 50, -1));

        AnchoviesLbl.setIcon(new javax.swing.ImageIcon("Y:\\Documents\\anchovies.png")); // NOI18N
        backgroundPnl.add(AnchoviesLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 100, 80));

        olivesLbl.setIcon(new javax.swing.ImageIcon("Y:\\Documents\\veggicopia-olives-product_800x800.jpg")); // NOI18N
        backgroundPnl.add(olivesLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 100, 70));

        calculateBtn.setText("Calculate");
        calculateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBtnActionPerformed(evt);
            }
        });
        backgroundPnl.add(calculateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        messageLbl.setForeground(new java.awt.Color(204, 0, 0));
        backgroundPnl.add(messageLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 470, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBtnActionPerformed
        //A money format
        DecimalFormat money = new DecimalFormat("$###,###.##");
        
        //variables
        int pizzaDiameter;
        double tax,subtotal,total;
        
        //constens 
        final double TAX = 0.13;
        final double LABOUR = 0.75;
        final double RENT = 0.99;
        final double COST_PER_CM = 0.50;
        
        //geting diameter information
        pizzaDiameter = Integer.parseInt(diameterInputTxtField.getText());
        
        //Setting the output of the cost of the pizza 
        subtotal = pizzaDiameter * COST_PER_CM + RENT + LABOUR;
        tax = subtotal * TAX;
        total = tax + subtotal;
        
        //Output labeling 
        if (pizzaDiameter <= 15 && pizzaDiameter >= 1){
            messageLbl.setText("We are going to make you a cute little pizza!");
        }
        else if (pizzaDiameter >= 16 && pizzaDiameter <= 40){
            messageLbl.setText("This will be delicious");
        }
        else {
            messageLbl.setText ("Whoa, big pizza! You might need a truck to get this home!");
        }
        
        subtotalLbl.setText("Subtotal: " + money.format(subtotal));
        taxLbl.setText("Tax: " + money.format(tax));
        totalLbl.setText("Total: " + money.format(total));
        
        //Reseting
        diameterInputTxtField.setText(" ");
    }//GEN-LAST:event_calculateBtnActionPerformed

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
            java.util.logging.Logger.getLogger(PutridPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PutridPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PutridPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PutridPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PutridPizza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnchoviesLbl;
    private javax.swing.JPanel backgroundPnl;
    private javax.swing.JButton calculateBtn;
    private javax.swing.JTextField diameterInputTxtField;
    private javax.swing.JLabel diameterLbl;
    private javax.swing.JLabel messageLbl;
    private javax.swing.JLabel olivesLbl;
    private javax.swing.JLabel subtotalLbl;
    private javax.swing.JLabel taxLbl;
    private javax.swing.JLabel titelLbl;
    private javax.swing.JLabel titelLbl2;
    private javax.swing.JLabel totalLbl;
    // End of variables declaration//GEN-END:variables
}
