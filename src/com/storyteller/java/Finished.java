package com.storyteller.java;

import javax.swing.*;

/**
 * Created by Brayden on 18/04/2016.
 */
public class Finished extends JFrame {

        public Finished(String gs) {
            super();
            setVisible(true);
            setSize(300, 300);
            setTitle("Story Teller");

            /*//Adding what has been decided on the main menu.
            getContentPane().setLayout(null);
            //Leave ^^^ There so then it can render to the screen.
            setSize(300, 300);
            //^^^ Sets screen size.
            JTextArea info1 = new JTextArea(generateStory);
            info1.setBounds(63, 100, 89, 23);
            getContentPane().add(info1);
            //^^^ Adds temp textarea to display there input.

            JLabel label = new JLabel("Char 1: ");
            label.setBounds(0, 100, 89, 23);
            getContentPane().add(label);
            //^^^ This is only temp untill we add the actual story.

            */
            getContentPane().setLayout(null);
            setSize(300, 300);

            Stories s = new Stories();
            String story1 = s.generateStory(gs);
            System.out.println(story1);
            JTextArea story = new JTextArea(story1);
            story.setBounds(0, 0, 300, 300);//Made text area bigger!
            getContentPane().add(story);


        }
    }
