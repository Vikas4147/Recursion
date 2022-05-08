package Perpinsta_100Codes.WorkingWithNumbers;
import java.util.Scanner;

public class C7_DecimalToOctal {
    public static void main(String[] args) {
        System.out.println("Enter an decimal number:"); // Digits must be between 0-7
        Scanner sc= new Scanner(System.in);
        int decimal = sc.nextInt();
        int remainder ; double  octal=0; int count =0 ;
        while(decimal!=0){
            remainder =decimal%8;
            octal+=remainder*Math.pow(10,count);
            decimal=decimal/8;
            count++;
        }
        System.out.println("Octal format of number "+decimal +" is "+octal);
    }
}
