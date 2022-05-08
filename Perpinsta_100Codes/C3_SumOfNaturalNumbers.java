package Perpinsta_100Codes;
import java.util.Scanner;

public class C3_SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int b =n+1 ;
        int sum = (n*b)/2;
        System.out.println("Sum of first "+ n+" natural numbers is "+sum);


    }
}
