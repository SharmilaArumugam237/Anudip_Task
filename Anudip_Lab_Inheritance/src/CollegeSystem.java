class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class ClgStudent extends Person {
    String course;
    int rollNo;
    ClgStudent(String name, int age, String course, int rollNo) {
        super(name, age); // call parent constructor
        this.course = course;
        this.rollNo = rollNo;
    }
    @Override
    void display() {
        super.display();
        System.out.println("Course: " + course);
        System.out.println("Roll No: " + rollNo);
    }
}
class Professor extends Person {
    String subject;
    int employeeId;
    Professor(String name, int age, String subject, int employeeId) {
        super(name, age);
        this.subject = subject;
        this.employeeId = employeeId;
    }
    @Override
    void display() {
        super.display();
        System.out.println("Subject: " + subject);
        System.out.println("Employee ID: " + employeeId);
    }
}
public class CollegeSystem {
    public static void main(String[] args) {

        ClgStudent student = new ClgStudent("Amit", 20, "BCA", 101);
        Professor professor = new Professor("Dr. Sharma", 45, "Computer Science", 5001);

        System.out.println("Student Details:");
        student.display();

        System.out.println("\nProfessor Details:");
        professor.display();
    }
}
