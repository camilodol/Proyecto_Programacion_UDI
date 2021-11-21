package main;

import Ventanas.Login;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Login v = new Login();
        v.setSize(200,200);
        v.setResizable(false);
        v.setLocationRelativeTo(null);
        v.getContentPane().setBackground(Color.white);
        v.setVisible(true);

    }
}
