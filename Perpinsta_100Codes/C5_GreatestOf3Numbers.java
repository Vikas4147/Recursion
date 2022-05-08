package Perpinsta_100Codes;
import java.util.Scanner;

public class C5_GreatestOf3Numbers {
    public static void main(String[] args) {
        System.out.println("Enter first number ");
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        System.out.println("Enter second  number ");
        int b =sc.nextInt();
        System.out.println("Enter third number ");
        int c =sc.nextInt();
        if(a>b) {
            if (a > c) {
                System.out.println(a + " is greatest number ");
            } else if (b > c) {
                System.out.println(b + " is greatest number ");
            } else {
                System.out.println(c + " is greatest number ");
            }
        }



    }
}
