import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArmstrongNum(num);
    }
    public static void ArmstrongNum(int num){
        if(num == isArmstrongNum(num)){
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not an Armstrong Number");
        }
    }
    public static int isArmstrongNum(int n){
        int sum=0;
        while (n != 0) {
            int a= n%10;
            sum += a*a*a;
            n = n/10;
        }
        return sum;


    }
}
