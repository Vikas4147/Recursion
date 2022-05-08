package Perpinsta_100Codes;
import java.sql.SQLOutput;
import java.util.Scanner;

public class C1_PositiveNegattiveNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         if(n>0){
             System.out.println("Entered number "+ n+" is positive ");
         }
         else{
             System.out.println("Entered number"+ n+" is negative  ");

         }


    }
}
