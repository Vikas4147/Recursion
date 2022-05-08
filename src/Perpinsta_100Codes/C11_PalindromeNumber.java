package Perpinsta_100Codes;
import java.util.Scanner;

public class C11_PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int num= n ;
        int remainder; int reverse =0;
        while (n!=0){
            remainder=n%10 ;
            reverse =reverse*10+remainder ;
            n=n/10 ;
        }

        if(reverse==num){
            System.out.println("Entered  number is palindrome number :");
        }
        else{
            System.out.println("Entered number is not a palindrome number ");
        }
    }
}
