package Assignment_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyApplication {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Akniet", "Balyk", "Manager", 27045.78);
        Employee employee2 = new Employee("Alim", "Aldiyarov", "Developer", 50000.00);
        Student student1 = new Student("Baktiyar", "Kuanysh", 3.44);
        Student student2 = new Student("Ermakhan", "Khamitov", 2.88);

        List<Person> people = new ArrayList<>();
        people.add(employee1);
        people.add(employee2);
        people.add(student1);
        people.add(student2);

        Collections.sort(people);
        printData(people);
    }

    public static void printData(Iterable<Person> persons) {
        for (Person people : persons) {
            System.out.println(people + " earns " + String.format("%.2f", people.getPaymentAmount()) + " tenge");
        }
    }
}