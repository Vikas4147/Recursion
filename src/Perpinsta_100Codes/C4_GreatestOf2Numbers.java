package Perpinsta_100Codes;
import java.util.Scanner;

public class C4_GreatestOf2Numbers {
    public static void main(String[] args) {
        System.out.println("Enter first number :");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter second number :");
        int b =sc.nextInt();
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }
        else{
            System.out.println(b+" is greater than "+a);

        }

    }
}
