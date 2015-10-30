package gui;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import src.ConnectToDatabase;

class ViewFullMode extends javax.swing.JFrame {

    private final DefaultTableModel tableModelAccount;
    private final DefaultTableModel tableModelShoppingStatus;
    private final DefaultTableModel tableModelMealStatus;

    public ViewFullMode() {
        initComponents();

        DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat time = new SimpleDateFormat("HH:mm");
        lDate.setText("Toda's Date: " + date.format(new Date()));
        lTime.setText("Current Time: " + time.format(new Date()));

        tableModelAccount = (DefaultTableModel) tblAccountStatus.getModel();
        tableModelShoppingStatus = (DefaultTableModel) tblShoppingStatus.getModel();
        tableModelMealStatus = (DefaultTableModel) tblMealStatus.getModel();

        getAccountStatus();
        getShoppingStatus();
        getMealStatus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpViewFullMode = new javax.swing.JTabbedPane();
        pAccountStatus = new javax.swing.JPanel();
        spAccountStatus = new javax.swing.JScrollPane();
        tblAccountStatus = new javax.swing.JTable();
        pShoppingStatus = new javax.swing.JPanel();
        spShoppingStatus = new javax.swing.JScrollPane();
        tblShoppingStatus = new javax.swing.JTable();
        pMealStatus = new javax.swing.JPanel();
        spMealStatus = new javax.swing.JScrollPane();
        tblMealStatus = new javax.swing.JTable();
        pDateTime = new javax.swing.JPanel();
        lDate = new javax.swing.JLabel();
        lTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Full Mode View");

        tblAccountStatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Meal Advance", "Total Meal", "Meal Cost", "Account Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spAccountStatus.setViewportView(tblAccountStatus);
        if (tblAccountStatus.getColumnModel().getColumnCount() > 0) {
            tblAccountStatus.getColumnModel().getColumn(0).setResizable(false);
            tblAccountStatus.getColumnModel().getColumn(2).setResizable(false);
            tblAccountStatus.getColumnModel().getColumn(3).setResizable(false);
            tblAccountStatus.getColumnModel().getColumn(4).setResizable(false);
            tblAccountStatus.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout pAccountStatusLayout = new javax.swing.GroupLayout(pAccountStatus);
        pAccountStatus.setLayout(pAccountStatusLayout);
        pAccountStatusLayout.setHorizontalGroup(
            pAccountStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAccountStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spAccountStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)
                .addContainerGap())
        );
        pAccountStatusLayout.setVerticalGroup(
            pAccountStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAccountStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spAccountStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE))
        );

        tpViewFullMode.addTab("Account Status", pAccountStatus);

        tblShoppingStatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spShoppingStatus.setViewportView(tblShoppingStatus);
        if (tblShoppingStatus.getColumnModel().getColumnCount() > 0) {
            tblShoppingStatus.getColumnModel().getColumn(0).setResizable(false);
            tblShoppingStatus.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout pShoppingStatusLayout = new javax.swing.GroupLayout(pShoppingStatus);
        pShoppingStatus.setLayout(pShoppingStatusLayout);
        pShoppingStatusLayout.setHorizontalGroup(
            pShoppingStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pShoppingStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spShoppingStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)
                .addContainerGap())
        );
        pShoppingStatusLayout.setVerticalGroup(
            pShoppingStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pShoppingStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spShoppingStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpViewFullMode.addTab("Shopping Status", pShoppingStatus);

        tblMealStatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Name", "Meal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spMealStatus.setViewportView(tblMealStatus);
        if (tblMealStatus.getColumnModel().getColumnCount() > 0) {
            tblMealStatus.getColumnModel().getColumn(0).setResizable(false);
            tblMealStatus.getColumnModel().getColumn(1).setResizable(false);
            tblMealStatus.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout pMealStatusLayout = new javax.swing.GroupLayout(pMealStatus);
        pMealStatus.setLayout(pMealStatusLayout);
        pMealStatusLayout.setHorizontalGroup(
            pMealStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spMealStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 966, Short.MAX_VALUE)
        );
        pMealStatusLayout.setVerticalGroup(
            pMealStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spMealStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );

        tpViewFullMode.addTab("Meal Status", pMealStatus);

        javax.swing.GroupLayout pDateTimeLayout = new javax.swing.GroupLayout(pDateTime);
        pDateTime.setLayout(pDateTimeLayout);
        pDateTimeLayout.setHorizontalGroup(
            pDateTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDateTimeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lDate, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179)
                .addComponent(lTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pDateTimeLayout.setVerticalGroup(
            pDateTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDateTimeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDateTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lTime)
                    .addComponent(lDate))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tpViewFullMode, javax.swing.GroupLayout.DEFAULT_SIZE, 966, Short.MAX_VALUE)
                    .addComponent(pDateTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tpViewFullMode, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getMealStatus() {

        try {

            String sql = "SELECT name, date, meal FROM meal_info, member_info WHERE "
                    + "meal_info.id = member_info.id ORDER BY date ASC, member_info.id ASC";

            ResultSet resultSet = ConnectToDatabase.getResult(sql);

            while (resultSet.next()) {

                this.tableModelMealStatus.addRow(new Object[]{
                    resultSet.getString("date"),
                    resultSet.getString("name"),
                    resultSet.getString("meal")
                });
            }

        } catch (SQLException | NumberFormatException e) {

            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void getShoppingStatus() {

        try {

            String sql = "SELECT date, cost FROM shopping_cost ORDER BY date DESC";

            ResultSet resultSet = ConnectToDatabase.getResult(sql);

            while (resultSet.next()) {

                this.tableModelShoppingStatus.addRow(new Object[]{
                    resultSet.getString("date"),
                    resultSet.getString("cost")
                });
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void getAccountStatus() {

        try {
            
            String sql;
            ResultSet resultSet;
            
            sql = "SELECT SUM(cost) AS total_cost FROM shopping_cost";

            resultSet = ConnectToDatabase.getResult(sql);
            
            double totalCost = 0, totalMeal = 0, mealRate = 0;
            if (resultSet.next()) {

                totalCost = Double.valueOf(resultSet.getString("total_cost"));
            }
            
            
            sql = "SELECT SUM(meal) AS total_meal FROM meal_info";

            resultSet = ConnectToDatabase.getResult(sql);

            if (resultSet.next()) {

                totalMeal = Double.valueOf(resultSet.getString("total_meal"));
            }
            
            mealRate = totalCost/totalMeal;
            
            
            sql = "SELECT id, name FROM member_info";
            
            resultSet = ConnectToDatabase.getResult(sql);
            
            while (resultSet.next()) {
                
                sql = "SELECT SUM(amount) AS advance FROM payment_info WHERE id = "
                        + resultSet.getString("id");
                
                ResultSet resultSet2 = ConnectToDatabase.getResult(sql);
                
                
                sql = "SELECT SUM(meal) AS total_meal FROM meal_info WHERE id = "
                        + resultSet.getString("id");
                
                ResultSet resultSet3 = ConnectToDatabase.getResult(sql);
                this.tableModelAccount.addRow(new Object[]{
                    resultSet.getString("id"),
                    resultSet.getString("name"),
                    resultSet2.getString("advance"),
                    resultSet3.getString("total_meal"),
                    mealRate*Double.valueOf(resultSet3.getString("total_meal")),
                    Double.valueOf(resultSet2.getString("advance")) 
                            - mealRate*Double.valueOf(resultSet3.getString("total_meal"))
                });
            }
        } catch (SQLException | NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void viewFullMode() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFullMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ViewFullMode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lDate;
    private javax.swing.JLabel lTime;
    private javax.swing.JPanel pAccountStatus;
    private javax.swing.JPanel pDateTime;
    private javax.swing.JPanel pMealStatus;
    private javax.swing.JPanel pShoppingStatus;
    private javax.swing.JScrollPane spAccountStatus;
    private javax.swing.JScrollPane spMealStatus;
    private javax.swing.JScrollPane spShoppingStatus;
    private javax.swing.JTable tblAccountStatus;
    private javax.swing.JTable tblMealStatus;
    private javax.swing.JTable tblShoppingStatus;
    private javax.swing.JTabbedPane tpViewFullMode;
    // End of variables declaration//GEN-END:variables
}
