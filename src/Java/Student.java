package Java;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private static int counter = 1;
    private int studentID;
    private List<Integer> grades;

    public Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        this.studentID = counter++;
        this.grades = new ArrayList<Integer>();
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        }
    }
    public double calculateGPA() {
        if(grades.isEmpty()){
            return 0.0;
        }
        double sum = 0.0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }


    @Override
    public String toString() {
        return super.toString() + " I am a student with ID " + studentID + ".";
    }

}
