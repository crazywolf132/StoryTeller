package com.storyteller.java;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Brayden on 18/04/2016.
 */
public class App {
    public static void main(String s[]) {

        JFrame frame = new JFrame("Story Teller");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel header = new JLabel("Story Teller.");
        JTextField char1 = new JTextField(10);
        JTextField char2 = new JTextField(10);
        JButton generate = new JButton();
        generate.setText("Generate");

        panel.add(header);
        //panel.add(button);
        panel.add(char1);
        panel.add(char2);
        panel.add(generate);

        frame.add(panel);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}