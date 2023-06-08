/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_management_system;


/**
 *
 * @author aishw
 */
public class Student_Database_App {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.enroll();
        student1.payTution();
        System.out.println(student1.showInfo());
        // Ask how many users we want to add
        // Create n number of new students
    }
    
}
