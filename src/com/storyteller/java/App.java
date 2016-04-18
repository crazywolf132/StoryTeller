package com.storyteller.java;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class App extends JFrame {

    public String substitutionText;
    public JLabel logo;
    public JLabel motto;
    public JTextField name;
    public JTextField selected;
    private JLabel sceneLabel;
    private JLabel characterName;
    private int count = 0;
    public String[] scene = {"Horror", "Christmas", "Easter", "New Years", "Death"};
    //Buttons:
    private JButton btnDo;

    /**
     * Maybe add this to its own class, along with the resizable = false thingo, so then every class can use it without
     * recoding it.
     */
    public static int WIDTH = 300;
    public static int HEIGHT = 300;
    //End add to own class
    //DONT ADD THIS \/\/\/ TO THAT CLASS
    public JComboBox comboBox;


    public App() {


        /**
         * Lets try to make this resizeable, so then it can go to any screen.
         */

        getContentPane().setLayout(null);
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setTitle("Story Teller");

        //Set gui elements:
        int doWidth = 80;
        int doHeight = 20;
        logo = new JLabel("Story Teller");
        motto = new JLabel("How have you changed the world?");
        btnDo = new JButton("Do");
        characterName = new JLabel("Name: ");
        name = new JTextField(10);
        sceneLabel = new JLabel("Scene: ");
        selected = new JTextField(40);
        comboBox = new JComboBox();

        //Layout gui elements:
        btnDo.setBounds(WIDTH / 2 - doWidth / 2, HEIGHT - doHeight - 30, doWidth, doHeight);
        int stdHeight = 23;
        int charNameWidth = (int) characterName.getPreferredSize().getWidth();
        int inpWidth = 200;//same for chooser
        int inpSpace = 20;
        int fromTop = 20;
        characterName.setBounds(WIDTH / 2 - (inpWidth + charNameWidth + inpSpace) / 2, fromTop, charNameWidth, stdHeight);
        name.setBounds(WIDTH / 2 - (inpWidth + charNameWidth + inpSpace) / 2 + charNameWidth + inpSpace, fromTop, inpWidth, stdHeight);
        int sceneLabelWidth = (int) sceneLabel.getPreferredSize().getWidth();
        //TODO: ADD LOGO HERE... BUT ADD IT IN THE MIDDLE AT THE TOP
        //TODO: ADD MOTO HERE... BUT ADD IT IN THE MIDDLE AT THE TOP UNDER THE LOGO.
        characterName.setBounds(WIDTH/2-(inpWidth+charNameWidth+inpSpace)/2, fromTop, charNameWidth, stdHeight);
        name.setBounds(WIDTH/2-(inpWidth+charNameWidth+inpSpace)/2+charNameWidth+inpSpace, fromTop, inpWidth, stdHeight);
        int sceneLabelWidth = (int)sceneLabel.getPreferredSize().getWidth();
        int labelSpace = 10;
        sceneLabel.setBounds(WIDTH / 2 - (inpWidth + inpSpace + sceneLabelWidth) / 2, fromTop + stdHeight + labelSpace, sceneLabelWidth, stdHeight);
        selected.setBounds(WIDTH / 2 - (inpWidth + inpSpace + sceneLabelWidth) / 2 + inpSpace + sceneLabelWidth, fromTop + stdHeight + labelSpace, inpWidth, stdHeight);
        comboBox.setBounds(WIDTH / 2 - (inpWidth + inpSpace + sceneLabelWidth) / 2 + inpSpace + sceneLabelWidth, fromTop + stdHeight * 2 + labelSpace * 2, inpWidth, stdHeight);

        for (int i = 0; i < scene.length; i++) {
            comboBox.addItem(scene[count++]);
        }

        selected.setEditable(false);

        //Event listener
        btnDo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Yay made this work
                substitutionText = App.this.name.getText();
                String selectedItem = (String) App.this.comboBox.getSelectedItem();
                Finished finished = new Finished(substitutionText, selectedItem);
            }
        });
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selected.setText("You Selected : " +
                        ((JComboBox) e.getSource()).getSelectedItem());
            }
        });
        //Below this... is only to see the output in the log.
        substitutionText = name.getText();
        System.out.println(substitutionText);

        //Finished log output.

        name.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                substitutionText = App.this.name.getText();
                String selectedItem = (String) App.this.comboBox.getSelectedItem();
                Finished finished = new Finished(substitutionText, selectedItem);
            }
        });

        //Add all gui elements to content pane:
        getContentPane().add(btnDo);
        getContentPane().add(characterName);
        getContentPane().add(name);
        getContentPane().add(selected);
        getContentPane().add(sceneLabel);
        getContentPane().add(comboBox);
        getContentPane().add(logo);
        getContentPane().add(motto);
    }

    public static void main(String[] args) {
        App frame = new App();
        frame.setVisible(true);
    }
}