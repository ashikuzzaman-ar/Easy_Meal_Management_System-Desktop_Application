package gui;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import src.ConnectToDatabase;

class ViewStatusFrame extends javax.swing.JFrame {


    public ViewStatusFrame() {
        initComponents();

        DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        lDate.setText("Date: " + date.format(new Date()));
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
        tfTotalSpend = new javax.swing.JTextField();
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

        tfTotalSpend.setEditable(false);

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
                                    .addComponent(tfTotalSpend, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(tfTotalSpend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void showResult() {

        try {

            String sql = "SELECT SUM(amount) AS total_amount FROM payment_info";

            ResultSet resultSet = ConnectToDatabase.getResult(sql);

            if (resultSet.next()) {

                this.tfTotalDeposit.setText(resultSet.getString("total_amount"));
            }

            sql = "SELECT SUM(cost) AS total_cost FROM shopping_cost";

            resultSet = ConnectToDatabase.getResult(sql);

            if (resultSet.next()) {

                this.tfTotalSpend.setText(resultSet.getString("total_cost"));
            }

            double currentDeposit = Double.valueOf(this.tfTotalDeposit.getText())
                    - Double.valueOf(this.tfTotalSpend.getText());
            tfCurrentDeposit.setText(String.valueOf(
                    currentDeposit
            ));

            if (currentDeposit < 0) {

                this.tfCurrentDeposit.setBackground(Color.red);
            }

            sql = "SELECT SUM(meal) AS total_meal FROM meal_info";

            resultSet = ConnectToDatabase.getResult(sql);

            if (resultSet.next()) {

                this.tfTotalMeal.setText(resultSet.getString("total_meal"));
            }

            double mealRate = Double.valueOf(this.tfTotalSpend.getText())
                    / Double.valueOf(this.tfTotalMeal.getText());

            this.tfMealRate.setText(String.valueOf(mealRate));

            sql = "SELECT SUM(cost) / COUNT(DISTINCT date) AS average_shopping "
                    + " FROM shopping_cost";

            resultSet = ConnectToDatabase.getResult(sql);

            if (resultSet.next()) {

                this.tfAverageShoppingPerDay.setText(resultSet.getString("average_shopping"));
            }
        } catch (SQLException | NumberFormatException e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void viewStatusFrame() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewStatusFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
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
    private javax.swing.JTextField tfTotalSpend;
    // End of variables declaration//GEN-END:variables
}
