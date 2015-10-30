
package src;

import java.awt.HeadlessException;
import java.io.File;
import javax.swing.JOptionPane;

public class ResourceTester {
        
    private final File dummy ;
    private final File file ;
    
    public ResourceTester(){
        
        this.dummy = new File("");
        this.file = new File(dummy.getAbsolutePath()+"/.EMMS-RES");
    }
    
    
    
    public void createDirectory(){
        
        
        try {
            
            if(!this.file.exists()){
                
                this.file.mkdirs();
                
            }  
        } catch (HeadlessException e) {
            
            JOptionPane.showMessageDialog(null, "System Erron!\n"
                        + "Please drop a mail to ashik.ar.420@gmail.com");
        }
    }    
}
