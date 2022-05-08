package Perpinsta_100Codes.WorkingWithNumbers;
import java.util.Scanner;

public class C5_OctalToDecimal {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int remainder ; double result=0 ;int i=0; int n1=n;
        while (n!=0){
            remainder=n%10;
            result=result+remainder*Math.pow(8,i);
            i++;
            n=n/10;
        }
        System.out.println("Decimal conversion of octal "+n1+" is "+result);
    }
}
