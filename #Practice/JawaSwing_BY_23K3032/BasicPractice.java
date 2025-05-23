package JawaSwing_BY_23K3032;

import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class BasicPractice {
    public static void main(String[] args) {
        /*
         * Creating a window by JFrame
         */
    
        JFrame frame = new JFrame("My SWING Application");

        // frame.setBounds(50, 50, 100, 50);
        // frame.setTitle("My SWING Application");
        /*
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);*/
        // frame.setAlwaysOnTop(true);
        

        /*
         * JOptionPane
         *//*

        String name;
        int age;
        double height;

        name = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height:"));
        JOptionPane.showMessageDialog(null, "Your height is " + height + "m");
        */

        /*
         * Adding Checkbox on Frame
         *//*

        JLabel label = new JLabel("Select known languages");
        label.setBounds(100, 50, 200, 30);
        frame.add(label);

        JCheckBox chkBox_1 = new JCheckBox("Arabic");
        chkBox_1.setBounds(100, 100, 100, 30);

        JCheckBox chkBox_2 = new JCheckBox("English");
        chkBox_2.setBounds(100, 150, 100, 30);

        JCheckBox chkBox_3 = new JCheckBox("Urdu");
        chkBox_3.setBounds(100, 200, 100, 30);
         
        frame.add(chkBox_1);
        frame.add(chkBox_2);
        frame.add(chkBox_3);

        JButton button = new JButton("Exit");
        button.setBounds(100, 300, 100, 30);
        button.addActionListener(e->System.exit(0));    // e-> is a lambda expression
        frame.add(button);

        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        */

        /*
         * Will not proceed without accepting T&C by checking the checkbox
         *//*
         *//*

        JLabel label = new JLabel("Enter your name:");
        label.setBounds(20, 20, 150, 20);

        JTextField textField = new JTextField();
        textField.setBounds(150, 20, 150, 20);

        JButton button = new JButton("Click Me");
        button.setBounds(150, 60, 100, 30);

        JCheckBox chkBox = new JCheckBox("Accept Terms & Conditions");
        chkBox.setBounds(150, 100, 180, 20);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                if(chkBox.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Welcome " + input);
                } else {
                    JOptionPane.showMessageDialog(null, "Please accept the terms & conditions");
                }
            }
        });

        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(chkBox);

        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        */

        /*
         * Application for a rectangle calculator
         */

        frame.setTitle("Rectangle Area and Perimeter");
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(5, 2));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel lengthLabel, widthLabel, areaLabel, perimeterLabel;
        lengthLabel = new JLabel("Enter the length:", SwingConstants.CENTER);
        widthLabel = new JLabel("Enter the width:", SwingConstants.CENTER);
        areaLabel = new JLabel("The area is:", SwingConstants.CENTER);
        perimeterLabel = new JLabel("Perimeter:", SwingConstants.CENTER);
        

        JTextField lengthField, widthField, areaField, perimeterField;
        lengthField = new JTextField(10);   // can have 10 digits only
        widthField = new JTextField(10);
        areaField = new JTextField(10);
        areaField.setEditable(false);
        perimeterField = new JTextField(10);
        perimeterField.setEditable(false);


        JButton calButton, exitButton;
        calButton = new JButton("Calculate");
        exitButton = new JButton("Exit");

        calButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double length = Double.parseDouble(lengthField.getText());
                    double width = Double.parseDouble(widthField.getText());

                    double area = length * width;
                    double perimeter = 2 * (length + width);

                    areaField.setText(String.valueOf(area));
                    perimeterField.setText(String.valueOf(perimeter));
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers.");
                }
            }
        });

        exitButton.addActionListener(e->System.exit(0));    // e-> is a lambda expression

        // Add labels & fields to frame
        frame.add(lengthLabel);
        frame.add(lengthField);
        frame.add(widthLabel);
        frame.add(widthField);
        frame.add(areaLabel);
        frame.add(areaField);
        frame.add(perimeterLabel);
        frame.add(perimeterField);

        // Add buttons to frame
        frame.add(calButton);
        frame.add(exitButton);


        frame.setVisible(true);
    }
}