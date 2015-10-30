
package src;

import gui.MainFrame;


public class Main {
    
    public static void main(String[] args) {
        
        ResourceTester rs = new ResourceTester();
        rs.check();
        MainFrame.mainFrame();
    }
}
