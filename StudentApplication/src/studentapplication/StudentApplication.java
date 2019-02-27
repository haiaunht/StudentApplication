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
public class StudentApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ask how many new students we want to add
        System.out.print("Enter number of new students to enroll: ");
        Scanner userInput = new Scanner(System.in);
        //array of objects students
        int numOfStudents = userInput.nextInt();
        Student[] students = new Student[numOfStudents];    //array of all students object
        
        //create n number of new students, loop through each student to get info
        for (int i=0; i<numOfStudents; i++){
            System.out.println("Student number: " + (i+1));
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].toString());
        }
    }
    
}
