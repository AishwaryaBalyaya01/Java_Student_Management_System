/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_management_system;

import java.util.Scanner;


/**
 *
 * @author aishw
 */
public class Student_Database_App {

    public static void main(String[] args) {
        // Ask how many users we want to add
        System.out.println("Enter number of Students to enroll: ");
        Scanner in = new Scanner(System.in);
        int noOfStudents = in.nextInt();
        
        // Create n number of new students
        Student[] students = new Student[noOfStudents];
        for(int n =0;n<noOfStudents;n++){
            students[n] = new Student(n);
            System.out.println(students[n].showInfo());
        }
        
        
    }
    
}
