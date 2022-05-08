package Perpinsta_100Codes.WorkingWithNumbers;
import java.util.Scanner ;

public class C9_BinaryToOctal {
    static int calcSum(int remainder ){
        double add=0; int count =0;
        while(remainder!=0){
             int a = remainder %10;
              add=add+Math.pow(2,count)*a;
              count ++;
              remainder= remainder/10 ;
        }
      return (int) add;
    }
    public static void main(String[] args) {
        System.out.println("Enter a binary number ");
        Scanner sc= new Scanner(System.in);
        int binary = sc.nextInt(); int n=binary;
        int remainder ; int count  =0; double  octal=0;
        while (binary!=0){
            remainder = binary %1000;
            octal+= calcSum(remainder)*Math.pow(10,count);
            binary = binary /1000;
            count ++;
        }
        System.out.println("Octal conversion of binary "+n+" is "+octal);
    }
}
