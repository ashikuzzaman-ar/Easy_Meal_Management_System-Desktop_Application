package home;

import java.awt.Color;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

class ViewStatusFrame extends javax.swing.JFrame {

    
    private double totalDeposit;
    private double totalSpend;
    private double currentDeposit;
    private double totalMeal;
    private double mealRate;
    private double averageShoppingPerDay;
    private int dayCount;
    private final int memberCount = MemberEntryForm.rowNumber();
    
    private File file = new File("");
    private Scanner scan;
    
    
    
    public ViewStatusFrame() {
        initComponents();
        
        
        
        
        DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        lDate.setText("Date: "+date.format(new Date()));
        showResult();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pViewStatusFrame = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lTotaleDeposit = new javax.swing.JLabel();
        tfTotalDeposit = new javax.swing.JTextField();
        lTotalSpend = new javax.swing.JLabel();
        tfTtalSpend = new javax.swing.JTextField();
        lCurrentDeposit = new javax.swing.JLabel();
        tfCurrentDeposit = new javax.swing.JTextField();
        lTotalMeal = new javax.swing.JLabel();
        tfTotalMeal = new javax.swing.JTextField();
        lMealRate = new javax.swing.JLabel();
        tfMealRate = new javax.swing.JTextField();
        lAverageShoppingPerDay = new javax.swing.JLabel();
        tfAverageShoppingPerDay = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        bViewFullMode = new javax.swing.JButton();
        bOk = new javax.swing.JButton();
        lDate = new javax.swing.JLabel();

        setTitle("Current Status");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Current Overview");

        lTotaleDeposit.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        lTotaleDeposit.setText("Total Deposit: ");

        tfTotalDeposit.setEditable(false);

        lTotalSpend.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        lTotalSpend.setText("Total Spend: ");

        tfTtalSpend.setEditable(false);

        lCurrentDeposit.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        lCurrentDeposit.setText("Current Deposit: ");

        tfCurrentDeposit.setEditable(false);

        lTotalMeal.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        lTotalMeal.setText("Total Meal: ");

        tfTotalMeal.setEditable(false);

        lMealRate.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        lMealRate.setText("Meal Rate: ");

        tfMealRate.setEditable(false);

        lAverageShoppingPerDay.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        lAverageShoppingPerDay.setText("Average Shopping Per Day:");

        tfAverageShoppingPerDay.setEditable(false);

        bViewFullMode.setText("View Full Mode");
        bViewFullMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bViewFullModeActionPerformed(evt);
            }
        });

        bOk.setText("OK");
        bOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pViewStatusFrameLayout = new javax.swing.GroupLayout(pViewStatusFrame);
        pViewStatusFrame.setLayout(pViewStatusFrameLayout);
        pViewStatusFrameLayout.setHorizontalGroup(
            pViewStatusFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pViewStatusFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lDate, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 72, Short.MAX_VALUE))
            .addGroup(pViewStatusFrameLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(pViewStatusFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pViewStatusFrameLayout.createSequentialGroup()
                        .addGroup(pViewStatusFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lTotalMeal)
                            .addComponent(lTotalSpend)
                            .addGroup(pViewStatusFrameLayout.createSequentialGroup()
                                .addGroup(pViewStatusFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lTotaleDeposit)
                                    .addComponent(lAverageShoppingPerDay)
                                    .addComponent(lCurrentDeposit))
                                .addGap(18, 18, 18)
                                .addGroup(pViewStatusFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfAverageShoppingPerDay, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(tfTotalDeposit)
                                    .addComponent(tfCurrentDeposit))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pViewStatusFrameLayout.createSequentialGroup()
                        .addGroup(pViewStatusFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pViewStatusFrameLayout.createSequentialGroup()
                                .addComponent(bViewFullMode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bOk, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pViewStatusFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pViewStatusFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfTotalMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator3)
                                    .addComponent(tfTtalSpend, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator2)
                                    .addComponent(jSeparator4)
                                    .addComponent(jSeparator5)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pViewStatusFrameLayout.createSequentialGroup()
                                        .addComponent(lMealRate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                                        .addComponent(tfMealRate, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator6))
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pViewStatusFrameLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bOk, bViewFullMode});

        pViewStatusFrameLayout.setVerticalGroup(
            pViewStatusFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pViewStatusFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pViewStatusFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pViewStatusFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTotalDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTotaleDeposit))
                .addGap(3, 3, 3)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(pViewStatusFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTotalSpend)
                    .addComponent(tfTtalSpend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pViewStatusFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCurrentDeposit)
                    .addComponent(tfCurrentDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pViewStatusFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTotalMeal)
                    .addComponent(tfTotalMeal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pViewStatusFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lMealRate)
                    .addComponent(tfMealRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pViewStatusFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lAverageShoppingPerDay)
                    .addComponent(tfAverageShoppingPerDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pViewStatusFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bOk)
                    .addComponent(bViewFullMode))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pViewStatusFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pViewStatusFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOkActionPerformed
        
        dispose();
    }//GEN-LAST:event_bOkActionPerformed

    private void bViewFullModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bViewFullModeActionPerformed

        ViewFullMode.viewFullMode();
        dispose();
    }//GEN-LAST:event_bViewFullModeActionPerformed

    
    
    
    private void showResult(){
        
        
        tfTotalDeposit.setText(String.valueOf(getTotaleDeposit()));
        tfTtalSpend.setText(String.valueOf(getTotaleSpend()));
        tfCurrentDeposit.setText(String.valueOf(getCurrentDeposit()));
        tfTotalMeal.setText(String.valueOf(getTotalMeal()));
        tfMealRate.setText(String.valueOf(getMealRate()));
        tfAverageShoppingPerDay.setText(String.valueOf(getAverageShoppingPerDay()));
    }
    
    
    
    
    
    private double getAverageShoppingPerDay(){
        
        averageShoppingPerDay = 0;
        
        if(dayCount!=0){
            
            averageShoppingPerDay = totalSpend/dayCount;
        }
        
        return averageShoppingPerDay;
    }
    
    
    
    
    
    double getMealRate(){
        
        mealRate = 0;
        
        if(totalMeal!=0){
            
            mealRate = totalSpend/totalMeal;
        }
        
        return mealRate;
    }
    
    
    
    
    
    
    private double getTotalMeal(){
        
        totalMeal = 0;
        dayCount = 0;
        
        try {
            
            scan = new Scanner(new File(file.getAbsolutePath()+"/.EMMS-Res/meal-status.txt"));
            while(scan.hasNext()){
                scan.next();
                for(int i=0; i<memberCount; i++){
                    totalMeal+=(Double.valueOf(scan.next()));
                }
                dayCount++;
            }
            scan.close();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "File Operation Failed!");
        }
        
        
        return totalMeal;
    }
    
    
    
    
    
    
    
    private double getCurrentDeposit(){
        
        currentDeposit = 0;
        
        currentDeposit = totalDeposit - totalSpend;
        
        return currentDeposit;
    }
    
    
    
    
    
    private double getTotaleSpend(){
        
        totalSpend = 0;
        
        try {
            
            scan = new Scanner(new File(file.getAbsolutePath()+"/.EMMS-Res/shopping-status.txt"));
            while(scan.hasNext()){
                scan.nextLine();
                totalSpend+=(Double.valueOf(scan.nextLine()));
            }
            scan.close();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "File Operation Failed!");
        } finally {
            
            if(currentDeposit<0){
            
                tfTtalSpend.setBackground(Color.yellow);
                tfCurrentDeposit.setBackground(Color.yellow);

                tfTtalSpend.setForeground(Color.RED);
                tfCurrentDeposit.setForeground(Color.RED);
            }
        }
        
        return totalSpend;
    }
    
    
    
    
    
    private double getTotaleDeposit(){
        
        totalDeposit = 0;
        
        try {
            
            scan = new Scanner(new File(file.getAbsolutePath()+"/.EMMS-Res/payment-status.txt"));
            while(scan.hasNext()){
                scan.next();
                for(int i=0; i<memberCount; i++){
                    totalDeposit+=(Double.valueOf(scan.next()));
                }
            }
            scan.close();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "File Operation Failed!");
        }
        
        return totalDeposit;
    }
    
    
    
    
    
    public static void viewStatusFrame() {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewStatusFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewStatusFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewStatusFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewStatusFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStatusFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bOk;
    private javax.swing.JButton bViewFullMode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lAverageShoppingPerDay;
    private javax.swing.JLabel lCurrentDeposit;
    private javax.swing.JLabel lDate;
    private javax.swing.JLabel lMealRate;
    private javax.swing.JLabel lTotalMeal;
    private javax.swing.JLabel lTotalSpend;
    private javax.swing.JLabel lTotaleDeposit;
    private javax.swing.JPanel pViewStatusFrame;
    private javax.swing.JTextField tfAverageShoppingPerDay;
    private javax.swing.JTextField tfCurrentDeposit;
    private javax.swing.JTextField tfMealRate;
    private javax.swing.JTextField tfTotalDeposit;
    private javax.swing.JTextField tfTotalMeal;
    private javax.swing.JTextField tfTtalSpend;
    // End of variables declaration//GEN-END:variables
}
