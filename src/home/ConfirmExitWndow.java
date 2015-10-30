
package home;


class ConfirmExitWndow extends javax.swing.JFrame {

    
    public ConfirmExitWndow() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pConfirmExitWindow = new javax.swing.JPanel();
        lChooseAOption = new javax.swing.JLabel();
        bConfirmExit = new javax.swing.JButton();
        bCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Confirm Exit");
        setResizable(false);

        lChooseAOption.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        lChooseAOption.setForeground(new java.awt.Color(204, 0, 0));
        lChooseAOption.setText("Are you sure to exit this Application?");

        bConfirmExit.setText("Confirm Exit");
        bConfirmExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConfirmExitActionPerformed(evt);
            }
        });

        bCancel.setText("Cancel");
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pConfirmExitWindowLayout = new javax.swing.GroupLayout(pConfirmExitWindow);
        pConfirmExitWindow.setLayout(pConfirmExitWindowLayout);
        pConfirmExitWindowLayout.setHorizontalGroup(
            pConfirmExitWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pConfirmExitWindowLayout.createSequentialGroup()
                .addGroup(pConfirmExitWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pConfirmExitWindowLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bConfirmExit, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(bCancel))
                    .addGroup(pConfirmExitWindowLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lChooseAOption)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pConfirmExitWindowLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bCancel, bConfirmExit});

        pConfirmExitWindowLayout.setVerticalGroup(
            pConfirmExitWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pConfirmExitWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lChooseAOption)
                .addGap(31, 31, 31)
                .addGroup(pConfirmExitWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bConfirmExit)
                    .addComponent(bCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pConfirmExitWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pConfirmExitWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed

        dispose();
    }//GEN-LAST:event_bCancelActionPerformed

    private void bConfirmExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConfirmExitActionPerformed

        System.exit(0);
    }//GEN-LAST:event_bConfirmExitActionPerformed

    
    public static void confirmExitWindow() {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConfirmExitWndow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmExitWndow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmExitWndow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmExitWndow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmExitWndow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancel;
    private javax.swing.JButton bConfirmExit;
    private javax.swing.JLabel lChooseAOption;
    private javax.swing.JPanel pConfirmExitWindow;
    // End of variables declaration//GEN-END:variables
}
