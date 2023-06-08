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
public class Student {
    private static int id = 100;
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses="";
    private int tutionBalance=0;
    private static int costOfCourse  =600; //Same for all students
    //Constructor: Prompts user to enter stuent'Name & Year
        public Student(){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter student First name: ");
            this.firstName = in.nextLine();
            
            System.out.print("Enter student Last name: ");
            this.lastName = in.nextLine();
            
            System.out.println("1 for Freshmen\n2 for Sophomore\n3 for Junior\n4 for Graduate\nEnter student class level: ");
            this.gradeYear = in.nextInt();
            setStudentId();
            
        }
    //Generate an Id
        
        private void setStudentId(){
            //Grade Level + ID
            id++;
            this.studentId = gradeYear + ""+ id;
        }
    
    //Enroll in Courses
        public void enroll(){
        //Get isnide a loop, user hits 0
        do{
            System.out.print("Enter course to enroll (Q to Quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if(!course.equals("Q")){
                courses = courses + "\n" + course;
                tutionBalance = tutionBalance + costOfCourse;
            }
            else break;
        }while(1!=0);
        }
    
    //View balance 
       public void viewBalance(){
           System.out.println("Your current balance is: $"+tutionBalance);
       }
    //Pay Tution
       public void payTution(){
           viewBalance();
           System.out.print("Please enter your payment: ");
           Scanner in = new Scanner(System.in);
           int payment = in.nextInt();
           tutionBalance = tutionBalance - payment;
           System.out.println("Thank you for your payment of $"+payment);
           viewBalance();
       }    
    
    //Show Status
       public String showInfo(){
           return "Student Id: "+id+"\nName: "+firstName+" "+lastName+"\nGrade Level: "+gradeYear+"\nCourse Enrolled: "+courses+"\nTution Balance "+tutionBalance;
       }
}
