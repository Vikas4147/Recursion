package Perpinsta_100Codes.WorkingWithNumbers;
import java.util.Scanner;

public class C2_LCM {
    public static void main(String[] args) {
        System.out.println("Enter the first number:");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        System.out.println("Enter the second number:");
        int n2=sc.nextInt();
        int hcf=1; int lcm;
        for(int i=1;i<=n1 || i<=n2;i++){
            if(n1%i==0 & n2%i==0){
                hcf=i;
            }
        }
        lcm=(n1*n2)/hcf ;
        System.out.println("LCM of "+n1+" and "+n2+" is "+lcm);
    }
}
