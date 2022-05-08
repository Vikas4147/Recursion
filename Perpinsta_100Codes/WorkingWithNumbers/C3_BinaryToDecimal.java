package Perpinsta_100Codes.WorkingWithNumbers;
import java.util.Scanner;

public class C3_BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println("Enter a binary number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); int n1=n;
        int count =0; int remainder; double result=0;
        while(n!=0){
            remainder=n%10;
            result= result+remainder*Math.pow(2,count);
            n=n/10;
            count++ ;
        }
        System.out.println("Decimal conversion of binary "+n1+" is "+result);
    }
}
