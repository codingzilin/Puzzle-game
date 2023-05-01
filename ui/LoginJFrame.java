package ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    public LoginJFrame(){
        this.setSize(488,430);
        //set title
        this.setTitle("Puzzle Game Login");
        //set always on top
        this.setAlwaysOnTop(true);
        //set frame in middle
        this.setLocationRelativeTo(null);
        //set close model
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
