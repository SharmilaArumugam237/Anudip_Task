import java.util.*;
public class Conditional {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name :");
        String Name = sc.next();
        System.out.println("std (X or XII):");
        String std = sc.next();
        if("X".equals(std)){
            Xth_std(Name,std);
        }
        else if ("XII".equals(std)){
            XIIth_std(Name,std);
        }
        else{
            System.out.println("Enter valid standard X or XII");
        }


    }

    private static void Xth_std(String Name, String std) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tamil :");
        int tamil = sc.nextInt();
        System.out.println("English :");
        int English = sc.nextInt();
        System.out.println("Maths :");
        int Maths = sc.nextInt();
        System.out.println("Science :");
        int Science = sc.nextInt();
        System.out.println("Social :");
        int Social = sc.nextInt();
        int tot = tamil+ English+Maths+Science+Social;
        System.out.println("Name : "+Name);
        System.out.println("Std : "+std);
        System.out.println("Total Marks = "+ tot);
        System.out.println("Average Score = "+tot/5);
    }

    public static void XIIth_std(String Name, String std){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamil :");
        int tamil = sc.nextInt();
        System.out.println("English :");
        int English = sc.nextInt();
        System.out.println("Maths :");
        int Maths = sc.nextInt();
        System.out.println("Computer Science :");
        int ComScience = sc.nextInt();
        System.out.println("Chemistry :");
        int Chemistry = sc.nextInt();
        System.out.println("Physics :");
        int Physics = sc.nextInt();

        int tot = tamil+ English+Maths+ComScience+Chemistry+Physics;
        System.out.println("Name : "+Name);
        System.out.println("Std : "+std);
        System.out.println("Total Marks = "+ tot);
        System.out.println("Average Score = "+tot/6);

    }
}
