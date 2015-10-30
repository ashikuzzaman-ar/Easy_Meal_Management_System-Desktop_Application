package gui;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat time = new SimpleDateFormat("HH:mm:ss");
        lDate.setText("Date: "+date.format(new Date()));
        lTime.setText("Starting Time: "+time.format(new Date()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pMainFrame = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bViewStatus = new javax.swing.JButton();
        bDailyUpdate = new javax.swing.JButton();
        bResetAll = new javax.swing.JButton();
        bSaveAndClose = new javax.swing.JButton();
        bEditMembers = new javax.swing.JButton();
        bAddPayment = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lDate = new javax.swing.JLabel();
        lTime = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mMenu = new javax.swing.JMenu();
        miAbout = new javax.swing.JMenuItem();
        miHelp = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Easy Meal Management System");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Welcome to Easy Meal Management Systme");

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("Copyright Resurved by Ashik");

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Feedback E-Mail: ashik.ar.420@gmail.com");

        bViewStatus.setText("View Status");
        bViewStatus.setFocusable(false);
        bViewStatus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bViewStatus.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bViewStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bViewStatusActionPerformed(evt);
            }
        });

        bDailyUpdate.setText("Daily Update");
        bDailyUpdate.setFocusable(false);
        bDailyUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bDailyUpdate.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bDailyUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDailyUpdateActionPerformed(evt);
            }
        });

        bResetAll.setText("Reset All");
        bResetAll.setFocusable(false);
        bResetAll.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bResetAll.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bResetAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetAllActionPerformed(evt);
            }
        });

        bSaveAndClose.setText("Close");
        bSaveAndClose.setFocusable(false);
        bSaveAndClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bSaveAndClose.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bSaveAndClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveAndCloseActionPerformed(evt);
            }
        });

        bEditMembers.setText("Edit Members");
        bEditMembers.setFocusable(false);
        bEditMembers.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bEditMembers.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bEditMembers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditMembersActionPerformed(evt);
            }
        });

        bAddPayment.setText("Add Payment");
        bAddPayment.setFocusable(false);
        bAddPayment.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bAddPayment.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bAddPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddPaymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pMainFrameLayout = new javax.swing.GroupLayout(pMainFrame);
        pMainFrame.setLayout(pMainFrameLayout);
        pMainFrameLayout.setHorizontalGroup(
            pMainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMainFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pMainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pMainFrameLayout.createSequentialGroup()
                        .addGroup(pMainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(pMainFrameLayout.createSequentialGroup()
                                .addGroup(pMainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lTime, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                .addGap(33, 33, 33)
                                .addGroup(pMainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pMainFrameLayout.createSequentialGroup()
                        .addGroup(pMainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bViewStatus)
                            .addComponent(bAddPayment))
                        .addGap(117, 117, 117)
                        .addGroup(pMainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bEditMembers, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bDailyUpdate, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pMainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bSaveAndClose, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bResetAll, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );

        pMainFrameLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bAddPayment, bDailyUpdate, bEditMembers, bResetAll, bSaveAndClose, bViewStatus});

        pMainFrameLayout.setVerticalGroup(
            pMainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMainFrameLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(pMainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pMainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(pMainFrameLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lTime, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pMainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bDailyUpdate)
                    .addGroup(pMainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bViewStatus)
                        .addComponent(bResetAll)))
                .addGap(60, 60, 60)
                .addGroup(pMainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bEditMembers)
                    .addGroup(pMainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bAddPayment)
                        .addComponent(bSaveAndClose)))
                .addGap(48, 48, 48))
        );

        mMenu.setText("Menu");

        miAbout.setText("About");
        miAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAboutActionPerformed(evt);
            }
        });
        mMenu.add(miAbout);

        miHelp.setText("Help");
        miHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miHelpActionPerformed(evt);
            }
        });
        mMenu.add(miHelp);

        jMenuBar1.add(mMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pMainFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pMainFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bViewStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bViewStatusActionPerformed

        ViewStatusFrame.viewStatusFrame();
    }//GEN-LAST:event_bViewStatusActionPerformed

    private void bSaveAndCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveAndCloseActionPerformed

        ConfirmExitWndow.confirmExitWindow();
    }//GEN-LAST:event_bSaveAndCloseActionPerformed

    private void bEditMembersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditMembersActionPerformed

        MemberEntryForm.memberEntry();
    }//GEN-LAST:event_bEditMembersActionPerformed

    private void bDailyUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDailyUpdateActionPerformed

        DailyUpdate.dailyUpdate();
    }//GEN-LAST:event_bDailyUpdateActionPerformed

    private void bAddPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddPaymentActionPerformed

        PaymentUpdate.paymentUpdate();
    }//GEN-LAST:event_bAddPaymentActionPerformed

    private void bResetAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetAllActionPerformed

        ConfirmReset.confirmReset();
    }//GEN-LAST:event_bResetAllActionPerformed

    private void miAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAboutActionPerformed

        About.about();
    }//GEN-LAST:event_miAboutActionPerformed

    private void miHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miHelpActionPerformed

        Help.help();
    }//GEN-LAST:event_miHelpActionPerformed

    public static void mainFrame() {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAddPayment;
    private javax.swing.JButton bDailyUpdate;
    private javax.swing.JButton bEditMembers;
    private javax.swing.JButton bResetAll;
    private javax.swing.JButton bSaveAndClose;
    private javax.swing.JButton bViewStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lDate;
    private javax.swing.JLabel lTime;
    private javax.swing.JMenu mMenu;
    private javax.swing.JMenuItem miAbout;
    private javax.swing.JMenuItem miHelp;
    private javax.swing.JPanel pMainFrame;
    // End of variables declaration//GEN-END:variables
}
