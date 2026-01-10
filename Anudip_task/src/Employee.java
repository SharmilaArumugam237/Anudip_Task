public class Employee {
    String emp_id;
    String emp_name;
    String designation;
    public void setvalue(String emp_id, String emp_name, String designation){
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.designation = designation;
    }
    public void display(){
        System.out.println("Employee ID :"+emp_id);
        System.out.println("Employee Name :"+emp_name);
        System.out.println("Designation :"+designation);
    }
    public static void main(String args[]){
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        emp1.setvalue("EMP00054","Sharmila","Team Leader");
        emp2.setvalue("EMP00063","Dharani","Junior Developer");
        System.out.println("Employee 1 details");
        emp1.display();
        System.out.println("Employee 2 details");
        emp2.display();

    }
}
