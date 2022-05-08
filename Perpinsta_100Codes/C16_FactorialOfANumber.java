package Perpinsta_100Codes;
import java.util.Scanner;

public class C16_FactorialOfANumber {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;

        if(n==0){
           System.out.println("Factorial is: 1");
    }else{
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
            System.out.println("Factorial of a number is: "+fact);
    }
}}
