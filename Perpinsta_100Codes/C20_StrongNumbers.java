package Perpinsta_100Codes;
import java.util.Scanner;

public class C20_StrongNumbers {
    static int Factorial(int x){
        int fact=1;
        for(int i=x;i>=1;i--){
            fact=fact*i ;
        }
        return fact;

    }

    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int remainder; int n1=n;int sum=0;
        while(n!=0){
            remainder=n%10 ;
            n=n/10;
            sum=sum+Factorial(remainder);
        }
        if(n1== sum){
            System.out.println("Entered number "+n1+" is a strong number ");
        }
        else{
            System.out.println("Entered number "+n1+" is not a strong number ");
        }
    }
}
