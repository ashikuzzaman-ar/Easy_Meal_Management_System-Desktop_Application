package home;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


class MemberEntryForm extends javax.swing.JFrame {

    
    private File file = new File("");
    private Formatter f;
    private Scanner scan;
    
    private DefaultTableModel tableModel;
    
    private String resultString;
    
    
    
    
    public MemberEntryForm() {
        initComponents();
        
        
        
        DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        lDate.setText("Date: "+date.format(new Date()));
        tableModel = (DefaultTableModel)tblMemberEntryForm.getModel();
        refresh();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pMemberEntry = new javax.swing.JPanel();
        lMembersView = new javax.swing.JLabel();
        lDisplay = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDisplay = new javax.swing.JTextArea();
        bAdd = new javax.swing.JButton();
        bEdit = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        lDate = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMemberEntryForm = new javax.swing.JTable();
        bRefresh = new javax.swing.JButton();

        setTitle("Member Entry");
        setResizable(false);

        lMembersView.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        lMembersView.setText("Memebers View");

        lDisplay.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        lDisplay.setText("Display");

        taDisplay.setEditable(false);
        taDisplay.setColumns(20);
        taDisplay.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        taDisplay.setRows(5);
        jScrollPane1.setViewportView(taDisplay);

        bAdd.setText("Add");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        bEdit.setText("Edit");
        bEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditActionPerformed(evt);
            }
        });

        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        lDate.setText(" ");

        tblMemberEntryForm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMemberEntryForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMemberEntryFormMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblMemberEntryForm);
        if (tblMemberEntryForm.getColumnModel().getColumnCount() > 0) {
            tblMemberEntryForm.getColumnModel().getColumn(0).setResizable(false);
            tblMemberEntryForm.getColumnModel().getColumn(1).setResizable(false);
        }

        bRefresh.setText("Refresh");
        bRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pMemberEntryLayout = new javax.swing.GroupLayout(pMemberEntry);
        pMemberEntry.setLayout(pMemberEntryLayout);
        pMemberEntryLayout.setHorizontalGroup(
            pMemberEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMemberEntryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pMemberEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lMembersView)
                    .addGroup(pMemberEntryLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(pMemberEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pMemberEntryLayout.createSequentialGroup()
                                .addGroup(pMemberEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bAdd)
                                    .addComponent(bEdit)
                                    .addComponent(bDelete)
                                    .addComponent(bRefresh))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pMemberEntryLayout.createSequentialGroup()
                                .addComponent(lDate, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lDisplay))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pMemberEntryLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bAdd, bDelete, bEdit, bRefresh});

        pMemberEntryLayout.setVerticalGroup(
            pMemberEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMemberEntryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lMembersView, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pMemberEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDate)
                    .addComponent(lDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pMemberEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pMemberEntryLayout.createSequentialGroup()
                        .addComponent(bRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bAdd)
                        .addGap(18, 18, 18)
                        .addComponent(bEdit)
                        .addGap(18, 18, 18)
                        .addComponent(bDelete)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pMemberEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pMemberEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed

        String id = String.valueOf(tableModel.getRowCount()+1);
        String name = JOptionPane.showInputDialog(null, "Enter Member's Name: ");
        if(name.trim() != "" && id.trim() != ""){
            
            tableModel.insertRow(tableModel.getRowCount(), new Object[]{
                id,name
            });
        } else {
            
            JOptionPane.showMessageDialog(null, "ID or Name should not be blank!\nTry again Please.");
        }
        
        fileWrite();
        JOptionPane.showMessageDialog(null, "New Member added named "+name+" in id "+id);
    }//GEN-LAST:event_bAddActionPerformed

    private void bRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRefreshActionPerformed

        dispose();
        memberEntry();
    }//GEN-LAST:event_bRefreshActionPerformed

    private void tblMemberEntryFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMemberEntryFormMouseClicked

        taDisplay.setText("         Member Info\n\n"+"ID: "+
                String.valueOf(tableModel.getValueAt(
                tblMemberEntryForm.getSelectedRow(), 0))
        +"\n\n\nName: "+String.valueOf(
                tableModel.getValueAt(tblMemberEntryForm.getSelectedRow(), 1))
        );
    }//GEN-LAST:event_tblMemberEntryFormMouseClicked

    private void bEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditActionPerformed

        
        String name = JOptionPane.showInputDialog(null, "Enter new Name for ID "+tableModel.getValueAt(
                tblMemberEntryForm.getSelectedRow(), 0)+": ");
        
        tableModel.setValueAt(name, tblMemberEntryForm.getSelectedRow(), 1);
        
        fileWrite();
        JOptionPane.showMessageDialog(null, "Member successfully edited named "+name);
    }//GEN-LAST:event_bEditActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed

        int id = tblMemberEntryForm.getSelectedRow();
        
        tableModel.removeRow(id);
        
        fileWrite();
        
        JOptionPane.showInputDialog(null,"Member deleted holdin id "+id);
    }//GEN-LAST:event_bDeleteActionPerformed

   
    
    
    
    
    static int rowNumber(){
        
        
        return new MemberEntryForm().tableModel.getRowCount();
    }
    
    
    
    
    
    
    private void fileWrite(){
        
        getInfo();
        
        try {
            
            f = new Formatter(file.getAbsolutePath()+"/.EMMS-Res/member-list.txt");
            f.format("%s", resultString);
            f.close();
        } catch (Exception e) {
            
            System.exit(0);
        }
    }
    
    
    private void getInfo(){
        
        resultString = "";
        
        try {
            
            for(int i=0; i<tableModel.getRowCount(); i++){
                
                resultString+=(String.valueOf(i+1)+"\n"+tableModel.getValueAt(i, 1)+"\n");
            }
        } catch (Exception e) {
            
            System.exit(0);
        }
    }
    
    
    private void refresh(){
        
        try {
            
            scan = new Scanner(new File(file.getAbsolutePath()+"/.EMMS-Res/member-list.txt"));
            while(scan.hasNext()){
                
                tableModel.insertRow(tableModel.getRowCount(), new Object[]{
                    scan.nextLine(),scan.nextLine()
                });
            }
            scan.close();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "File Operation Failed!");
        }
        
    }
    
    
    
    public static void memberEntry() {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MemberEntryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberEntryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberEntryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberEntryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberEntryForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bEdit;
    private javax.swing.JButton bRefresh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lDate;
    private javax.swing.JLabel lDisplay;
    private javax.swing.JLabel lMembersView;
    private javax.swing.JPanel pMemberEntry;
    private javax.swing.JTextArea taDisplay;
    private javax.swing.JTable tblMemberEntryForm;
    // End of variables declaration//GEN-END:variables
}
