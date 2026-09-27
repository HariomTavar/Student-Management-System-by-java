package service;
import java.util.ArrayList;

import model.Student;

public class StudentService {
private ArrayList<Student> students = new ArrayList<>();


public void addStudent(Student student){
students.add(student);
System.out.println("Student added Successfully!");


}
public void viewAllStudent(){
    if(students.isEmpty()){
System.out.println("No Student found!");
return;
    }
    for(Student student : students){
        System.out.println(student);
    }
}





}