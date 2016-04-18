package com.storyteller.java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class App extends JFrame{

    public String char1;
    public JTextField name;
    public JTextField selected;
    private JLabel sceneLabel;
    private JLabel characterName;
    private int count = 0;
    public String[] scene = { "Horror", "Christmas", "Easter", "New Years", "Death"};

    public App() {


        /**
         * Fair warning... this file is being used to test on how we could go about doing this...
         * All of it is subject to change if we cannot get it to work, or there is an easier way.
         */

        getContentPane().setLayout(null);
        setSize(300, 300);

        characterName = new JLabel("Name: ");
        characterName.setBounds(0, 0, 89, 23);
        getContentPane().add(characterName);

        name = new JTextField(10);
        name.setBounds(63, 0, 89, 23);
        getContentPane().add(name);

        selected = new JTextField(40);
        selected.setBounds(63, 50, 89, 23);
        getContentPane().add(selected);

        sceneLabel = new JLabel("Scene: ");
        sceneLabel.setBounds(0, 100, 89, 23);
        getContentPane().add(sceneLabel);

        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(63, 100, 89, 23);
        getContentPane().add(comboBox);


            for(int i = 0; i < scene.length; i++)
                comboBox.addItem(scene[count++]);
            selected.setEditable(false);

            comboBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                        selected.setText("You Selected : " +
                                ((JComboBox)e.getSource()).getSelectedItem());
                    }
            });
        //Below this... is only to see the output in the log.
        char1 = name.getText();
        System.out.println(char1);


        //Finished log output.

        name.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char1 = App.this.name.getText();
                Finished finished = new Finished(char1);
            }
        });
    }

    public static void main(String[] args) {
        App frame = new App();
        frame.setVisible(true);
    }
}