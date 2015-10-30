
package gui;


public class About extends javax.swing.JFrame {

    
    public About() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pAbout = new javax.swing.JPanel();
        spAbout = new javax.swing.JScrollPane();
        taAbout = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About Ths Software");
        setAlwaysOnTop(true);
        setResizable(false);

        taAbout.setEditable(false);
        taAbout.setColumns(20);
        taAbout.setRows(5);
        taAbout.setText("\nAbout Myself:\n\nMy name is MD. Ashikuzzaman mostly known as Ashik. I'm a student of United International \nUniversity at the dept. of Computer Science and Engineering. \n\nEmail: ashik.ar.420@gmail.com\n\n\n\nMain goal of this software : \n\nMake easy to handle meal management system so that s/he who live \noutside of their famly can easily handle their meal management.\n\n\n\n\nRequirements :\n\nThis software needs only Java Runtime Environment ( JVM / JRE ) version 7 or higher . This is a open\nsource software under GPL v2.0 . You can do anything with this software if you want. You can change,\nmodify, distribute and contribute with this project.\n\n\n\n\nGNU General Public Licence:\n\nTo know more about GPL please visit this link --> https://www.gnu.org/licenses/gpl-2.0.html \n\n\nTo get the source code please drop me a mail through ashik.ar.420@gmail.com\n\nThank you very much. having a nice time. ");
        spAbout.setViewportView(taAbout);

        javax.swing.GroupLayout pAboutLayout = new javax.swing.GroupLayout(pAbout);
        pAbout.setLayout(pAboutLayout);
        pAboutLayout.setHorizontalGroup(
            pAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAboutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spAbout, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                .addContainerGap())
        );
        pAboutLayout.setVerticalGroup(
            pAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAboutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spAbout, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pAbout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void about() {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(About.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new About().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pAbout;
    private javax.swing.JScrollPane spAbout;
    private javax.swing.JTextArea taAbout;
    // End of variables declaration//GEN-END:variables
}
