package gui;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import src.ConnectToDatabase;

class MemberEntryForm extends javax.swing.JFrame {

    private final DefaultTableModel tableModel;

    public MemberEntryForm() {
        initComponents();

        DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        lDate.setText("Date: " + date.format(new Date()));
        tableModel = (DefaultTableModel) tblMemberEntryForm.getModel();
        this.refresh();
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

        String id = "";
        String name = "";

        try {

            id = JOptionPane.showInputDialog("Enter ID");
            name = JOptionPane.showInputDialog("Enter Name");

            String sql = "INSERT INTO member_info("
                    + "id,name) VALUES ("
                    + "\"" + id + "\", "
                    + "\"" + name + "\")";

            ConnectToDatabase.getResult(sql);

            this.tableModel.insertRow(tableModel.getRowCount(), new Object[]{
                id, name
            });
        } catch (HeadlessException | NumberFormatException e) {

            JOptionPane.showMessageDialog(null, e);
        }

        this.refresh();
        
        JOptionPane.showMessageDialog(null, "New Member added named " + name + " in id " + id);
    }//GEN-LAST:event_bAddActionPerformed

    private void bRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRefreshActionPerformed

        this.refresh();
    }//GEN-LAST:event_bRefreshActionPerformed

    private void tblMemberEntryFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMemberEntryFormMouseClicked

        this.taDisplay.setText("         Member Info\n\n" + "ID: "
                + String.valueOf(this.tableModel.getValueAt(
                                this.tblMemberEntryForm.getSelectedRow(), 0))
                + "\n\n\nName: " + String.valueOf(
                        this.tableModel.getValueAt(this.tblMemberEntryForm.getSelectedRow(), 1))
        );
    }//GEN-LAST:event_tblMemberEntryFormMouseClicked

    private void bEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditActionPerformed

        try {

            String name = JOptionPane.showInputDialog(null, "Enter new Name for ID " + this.tableModel.getValueAt(
                    this.tblMemberEntryForm.getSelectedRow(), 0) + ": ");

            String sql = "UPDATE member_info SET name = "
                    + "\"" + name + "\" "
                    + "WHERE  id = "
                    + this.tableModel.getValueAt(this.tblMemberEntryForm.getSelectedRow(), 0);

            ConnectToDatabase.getResult(sql);

            JOptionPane.showMessageDialog(null, "Member successfully edited named " + name);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
        
        this.refresh();
    }//GEN-LAST:event_bEditActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed

        try {

            int id = this.tblMemberEntryForm.getSelectedRow();

            String sql = "DELETE FROM member_info WHERE id = "
                    + this.tableModel.getValueAt(this.tblMemberEntryForm.getSelectedRow(), 0);

            ConnectToDatabase.getResult(sql);

            this.tableModel.removeRow(id);

            JOptionPane.showMessageDialog(null, "Member deleted holdin id " + id);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
        
        this.refresh();
    }//GEN-LAST:event_bDeleteActionPerformed

    private void refresh() {

        try {

            String sql = "SELECT * FROM member_info ORDER BY id";
            ResultSet resultSet = ConnectToDatabase.getResult(sql);

            for (int i = this.tableModel.getRowCount() - 1; i >= 0; i--) {

                this.tableModel.removeRow(i);
            }

            while (resultSet.next()) {

                this.tableModel.insertRow(this.tableModel.getRowCount(), new Object[]{
                    resultSet.getString("id"), resultSet.getString("name")
                });
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberEntryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
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
