package Perpinsta_100Codes;
import java.util.Scanner;

public class C7_PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int a =0;
        if(n<=1){
            System.out.println("Not a prime number");
        }
        for(int i=2;i<n/2;i++){
                if(n%i==0){
                    a=a+1;
                }
            }
            if(a>0){
                System.out.println("Entered number is not a prime number  ");
            }
            else{
                System.out.println("Entered number is a prime number ");
            }
        }

    }

