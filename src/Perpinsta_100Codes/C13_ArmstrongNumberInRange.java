package Perpinsta_100Codes;
import java.util.Scanner;

public class C13_ArmstrongNumberInRange {
    static boolean isArmstrong(int x){
        int  count =0 ; int  remainder ; double result=0;
        int n=x ; int n1=x;
        while(x!=0){
            count ++;
            x=x/10;
        }
        while(n!=0){
            remainder=n%10;
            result=result+Math.pow(remainder,count);
            n=n/10;
        }
        return result == n1;
    }
    public static void main(String[] args) {
        System.out.println("Enter the lower limit:");
        Scanner sc=new Scanner(System.in);
        int lower=sc.nextInt();
        System.out.println("Enter the upper limit:");
        int upper=sc.nextInt();
        System.out.println("Armstrong numbers are:");
        for(int i=lower;i<=upper;i++){
            if(isArmstrong(i)){
                System.out.print(" "+i+" ");
            }
        }

    }
}
