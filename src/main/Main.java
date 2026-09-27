package main;

import model.Student;
import service.StudentService;

public class Main {

    public static void main(String[] args) {
StudentService service = new StudentService();
Student s1 = new Student(100, "shiv", 12);
Student s4 = new Student(101, "Hariom", 20);
        Student s2 = new Student(102, "Rahul", 21);
        Student s3 = new Student(103, "Aman", 19);
        
        // add service 
        service.addStudent(s1);
        service.addStudent(s2);
        service.addStudent(s3);
System.out.println("\n===== ALL STUDENTS =====");
service.viewAllStudent();
}}