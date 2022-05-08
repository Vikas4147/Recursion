package Perpinsta_100Codes;
import java.util.Scanner;

public class C12_ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int count=0; int remainder;double  result =0;
        int n1=n ; int n2=n;
        while(n!=0){
            count ++;
            n=n/10;
        }
        while(n1!=0){
            remainder=n1%10;
            result= result+ Math.pow(remainder,count);
            n1=n1/10 ;
        }
        if(result==n2){
            System.out.println("Entered number "+n2+" is an Armstrong number");
        }
        else{
            System.out.println("Entered number "+n2+" is not an Armstrong number");

        }
    }
}
