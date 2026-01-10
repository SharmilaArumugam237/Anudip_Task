import java.util.Scanner;
public class Reverse_Num {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int num = sc.nextInt();
        int rev_num = 0;
        while(num !=0){
           int digit = num % 10;
           rev_num = rev_num * 10 + digit;
           num = num/10;
        }
        System.out.println("Reverse of a Number is :"+rev_num);
    }
}
