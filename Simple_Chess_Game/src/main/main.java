package main;

import javax.swing.*;

public class main {
    public static void main(String[] args){
        JFrame window= new JFrame("Simple chess");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

//        Add GamePanel to the window
        GamePanel gp = new GamePanel();
        window.add(gp);
        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gp.lunchGame();
    }
}
