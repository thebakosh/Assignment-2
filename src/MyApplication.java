import java.util.ArrayList;
import java.util.Collections;

public class MyApplication {
    public static void main(String[] args) {
        ArrayList<Person> payList = new ArrayList<>();

        Employee employee = new Employee("Nursultan", "Khaimuldin", "Manager", 1000000.00);
        Employee employee2 = new Employee("Askar", "Khaimuldin", "Developer", 600000.00);
        Student student1 = new Student("Erasyl", "Gaziz", 2.48);
        Student student2 = new Student("Baktiyar", "Kuanysh", 3.44);

        payList.add(employee);
        payList.add(employee2);
        payList.add(student1);
        payList.add(student2);
        Collections.sort(payList);
        printData(payList);
    }

    public static void printData(Iterable<Person> payList) {
        for (Person payable : payList) {
            System.out.println(payable.toString() + " earns " + payable.getPaymentAmount() + " tenge");
        }
    }
}