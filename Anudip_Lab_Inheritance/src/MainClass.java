class Employee {
    String name;
    int id;
    double salary;
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}
class Manager extends Employee {
    String department;
    Manager(String name, int id, double salary, String department) {
        super(name, id, salary); // calling parent constructor
        this.department = department;
    }
    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Department: " + department);
    }
}
class Developer extends Employee {
    String programmingLanguage;
    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
public class MainClass {
    public static void main(String[] args) {

        Manager manager = new Manager("Alice", 101, 75000, "HR");
        Developer developer = new Developer("Bob", 102, 60000, "Java");

        System.out.println("Manager Details:");
        manager.showDetails();

        System.out.println("\nDeveloper Details:");
        developer.showDetails();
    }
}
