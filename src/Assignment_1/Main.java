package Assignment_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        School school = new School();
        List<Student> students = Student.readStudentsFromFile("C:\\Users\\ryshy\\Downloads\\students (1).txt");
        for (Student student : students) {
            school.addMember(student);
        }
        List<Teacher> teachers = Teacher.readTeachersFromFile("C:\\Users\\ryshy\\Downloads\\teachers.txt");
        for (Teacher teacher : teachers) {
            school.addMember(teacher);
        }
        System.out.println(school);
        for (Student student : students) {
            System.out.println(student + " GPA: " + student.calculateGPA());
        }
        for (Teacher teacher : teachers) {
            if (teacher.yearsOfExperience > 10) {
                teacher.giveRaise(10);
                System.out.println(teacher + " New salary: " + teacher.salary);
            }
        }


    }
}

