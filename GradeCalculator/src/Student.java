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
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Student {

//attributes
private String studentNumber;
private String studentName;
private float MS1;
private float MS2;
private float TA;
private float averageGrade;

//getter and setter methods
//getter methods
public String getStudentNumber() {
return studentNumber;
}

public String getStudentName() {
return studentName;
}

public String getQuiz1() {
return String.valueOf(MS1);
}

public String getQuiz2() {
return String.valueOf(MS2);
}

public String getQuiz3() {
return String.valueOf(TA);
}

public String getAveGrade() {
return String.valueOf(averageGrade);
}

//setter methods
public void setStudentNumber(String studNumber) {
studentNumber = studNumber;
}

public void setStudentName(String studName) {
studentName = studName;
}

public void setQuiz1(float q1) {
MS1 = q1;
}

public void setQuiz2(float q2) {
MS2 = q2;
}

public void setQuiz3(float q3) {
TA = q3;
}

//methods
public float computeAverage() {
averageGrade = (float) ((MS1*0.25) + (MS2*0.40) + (TA*0.35));
return averageGrade;
}

    
}

