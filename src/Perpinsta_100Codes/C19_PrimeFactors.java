package Perpinsta_100Codes;
import java.util.Scanner;

public class C19_PrimeFactors {
    static boolean isPrime(int x){
        for(int i=2;i<x;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
    static void  FactorCount(int x,int y){
        while(x%y==0){
            x=x/y;
            System.out.print(" "+y+" ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Prime factors of "+n+" are:");
        for(int i=2;i<=n;i++){
            if(n%i==0){
                if(isPrime(i)){
                    FactorCount(n,i) ;
                }
            }
        }


    }
}
