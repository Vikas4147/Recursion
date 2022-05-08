package Perpinsta_100Codes;
import java.util.Scanner;

public class C14_FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter the number of Fibonacci elements you want to print:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("First "+n+" elements of Fibonacci series are:");
        int a=0 ; int b=1 ;int result;
        System.out.print(" "+a+" "+b);
        int temp ;
        for(int i=1;i<=n-2;i++){
            result =a +b;
            temp=a;
            a=b;
            b=result;
            System.out.print(" "+result);
        }

    }
}
