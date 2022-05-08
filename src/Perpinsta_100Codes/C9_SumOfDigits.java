package Perpinsta_100Codes;
import java.util.Scanner;
// Here we don't know about number of digits hence using while loops
public class C9_SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        int sum=0;
        while (n!=0){
            a=n % 10;
            n= n/10;
            sum+=a;
        }
        System.out.println("Sum of digits is :"+sum);
    }

}
