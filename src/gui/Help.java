
package gui;


public class Help extends javax.swing.JFrame {

    
    public Help() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pHelp = new javax.swing.JPanel();
        spHelp = new javax.swing.JScrollPane();
        taHelp = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Help");
        setAlwaysOnTop(true);
        setResizable(false);

        taHelp.setColumns(20);
        taHelp.setRows(5);
        taHelp.setText("\n01.    At first you have to make sure that you don't delete or move the directory ( folder )\nnamed \".EMMS-Res\" and any file located inside of this directory. This directory will be \ncreated autometically at first startup of this software. This directory  remains hidden in \nUnix like Operating Systems like Linux , BSD, OS-X etc for security reason. This directory \nwill be created autometically in the same location where this software is stored. \n\n\n02.   For using this software you have to create list. To create member list you have to \nclick \"Edit Members\" button. Then a new window will opened and then click \"Add\" button \nto add new members. You can also edit or delete members list gradually by clicking \"Edit\" \nand  \"Delete\" buttons. Though you can edit, delete or add new members but it is strongly\nrecomended not to do so in the middle of a running month. It may loose you entire \ndataset.\n\n\n03.   After creating a complete members list you should close the member entry window \nand then you can start your another entry and all will be calculated by itself autometically.\n\n\n04. To update daily meal and shopping cost you have to click \"Daily Update\" button. A \nnew window will be opened. For updating meal status , edit the table containing members\nname and click \"Update Meal\". For updating shopping cost , edit shopping cost box and\nclick \"Update Shopping Cost\" button. You have to seperately click those buttons. If you\nwant to update a older history you can change the date box located at top right corner\nof this window.\n\n\n05.   You can update payment by clcking \"Add Payment\" button. After clicking this button \na new window will be opened. Just simply edit the payment currency from the table and \nleft unchanged who don't pay. A confirmation window will confirm you about the success.\n\n\n06. You can watch your managerial overview by simply clicking \"View Status\" button. it\nwill open a new window containing total deposit, total spend, current deposit, total \nmeal, meal rate and average spend per day. If you want to see the complete view just \njust click \"View Full Mode\" button. It will show you the whole overview of your your \nmanagerial status. \n\n\n07.   If you want to delete all datas and reset all settings to start a new managerial table \njust click \"Reset All\" button. Be sure that it will delete and reset all your previous datas \nand you can't see them again.\n\n\n08.   To close this software you have to click \"Close\" button or close icon of the window.\n\n\n\t\t------Thank You Very Much------");
        spHelp.setViewportView(taHelp);

        javax.swing.GroupLayout pHelpLayout = new javax.swing.GroupLayout(pHelp);
        pHelp.setLayout(pHelpLayout);
        pHelpLayout.setHorizontalGroup(
            pHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spHelp, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );
        pHelpLayout.setVerticalGroup(
            pHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHelpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spHelp, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void help() {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Help().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pHelp;
    private javax.swing.JScrollPane spHelp;
    private javax.swing.JTextArea taHelp;
    // End of variables declaration//GEN-END:variables
}
