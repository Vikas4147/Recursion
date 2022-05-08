package Perpinsta_100Codes;
import java.util.Scanner ;

public class C23_HarshadNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int remainder ; int n1=n ; int sum=0;
        while(n!=0){
            remainder=n%10;
            sum=sum+remainder;
            n=n/10;
        }
        if(n1%sum==0){
            System.out.println("Entered number "+n1+" is a Harshad number:");
        }
        else{
            System.out.println("Entered number "+n1+" is not  a Harshad number:");
        }

    }
}
