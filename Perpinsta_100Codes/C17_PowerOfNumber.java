package Perpinsta_100Codes;
import java.util.Scanner;

public class C17_PowerOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter the base:");
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        System.out.println("Enter the power:");
        int power=sc.nextInt();
        int result=1;
        for(int i=1;i<=power;i++){
            result=result*base ;
        }
        System.out.println("Final answer is:"+result);
    }
}
