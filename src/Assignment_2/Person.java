package Assignment_2;

public class Person implements Payable, Comparable<Payable> {
    private static int idCounter = 0;
    private final int id;
    private String name;
    private String surname;

    public Person() {
        this.id = ++idCounter;
    }

    public Person(String name, String surname) {
        this.id = ++idCounter;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    public String getPosition() {
        return "Student";
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }

    @Override
    public int compareTo(Payable other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
}
