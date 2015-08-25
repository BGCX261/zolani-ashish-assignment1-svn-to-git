
package main;

public class FrameMain extends javax.swing.JFrame{
        MainPanel MainPanel = new MainPanel();
        
    public FrameMain(){
        MainPanel.init();
        add(MainPanel);
    }
    
    public static void main(String[] args){
        FrameMain Main = new FrameMain();
        Main.setSize(600, 600);
        Main.setLocationRelativeTo(null);
        Main.setTitle("Canvas");
        Main.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Main.setVisible(true);
    }
    
}