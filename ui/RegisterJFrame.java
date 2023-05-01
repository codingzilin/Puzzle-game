package ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    public RegisterJFrame(){
        this.setSize(488,500);
        //set title
        this.setTitle("Puzzle Game Sign in");
        //set always on top
        this.setAlwaysOnTop(true);
        //set frame in middle
        this.setLocationRelativeTo(null);
        //set close model
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
