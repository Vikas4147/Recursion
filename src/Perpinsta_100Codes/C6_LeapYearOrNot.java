package Perpinsta_100Codes;
import java.util.Scanner;

public class C6_LeapYearOrNot {
    public static void main(String[] args) {
        System.out.println("Enter the year in YYYY format :");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%400==0){
            System.out.println("Entered year "+year+" is a leap year");
        }
        else if(year%4==0 && year%100 !=0){
            System.out.println("Entered year "+year+" is a leap year");
        }
        else{
            System.out.println("Entered year "+year+" is not a  leap year");
        }
    }
}
