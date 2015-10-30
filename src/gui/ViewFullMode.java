package gui;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

class ViewFullMode extends javax.swing.JFrame {
    

    private int memberNumber = MemberEntryForm.rowNumber();
    
    
    private String[] name  = new String[memberNumber];
    private double[] mealAdvance = new double[memberNumber];
    private double[] totalMeal = new double[memberNumber];
    private double[] mealCost = new double[memberNumber];
    private double[] accountStatus = new double[memberNumber];
    
    
    private File file = new File("");
    private Scanner scan ;
    
    
    private DefaultTableModel tableModelAccount ;
    private DefaultTableModel tableModelShoppingStatus ;
    private DefaultTableModel tableModelMealStatus ;
    
    


    public ViewFullMode() {
        initComponents();
        
        
        
        
        
        DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat time = new SimpleDateFormat("HH:mm");
        lDate.setText("Toda's Date: "+date.format(new Date()));
        lTime.setText("Current Time: "+time.format(new Date()));
        
        tableModelAccount = (DefaultTableModel)tblAccountStatus.getModel();
        tableModelShoppingStatus = (DefaultTableModel)tblShoppingStatus.getModel();
        tableModelMealStatus = (DefaultTableModel)tblMealStatus.getModel();
        
        
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
        setResizable(false);

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
                .addComponent(spAccountStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                .addContainerGap())
        );
        pAccountStatusLayout.setVerticalGroup(
            pAccountStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAccountStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spAccountStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE))
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
                .addComponent(spShoppingStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                .addContainerGap())
        );
        pShoppingStatusLayout.setVerticalGroup(
            pShoppingStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pShoppingStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spShoppingStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpViewFullMode.addTab("Shopping Status", pShoppingStatus);

        tblMealStatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spMealStatus.setViewportView(tblMealStatus);
        if (tblMealStatus.getColumnModel().getColumnCount() > 0) {
            tblMealStatus.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout pMealStatusLayout = new javax.swing.GroupLayout(pMealStatus);
        pMealStatus.setLayout(pMealStatusLayout);
        pMealStatusLayout.setHorizontalGroup(
            pMealStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spMealStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );
        pMealStatusLayout.setVerticalGroup(
            pMealStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMealStatusLayout.createSequentialGroup()
                .addComponent(spMealStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
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
                    .addComponent(tpViewFullMode)
                    .addComponent(pDateTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tpViewFullMode)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    private void getMealStatus(){
        
        
        for(int i=0; i<memberNumber; i++){
            
            tableModelMealStatus.addColumn(name[i]);
        }
        
        
        try {
            
            int a = 0;
            
            scan = new Scanner(new File(file.getAbsolutePath()+"/.EMMS-Res/meal-status.txt"));
            while(scan.hasNext()){
                
                String[] meal = new String[memberNumber+1];
                
                for(int i=0; i<=memberNumber; i++){
                    meal[i] = scan.next();
                }
                
                tableModelMealStatus.insertRow(a, meal);
                
                a++;
            }
            scan.close();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "File Operation Failed!");
        }
        
    }
    
    
    
    
    
    
    
    
    
    private void getShoppingStatus(){
        
        
        try {
            
            int a = 0;
            
            scan = new Scanner(new File(file.getAbsolutePath()+"/.EMMS-Res/shopping-status.txt"));
            while(scan.hasNext()){
                
                tableModelShoppingStatus.insertRow(a, new Object[]{
                    
                    scan.nextLine(),scan.nextLine()
                });
                a++;
            }
            scan.close();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "File Operation Failed!");
        }
    }
    
    
    
    
    
    
    
    private void getAccountStatus(){
        
        
        int a = 0;
        
        
        
        // Geting member Name
        try {
            
            scan = new Scanner(new File(file.getAbsolutePath()+"/.EMMS-Res/member-list.txt"));
            while(scan.hasNext()){
                scan.nextLine();
                name[a] = scan.nextLine();
                a++;
            }
            scan.close();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "File Operation Failed!");
        }
        
        
        // Geting Meal Advance
        try {
            
            scan = new Scanner(new File(file.getAbsolutePath()+"/.EMMS-Res/payment-status.txt"));
            while(scan.hasNext()){
                
                scan.next();
                for(int i=0; i<memberNumber; i++){
                    mealAdvance[i]+=Double.valueOf(scan.next());
                }
            }
            scan.close();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "File Operation Failed!");
        }
        
        
        // Geting Total Meal
        try {
            
            scan = new Scanner(new File(file.getAbsolutePath()+"/.EMMS-Res/meal-status.txt"));
            while(scan.hasNext()){
                
                scan.next();
                for(int i=0; i<memberNumber; i++){
                    totalMeal[i]+=Double.valueOf(scan.next());
                    
                }
            }
            scan.close();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "File Operation Failed!");
        }
        
        
        
        
        for(int i=0; i<memberNumber; i++){
            
            mealCost[i] = totalMeal[i]*(new ViewStatusFrame().getMealRate());
            accountStatus[i] = mealAdvance[i] - mealCost[i];
            tableModelAccount.insertRow(i, new Object[]{
                
                i+1, name[i], mealAdvance[i], totalMeal[i], mealCost[i], accountStatus[i]
            });
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewFullMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFullMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFullMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFullMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
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
