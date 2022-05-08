package Perpinsta_100Codes;
import java.util.Scanner;

public class C2_EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Entered number is even");
        }
        else{
            System.out.println("Entered number is odd ");
        }

    }

}
