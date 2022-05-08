package Perpinsta_100Codes;
import java.util.Scanner;

public class C22_AutomorphicNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt(); int count =1; int n1=n; double result ;
        double  sqr=Math.pow(n,2);
        while(n!=0){
            count=count*10 ;
            n=n/10;
        }
        result =sqr-n1;
        if(result%count==0){
            System.out.println("Entered number is an Automorphic number:");
        }
        else{
            System.out.println("Entered number is not an Automorphic number:");
        }


    }
}
