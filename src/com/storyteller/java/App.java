package com.storyteller.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class App extends JFrame{

    private String mensaje;
    private JTextField char1;
    private JTextField char2;
    private JLabel name1;
    private JLabel name2;
    private JLabel Title;

    public App() {

        //Character 1 setup.
        getContentPane().setLayout(null);
        setSize(300, 300);

            Title = new JLabel("Story Teller");
            Title.setBounds(0, 0, 89, 23);
            getContentPane().add(Title);


            char1 = new JTextField("Character 1");
            char1.setBounds(63, 100, 89, 23);
            getContentPane().add(char1);

            name1 = new JLabel("name: ");
            name1.setBounds(0, 100, 89, 23);
            getContentPane().add(name1);


        char1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                mensaje = App.this.char1.getText();
                Finished finished = new Finished(mensaje);
            }
        });





        //Character 2 setup.
        char2 = new JTextField("Character 2");
        char2.setBounds(63, 210, 89, 23);
        getContentPane().add(char2);

        name2 = new JLabel("name: ");
        name2.setBounds(0, 210, 89, 23);
        getContentPane().add(name2);

        char2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                mensaje = App.this.char2.getText();
                Finished finished = new Finished(mensaje);
            }
        });
    }

    public static void main(String[] args) {
        App frame = new App();
        frame.setVisible(true);
    }
}