package Perpinsta_100Codes;
import java.util.Scanner;

public class C15_NthTermOfFibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter the element you want to print:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0 ; int b=1; int element=0; int temp;
        for(int i=1;i<=n-2;i++){
            element= a+b;
            temp=a;
            a=b;
            b=element;
        }
        System.out.println(n+" Element of Fibonacci series is "+element);

    }
}
