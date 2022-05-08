package Perpinsta_100Codes;
import java.util.Scanner ;

public class C10_OctalToBinary {
    static int binConversion(int x ){
        int rem ; double  result=0 ;int i=0;
        while(x!=0){
            rem = x%2  ;
            result =result+rem*Math.pow(10,i);
            i++;
            x=x/2;

        }
        return (int) result ;
    }

    public static void main(String[] args) {
        System.out.println("Enter an octal number :");
        Scanner sc= new Scanner(System.in);
        int oct = sc.nextInt(); int count=0; double binary =0; int n=oct; double  sum =0;
        while(oct !=0){
            oct =oct%10;
            binary= Math.pow(1000,count)*binConversion(oct);
            sum = sum+binary ;
            oct=oct/10;
            count ++;
        }
        System.out.println("Binary Conversion of Octal "+n+" is "+sum);
    }
}
