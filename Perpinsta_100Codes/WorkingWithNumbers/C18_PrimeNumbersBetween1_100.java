package Perpinsta_100Codes.WorkingWithNumbers;
import java.util.Scanner;

public class C18_PrimeNumbersBetween1_100 {
    static boolean isPrime(int x){
        for(int i=2;i<x;i++){
            if(x%i==0){
                return false ;
            }
        }
        return true ;
    }
    public static void main(String[] args) {
        System.out.println("Prime Numbers brtween 1-100 are :");
        for(int i=2;i<=100;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
