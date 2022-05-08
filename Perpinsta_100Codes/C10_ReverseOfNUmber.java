package Perpinsta_100Codes;
import java.util.Scanner ;

public class C10_ReverseOfNUmber {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int remainder=0 ;
        int reverse =0;
        while(n!=0){
            remainder=n%10 ;
            reverse = reverse*10+remainder ;
            n=n/10 ;
        }
        System.out.println("Reverse of a number is:"+reverse );

    }
}
