import java.util.Scanner;
public class Calculator_Menu {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("------------Calculator-Menu----------------");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            int num1, num2;
            if(choice >= 1 && choice <= 4) {

                System.out.print("Enter First number :");
                num1 = sc.nextInt();
                System.out.print("Enter Second number :");
                num2 = sc.nextInt();
            }
            else{
                num1=num2=0;
            }
            switch (choice){
                case 1:
                    System.out.println("Addition of two number is :"+(num1+num2));
                    break;
                case 2:
                    System.out.println("Addition of two number is :"+ (num1-num2));
                    break;
                case 3:
                    System.out.println("Addition of two number is :"+ (num1*num2));
                    break;
                case 4:
                    System.out.println("Addition of two number is :"+ (num1/num2));
                    break;
                case 5:
                    System.out.println("Exit....");
                    break;
                default:
                    System.out.println("Enter your valid choice:");

            }
        }while(choice !=5);
    }

}
