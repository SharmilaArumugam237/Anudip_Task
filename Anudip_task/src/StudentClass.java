public class StudentClass {
    String roll_no;
    String name;
    String dept;
    public void setvalue(String roll_no, String name, String dept){
        this.roll_no = roll_no;
        this.name = name;
        this.dept = dept;
    }
    public void display(){
        System.out.println("Roll_Number :"+roll_no);
        System.out.println("Name :"+name);
        System.out.println("Department :"+dept);
    }
    public static void main(String args[]){
        StudentClass s1 = new StudentClass();
        StudentClass s2 = new StudentClass();
        StudentClass s3 = new StudentClass();
        s1.setvalue("101","Sharmila","MCA");
        s2.setvalue("1023","Aarthi","MBA");
        s3.setvalue("1010","Shalini","MSC");
        System.out.println("Student 1 details");
        s1.display();
        System.out.println("Student 2 details");
        s2.display();
        System.out.println("Student 3 details");
        s3.display();
    }
}
