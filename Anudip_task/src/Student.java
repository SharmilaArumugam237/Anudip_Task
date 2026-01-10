public class Student {
    private String name;
    private int rollNumber;
    private float marks;
    public String getName() {
        return name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public float getMarks() {
        return marks;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    public void setMarks(float marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Marks must be between 0 and 100.");
        }
    }
    public void displayStudentDetails() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNumber);
        System.out.println("Marks        : " + marks);
    }
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Shagul");
        s.setRollNumber(101);
        s.setMarks(85.5f);

        s.displayStudentDetails();
    }
}

