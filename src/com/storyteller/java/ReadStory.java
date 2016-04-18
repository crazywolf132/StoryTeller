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

        /**
         * This file was only here for testing purposes... and has nothing to do with the rest of the project.
         * Please refraim from using this file, As it will cause errors as there was no character name input.
         */

        //Character 1 setup.
        getContentPane().setLayout(null);
        setSize(300, 300);

        Stories s = new Stories();
        String story = s.generateStory(gs);
        System.out.println(story);
        output = new JTextArea(story);
        output.setBounds(63, 0, 89, 23);
        getContentPane().add(output);
    }
}
