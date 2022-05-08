package Perpinsta_100Codes.WorkingWithNumbers;
import java.util.Scanner ;

public class C10_OctalToBinary {
    static int  calcBinary(int x ){
        double  result =0; int remainder ; int count =0;
        while(x!=0){
            remainder= x%2;
            result+= Math.pow(10,count)*remainder;
            x=x/2;
            count++;
        }
        return (int ) result;


    }
    public static void main(String[] args) {
        System.out.println("Enter an octal number :");
        Scanner sc=new Scanner(System.in);
        int oct= sc.nextInt(); double binary =0; int count =0; int n=oct;
        while (oct!=0){
            binary+= calcBinary(oct%10)*Math.pow(1000,count);
            count ++;
            oct=oct/10;
        }
        System.out.println("Binary conversion of "+n+" is: "+binary);
    }
}
