/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentapplication;

import java.util.Scanner;

/**
 *
 * @author HaiAu
 */
public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses = "";
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;   //static so each student is different and true within class
    
    //Constructor prompt user to enter student's name and year
    //because we have to prompt so no arg
    public Student(){
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter student first name: ");
        this.firstName = userInput.nextLine();
        
        System.out.print("Enter student last name: ");
        this.lastName = userInput.nextLine();
        
        System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Senior\nEnter student grade level: ");
        this.gradeYear = userInput.nextInt();
        
        //id++; //so each student have their unique id
        setStudentId();       
        
    }
    
    //generate Id set student id so it is void
    private void setStudentId(){
        //Grade level + static id
        id++;
        this.studentId = gradeYear + "" + id;
    }
            
    //Enroll in courses
    public void enroll(){
        //get inside a loop, user hits O to finish
        do{
            System.out.println("Enter course to enroll (Q to quit): "); //because course is string so use Q instead of 0
            Scanner userInput = new Scanner(System.in);
            String course = userInput.nextLine();
            if (!course.equals("Q") ){
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }else{
                break;
            }
        }while(1 != 0);     //always true
    }       
    
    //View balance
    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }
            
    //Pay tution
    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner userInput = new Scanner(System.in);
        int payment = userInput.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }
    
    //show status
    public String toString(){
        return "Name: "+ firstName + " " + lastName + 
                "\nGrade level: " + gradeYear +
                "\nStudent Id: " + studentId +
                "\nCourses enrolled: " + courses + 
                "\nBalance: $" + tuitionBalance;
    }
}
