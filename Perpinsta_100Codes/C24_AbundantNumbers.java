package Perpinsta_100Codes;
import java.util.Scanner;

public class C24_AbundantNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int  n= sc.nextInt(); int sum=0; int result ; int n1=n;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        result =sum-n1;
        if(sum>n1){
            System.out.println("Entered number is an Abundant number and the abundance is "+result);
        }
        else{
            System.out.println("Entered number is not an abundant number:");
        }


    }
}
