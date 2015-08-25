/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import javax.swing.BorderFactory;
import java.awt.GridLayout;

public class MainPanel extends javax.swing.JPanel {
       
    private static subPanel[][] panelmax = new subPanel[3][3];

    public MainPanel() {
        setLayout(new GridLayout(3, 3));
    }
    
    protected void init() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                subPanel SubPanel = new subPanel();
                panelmax[i][j] = SubPanel;
                panelmax[i][j].setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

                add(panelmax[i][j]);
            }
        }
    }
}