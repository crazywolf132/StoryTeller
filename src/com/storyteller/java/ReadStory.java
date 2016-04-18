package com.storyteller.java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Brayden on 18/04/2016.
 */
public class ReadStory extends JFrame {

    private JTextArea output;

    public ReadStory(String gs) {

        //Character 1 setup.
        getContentPane().setLayout(null);
        setSize(300, 300);

        Stories s = new Stories();
        output = new JTextArea(s.generateStory(gs));
        output.setBounds(63, 0, 89, 23);
        getContentPane().add(output);
    }
}
