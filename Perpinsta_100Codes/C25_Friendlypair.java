package Perpinsta_100Codes;
import java.util.Scanner;

public class C25_Friendlypair {
    static int FactorSum(int x){
        int sum =0;
        for(int i=1;i<=x;i++){
            if(x%i==0){
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter the first number");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        System.out.println("Enter the second number");
        int n2=sc.nextInt();
        float result1 ; float result2 ;
        result1 = FactorSum(n1)/n1  ;
        result2 = FactorSum(n2)/n2 ;
        if(result1== result2){
            System.out.println("Entered number "+n1+" and "+n2+" are friendly pairs");
        }
        else{
            System.out.println("Entered number "+n1+" and "+n2+" are not friendly pairs");
        }



    }
}
