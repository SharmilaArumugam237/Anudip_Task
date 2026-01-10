import java.util.Scanner;

public class fibonnaci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        FibonacciSeries(n);
    }
    public static void FibonacciSeries(int n){
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        for(int i =2;i<n ;i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
