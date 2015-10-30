package gui;

import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import src.ConnectToDatabase;

public class DailyUpdate extends javax.swing.JFrame {
    
    private final DefaultTableModel tableModel;
    private final DateFormat dateFormat;
    private final Date date;
    
    
    public DailyUpdate() {
        initComponents();
        
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        date = new Date();
        lCurrentDate.setText(lCurrentDate.getText() + dateFormat.format(date));
        tfModificationDate.setText(dateFormat.format(date));
        tableModel = (DefaultTableModel) tblMealUpdate.getModel();
        tableInitializer();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpTop = new javax.swing.JDesktopPane();
        pTop = new javax.swing.JPanel();
        lModificationDate = new javax.swing.JLabel();
        tfModificationDate = new javax.swing.JTextField();
        lCurrentDate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMealUpdate = new javax.swing.JTable();
        lMealUpdate = new javax.swing.JLabel();
        pButtonGroup = new javax.swing.JPanel();
        sepOne = new javax.swing.JSeparator();
        sepTwo = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        tfShoppingCost = new javax.swing.JTextField();
        bUpdateShoppingCost = new javax.swing.JButton();
        bUpdateMeal = new javax.swing.JButton();
        bCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Daily Update");
        setResizable(false);

        lModificationDate.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        lModificationDate.setText("Enter Modification Date [ Editable ] :");

        tfModificationDate.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N

        lCurrentDate.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        lCurrentDate.setText("Current Date: ");

        javax.swing.GroupLayout pTopLayout = new javax.swing.GroupLayout(pTop);
        pTop.setLayout(pTopLayout);
        pTopLayout.setHorizontalGroup(
            pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pTopLayout.createSequentialGroup()
                        .addComponent(lModificationDate, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfModificationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pTopLayout.createSequentialGroup()
                        .addComponent(lCurrentDate)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pTopLayout.setVerticalGroup(
            pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lModificationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfModificationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lCurrentDate)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dpTopLayout = new javax.swing.GroupLayout(dpTop);
        dpTop.setLayout(dpTopLayout);
        dpTopLayout.setHorizontalGroup(
            dpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        dpTopLayout.setVerticalGroup(
            dpTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpTopLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(pTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        dpTop.setLayer(pTop, javax.swing.JLayeredPane.DEFAULT_LAYER);

        tblMealUpdate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Meal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMealUpdate);
        if (tblMealUpdate.getColumnModel().getColumnCount() > 0) {
            tblMealUpdate.getColumnModel().getColumn(0).setResizable(false);
            tblMealUpdate.getColumnModel().getColumn(1).setResizable(false);
            tblMealUpdate.getColumnModel().getColumn(2).setResizable(false);
        }

        lMealUpdate.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        lMealUpdate.setForeground(new java.awt.Color(175, 18, 184));
        lMealUpdate.setText("Meal Update");

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        jLabel1.setText("Shopping Cost");

        tfShoppingCost.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        tfShoppingCost.setText("0");
        tfShoppingCost.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        bUpdateShoppingCost.setText("Update Shopping Cost");
        bUpdateShoppingCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateShoppingCostActionPerformed(evt);
            }
        });

        bUpdateMeal.setText("Update Meal");
        bUpdateMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateMealActionPerformed(evt);
            }
        });

        bCancel.setText("Cancel");
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pButtonGroupLayout = new javax.swing.GroupLayout(pButtonGroup);
        pButtonGroup.setLayout(pButtonGroupLayout);
        pButtonGroupLayout.setHorizontalGroup(
            pButtonGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pButtonGroupLayout.createSequentialGroup()
                .addGroup(pButtonGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pButtonGroupLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pButtonGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sepTwo)
                            .addComponent(sepOne)))
                    .addGroup(pButtonGroupLayout.createSequentialGroup()
                        .addGroup(pButtonGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pButtonGroupLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(pButtonGroupLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(bUpdateShoppingCost))
                            .addGroup(pButtonGroupLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(tfShoppingCost, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pButtonGroupLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pButtonGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bCancel)
                    .addComponent(bUpdateMeal))
                .addGap(17, 17, 17))
        );

        pButtonGroupLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bCancel, bUpdateMeal, bUpdateShoppingCost});

        pButtonGroupLayout.setVerticalGroup(
            pButtonGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pButtonGroupLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfShoppingCost, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bUpdateShoppingCost)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(sepOne, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sepTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bUpdateMeal)
                .addGap(18, 18, 18)
                .addComponent(bCancel)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dpTop))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(lMealUpdate)))
                        .addGap(18, 18, 18)
                        .addComponent(pButtonGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dpTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lMealUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addComponent(pButtonGroup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed
        
        dispose();
    }//GEN-LAST:event_bCancelActionPerformed

    private void bUpdateShoppingCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateShoppingCostActionPerformed
        
        try {
            
            if (!"".equals(this.tfShoppingCost.getText())) {

                String sql = "INSERT INTO shopping_cost("
                        + "date,cost) VALUES("
                        + "\"" + this.dateFormat.format(date) + "\","
                        + "\"" + this.tfShoppingCost.getText() + "\")";
                
                ConnectToDatabase.getResult(sql);
            } else {
                
                JOptionPane.showMessageDialog(null, "Please enter a shopping cost.");
            }
            JOptionPane.showMessageDialog(null, "Shopping cost updated by "
                    + tfModificationDate.getText());
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_bUpdateShoppingCostActionPerformed

    private void bUpdateMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateMealActionPerformed
        
        try {
            
            for (int i = this.tableModel.getRowCount() - 1; i >= 0; i--) {
                
                if (!"".equals(this.tableModel.getValueAt(i, 2))) {
                    
                    String sql = "INSERT INTO meal_info("
                            + "id,date,meal) VALUES("
                            + "\"" + this.tableModel.getValueAt(i, 0) + "\","
                            + "\"" + this.dateFormat.format(date) + "\","
                            + "\"" + this.tableModel.getValueAt(i, 2) + "\")";
                    
                    ConnectToDatabase.getResult(sql);
                }
            }
            JOptionPane.showMessageDialog(null, "Meal updated by "
                    + this.tfModificationDate.getText());
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_bUpdateMealActionPerformed
    
    private void tableInitializer() {
        
        try {
            
            String sql = "SELECT id, name FROM member_info";
            
            ResultSet resultSet = ConnectToDatabase.getResult(sql);
            
            while (resultSet.next()) {
                
                tableModel.insertRow(tableModel.getRowCount(), new Object[]{
                    resultSet.getString("id"), resultSet.getString("name"), ""
                });
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void dailyUpdate() {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DailyUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DailyUpdate().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancel;
    private javax.swing.JButton bUpdateMeal;
    private javax.swing.JButton bUpdateShoppingCost;
    private javax.swing.JDesktopPane dpTop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lCurrentDate;
    private javax.swing.JLabel lMealUpdate;
    private javax.swing.JLabel lModificationDate;
    private javax.swing.JPanel pButtonGroup;
    private javax.swing.JPanel pTop;
    private javax.swing.JSeparator sepOne;
    private javax.swing.JSeparator sepTwo;
    private javax.swing.JTable tblMealUpdate;
    private javax.swing.JTextField tfModificationDate;
    private javax.swing.JTextField tfShoppingCost;
    // End of variables declaration//GEN-END:variables
}
