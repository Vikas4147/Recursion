package Perpinsta_100Codes.WorkingWithNumbers;
import java.util.Scanner ;

public class C19_NoOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(); int count =0 ;
        System.out.print("No of digits in "+n+" is:");
        while(n!=0){
            count ++;
            n=n/10;
        }
        System.out.println(count );
    }
}
