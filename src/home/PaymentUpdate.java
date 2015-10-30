
package home;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PaymentUpdate extends javax.swing.JFrame {

    
    private DateFormat dateFormat;
    private Date date;
    private Scanner scan ;
    private File file = new File("");
    private DefaultTableModel tableModel;
    private String resultString;
    private Formatter f;
    
    
    public PaymentUpdate() {
        initComponents();
        
        
        
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        date = new Date();
        tfCurrentDate.setText(dateFormat.format(date));
        tableModel = (DefaultTableModel)tblPaymentUpdate.getModel();
        getNameID();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lTitle = new javax.swing.JLabel();
        spPaymentUpdate = new javax.swing.JScrollPane();
        tblPaymentUpdate = new javax.swing.JTable();
        tfCurrentDate = new javax.swing.JTextField();
        bUpdatePayment = new javax.swing.JButton();
        bCancel = new javax.swing.JButton();
        bRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Payment");
        setResizable(false);

        lTitle.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        lTitle.setForeground(new java.awt.Color(0, 102, 0));
        lTitle.setText("Update Payment Through :");

        tblPaymentUpdate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spPaymentUpdate.setViewportView(tblPaymentUpdate);
        if (tblPaymentUpdate.getColumnModel().getColumnCount() > 0) {
            tblPaymentUpdate.getColumnModel().getColumn(0).setResizable(false);
            tblPaymentUpdate.getColumnModel().getColumn(1).setResizable(false);
            tblPaymentUpdate.getColumnModel().getColumn(2).setResizable(false);
        }

        tfCurrentDate.setEditable(false);
        tfCurrentDate.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N

        bUpdatePayment.setText("Upload Payment");
        bUpdatePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdatePaymentActionPerformed(evt);
            }
        });

        bCancel.setText("Cancel");
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });

        bRefresh.setText("Refresh");
        bRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spPaymentUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTitle))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfCurrentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bUpdatePayment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(bCancel, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(bRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bCancel, bUpdatePayment});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCurrentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(spPaymentUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(bUpdatePayment)
                        .addGap(36, 36, 36)
                        .addComponent(bRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bCancel)
                        .addGap(47, 47, 47))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed

        dispose();
    }//GEN-LAST:event_bCancelActionPerformed

    private void bRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRefreshActionPerformed

        dispose();
        paymentUpdate();
    }//GEN-LAST:event_bRefreshActionPerformed

    private void bUpdatePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdatePaymentActionPerformed

        fileWrite();
        JOptionPane.showMessageDialog(null, "Payment successfully Uploaded by "+tfCurrentDate.getText());
    }//GEN-LAST:event_bUpdatePaymentActionPerformed

    
    
    
    
    private void fileWrite(){
        
        getInfo();
        
        try {
            
            f = new Formatter(file.getAbsolutePath()+"/.EMMS-Res/payment-status.txt");
            f.format("%s", resultString);
            f.close();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "File Operation Failed!");
        }
    }
    
    
    
    
    
    
    private void getInfo(){
        
        resultString = "";
        
        try {
            
            scan = new Scanner(new File(file.getAbsolutePath()+"/.EMMS-Res/payment-status.txt"));
            while(scan.hasNext()){
                
                resultString += (scan.nextLine()+"\n");
            }
            scan.close();
            
            resultString+=(tfCurrentDate.getText()+" ");
            for(int i=0; i<tableModel.getRowCount(); i++){
                
                resultString+=(tblPaymentUpdate.getValueAt(i, 2)+" ");
            }
            resultString += "\n";
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "File Operation Faled!");
        }
    }
    
    
    
    
    
    
    
    private void getNameID(){
        
        
        try {
            
            scan = new Scanner(new File(file.getAbsolutePath()+"/.EMMS-Res/member-list.txt"));
            while(scan.hasNext()){
                
                tableModel.insertRow(tableModel.getRowCount(), new Object[]{
                    scan.nextLine(),scan.nextLine(),"0"
                });
            }
            scan.close();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "File Operation Failed!");
        }
        
    }
    
    
    
    
    
    public static void paymentUpdate() {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaymentUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancel;
    private javax.swing.JButton bRefresh;
    private javax.swing.JButton bUpdatePayment;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lTitle;
    private javax.swing.JScrollPane spPaymentUpdate;
    private javax.swing.JTable tblPaymentUpdate;
    private javax.swing.JTextField tfCurrentDate;
    // End of variables declaration//GEN-END:variables
}
