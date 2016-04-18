package com.storyteller.java;

import javax.swing.*;

/**
 * Created by Brayden on 18/04/2016.
 */
public class Finished extends JFrame {

        public static int WIDTH = 300;
        public static int HEIGHT = 300;

        public Finished(String gs) {
            super();
            setVisible(true);
            setSize(WIDTH, HEIGHT);
            setTitle("Story Teller");
            setResizable(false);

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
            setSize(WIDTH, HEIGHT);

            Stories s = new Stories();
            String story1 = s.generateStory(gs);
            System.out.println(story1);
            JTextArea story = new JTextArea(story1);
            story.setLineWrap(true);
            story.setBounds(0, 0, WIDTH, HEIGHT);//Made text area bigger!
            getContentPane().add(story);


        }
    }
