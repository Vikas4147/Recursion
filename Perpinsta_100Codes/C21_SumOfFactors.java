package Perpinsta_100Codes;
import java.util.Scanner;

public class C21_SumOfFactors {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0; int n1=n;
        for (int i=1 ;i<=n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==2*n1){
            System.out.println("Entered number "+n1+" is a perfect number ");
        }
        else{
            System.out.println("Entered number "+n1+" is not a perfect number ");

        }

    }
}
