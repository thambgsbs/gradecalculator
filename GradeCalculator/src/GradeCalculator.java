/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.*;
import java.awt.event.*;
import javax.swing.SpringLayout;


public class GradeCalculator extends JFrame {
// Declare private variables for the Swing components
private JLabel lblStudentName, lblStudentNo, lblMS1, lblMS2, lblTA;
private JTextField txtStudentName, txtStudentNo, txtMS1, txtMS2, txtTA;
private JButton calculateButton;


public GradeCalculator() {
// Set up the frame
super("Grade Calculator");
setSize(450, 250);


// Create the components
// Create labels and textfields
lblStudentName = new JLabel("Student Name:");
txtStudentName = new JTextField(30);
lblStudentNo = new JLabel("Student No:");
txtStudentNo = new JTextField(30);
lblMS1 = new JLabel("Milestone 1:");
txtMS1 = new JTextField(10);
lblMS2 = new JLabel("Milestone 2:");
txtMS2 = new JTextField(10);
lblTA = new JLabel("Terminal Assessment:");
txtTA = new JTextField(10);
calculateButton = new JButton("Calculate");

// Define the panel to hold the components
JPanel panel = new JPanel();
SpringLayout layout = new SpringLayout();
panel.setSize(300, 300);
panel.setLayout(layout);

// Add the components to the frame
panel.add(lblStudentName);
panel.add(txtStudentName);
panel.add(lblStudentNo);
panel.add(txtStudentNo);
panel.add(lblMS1);
panel.add(txtMS1);
panel.add(lblMS2);
panel.add(txtMS2);
panel.add(lblTA);
panel.add(txtTA);
panel.add(calculateButton);

// Put constraint on components
// Set label position: left
layout.putConstraint(SpringLayout.WEST, lblStudentName, 6, SpringLayout.WEST, panel);
layout.putConstraint(SpringLayout.WEST, lblStudentNo, 6, SpringLayout.WEST, panel);
layout.putConstraint(SpringLayout.WEST, lblMS1, 6, SpringLayout.WEST, panel);
layout.putConstraint(SpringLayout.WEST, lblMS2, 6, SpringLayout.WEST, panel);
layout.putConstraint(SpringLayout.WEST, lblTA, 6, SpringLayout.WEST, panel);

// Set label and textfield position: top and bottom
layout.putConstraint(SpringLayout.NORTH, lblStudentName, 6, SpringLayout.NORTH, panel);
layout.putConstraint(SpringLayout.NORTH, txtStudentName, 6, SpringLayout.NORTH, panel);
layout.putConstraint(SpringLayout.NORTH, lblStudentNo, 10, SpringLayout.SOUTH, lblStudentName);
layout.putConstraint(SpringLayout.NORTH, txtStudentNo, 6, SpringLayout.SOUTH, txtStudentName);
layout.putConstraint(SpringLayout.NORTH, lblMS1, 10, SpringLayout.SOUTH, lblStudentNo);
layout.putConstraint(SpringLayout.NORTH, txtMS1, 6, SpringLayout.SOUTH, txtStudentNo);
layout.putConstraint(SpringLayout.NORTH, lblMS2, 10, SpringLayout.SOUTH, lblMS1);
layout.putConstraint(SpringLayout.NORTH, txtMS2, 6, SpringLayout.SOUTH, txtMS1);
layout.putConstraint(SpringLayout.NORTH, lblTA, 10, SpringLayout.SOUTH, lblMS2);
layout.putConstraint(SpringLayout.NORTH, txtTA, 6, SpringLayout.SOUTH, txtMS2);

// Set textfield position: right
layout.putConstraint(SpringLayout.WEST, txtStudentName, 6, SpringLayout.EAST, lblStudentName);
layout.putConstraint(SpringLayout.WEST, txtStudentNo, 24, SpringLayout.EAST, lblStudentNo);
layout.putConstraint(SpringLayout.WEST, txtMS1, 51, SpringLayout.EAST, lblMS1);
layout.putConstraint(SpringLayout.WEST, txtMS2, 51, SpringLayout.EAST, lblMS2);
layout.putConstraint(SpringLayout.WEST, txtTA, 51, SpringLayout.EAST, lblTA);

// Set button position
layout.putConstraint(SpringLayout.NORTH, calculateButton, 6, SpringLayout.SOUTH, txtTA);
layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, calculateButton, 0, SpringLayout.HORIZONTAL_CENTER, panel);


//Add panel to frame
add(panel);


// Add an ActionListener to the button
calculateButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
// Instantiate Student class
Student stud = new Student();

// Assign textfield values to stud object
stud.setStudentName(txtStudentName.getText());
stud.setStudentNumber(txtStudentNo.getText());
stud.setQuiz1(Float.parseFloat(txtMS1.getText()));
stud.setQuiz2(Float.parseFloat(txtMS2.getText()));
stud.setQuiz3(Float.parseFloat(txtTA.getText()));

// Instantiate and call GradeOutput class
GradeOutput output = new GradeOutput(stud);
output.setVisible(true);
}
});
}   
}
