class Student {
    private String name;
    private int age;

    // Setter method
    void setDetails(String n, int a) {
        name = n;
        age = a;
    }

    // Getter method
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setDetails("Rahul", 19);
        s1.displayDetails();
    }
}
