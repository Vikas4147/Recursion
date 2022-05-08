package Perpinsta_100Codes.WorkingWithNumbers;
import java.util.Scanner;

public class C4_DecimalToBinary {
    public static void main(String[] args) {
        System.out.println("Enter a decimal number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); int i=0;
        int remainder; double result=0;
        int n1=n;
        while(n!=0){
            remainder=n%2 ;
            result= result+remainder*Math.pow(10,i);
            n=n/2;
            i ++;
        }
        System.out.println("Binary conversion of decimal number "+n1+" is "+result);
    }
}
