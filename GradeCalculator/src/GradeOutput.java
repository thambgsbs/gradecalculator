/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import javax.swing.*;
import java.awt.event.*;
import javax.swing.SpringLayout;


public class GradeOutput extends JFrame {
// Declare private variables for the Swing components
private JLabel lblStudentName, lblStudentNo, lblMS1, lblMS2, lblTA, lblAveGrade;
private JTextField txtStudentName, txtStudentNo, txtMS1, txtMS2, txtTA, txtAveGrade;
private JButton closeButton;


public GradeOutput(Student stud) {
// Set up the frame
super("Grade Output");
setSize(450, 250);


// Compute Average
stud.computeAverage();


// Create the components
// Create labels
lblStudentName = new JLabel("Student Name:");
lblStudentNo = new JLabel("Student No:");
lblMS1 = new JLabel("Milestone 1:");
lblMS2 = new JLabel("Milestone 2:");
lblTA = new JLabel("Terminal Assessment:");
lblAveGrade = new JLabel("Average Grade:");

// Create Student Name textfield
txtStudentName = new JTextField(30);
txtStudentName.setEnabled(false);
txtStudentName.setText(stud.getStudentName());

// Create Student Number textfield
txtStudentNo = new JTextField(30);
txtStudentNo.setEnabled(false);
txtStudentNo.setText(stud.getStudentNumber());

// Create Quiz 1 textfield
txtMS1 = new JTextField(10);
txtMS1.setEnabled(false);
txtMS1.setText(stud.getQuiz1());

// Create Quiz 2 textfield
txtMS2 = new JTextField(10);
txtMS2.setEnabled(false);
txtMS2.setText(stud.getQuiz2());

// Create Quiz 3 textfield
txtTA = new JTextField(10);
txtTA.setEnabled(false);
txtTA.setText(stud.getQuiz3());

// Create Average Grade textfield
txtAveGrade = new JTextField(10);
txtAveGrade.setEnabled(false);
txtAveGrade.setText(stud.getAveGrade());

// Create Close button
closeButton = new JButton("Close");

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
panel.add(lblAveGrade);
panel.add(txtAveGrade);
panel.add(closeButton);

// Put constraint on components
// Set label position: left
layout.putConstraint(SpringLayout.WEST, lblStudentName, 6, SpringLayout.WEST, panel);
layout.putConstraint(SpringLayout.WEST, lblStudentNo, 6, SpringLayout.WEST, panel);
layout.putConstraint(SpringLayout.WEST, lblMS1, 6, SpringLayout.WEST, panel);
layout.putConstraint(SpringLayout.WEST, lblMS2, 6, SpringLayout.WEST, panel);
layout.putConstraint(SpringLayout.WEST, lblTA, 6, SpringLayout.WEST, panel);
layout.putConstraint(SpringLayout.WEST, lblAveGrade, 6, SpringLayout.WEST, panel);

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
layout.putConstraint(SpringLayout.NORTH, lblAveGrade, 10, SpringLayout.SOUTH, lblTA);
layout.putConstraint(SpringLayout.NORTH, txtAveGrade, 6, SpringLayout.SOUTH, txtTA);

// Set textfield position: right
layout.putConstraint(SpringLayout.WEST, txtStudentName, 6, SpringLayout.EAST, lblStudentName);
layout.putConstraint(SpringLayout.WEST, txtStudentNo, 24, SpringLayout.EAST, lblStudentNo);
layout.putConstraint(SpringLayout.WEST, txtMS1, 51, SpringLayout.EAST, lblMS1);
layout.putConstraint(SpringLayout.WEST, txtMS2, 51, SpringLayout.EAST, lblMS2);
layout.putConstraint(SpringLayout.WEST, txtTA, 51, SpringLayout.EAST, lblTA);
layout.putConstraint(SpringLayout.WEST, txtAveGrade, 51, SpringLayout.EAST, lblAveGrade);

// Set button position
layout.putConstraint(SpringLayout.NORTH, closeButton, 6, SpringLayout.SOUTH, txtAveGrade);
layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, closeButton, 0, SpringLayout.HORIZONTAL_CENTER, panel);


//Add panel to frame
add(panel);


// Add an ActionListener to the button
closeButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
dispose();
}
});
}
}
