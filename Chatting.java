public class Person {
    private String name;
    private int age;

    // Constructor 1: Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor 2: Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
