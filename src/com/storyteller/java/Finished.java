package com.storyteller.java;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Brayden on 18/04/2016.
 */
public class Finished {
    public static void main(String s[]) {

        JFrame frame = new JFrame("Story Teller");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton makenew = new JButton();
        makenew.setText("Make Another");

        panel.add(makenew);

        frame.add(panel);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}