package Perpinsta_100Codes;
import java.util.Scanner;

public class C18_FactorOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        double n = sc.nextInt();
        System.out.println("Factor of "+n+" are:");
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print(" "+i+" ");
            }
        }System.out.print(" "+n);
    }
}
