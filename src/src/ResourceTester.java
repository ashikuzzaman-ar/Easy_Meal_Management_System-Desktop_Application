package src;

import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import javax.swing.JOptionPane;


public class ResourceTester {
    
    File dummy = new File("");
    File file = new File(dummy.getAbsolutePath()+"/.EMMS-Res");
    Formatter f;
    
    public void check(){
        
        
        try {
            
            if(!file.exists()){
                
                file.mkdir();
                
                f = new Formatter(file.getAbsolutePath()+"/member-list.txt");
                f.close();
                
                f = new Formatter(file.getAbsolutePath()+"/meal-status.txt");
                f.close();
                
                f = new Formatter(file.getAbsolutePath()+"/shopping-status.txt");
                f.close();
                
                f = new Formatter(file.getAbsolutePath()+"/payment-status.txt");
                f.close();

                JOptionPane.showMessageDialog(null, "Thank you for usng Easy Meal Management "
                            + "System. All are functioning well. Enjoy!");
            }   
            
            
        } catch (FileNotFoundException | HeadlessException e) {
            
            JOptionPane.showMessageDialog(null, "System Erron!\n"
                        + "Please drop a mail to ashik.ar.420@gmail.com");
        }
        
    }
    
}
