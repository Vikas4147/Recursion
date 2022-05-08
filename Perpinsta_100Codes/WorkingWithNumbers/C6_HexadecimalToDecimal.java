package Perpinsta_100Codes.WorkingWithNumbers;
import java.util.Scanner;

public class C6_HexadecimalToDecimal {
    public static void main(String[] args) {
        System.out.println("Enter a hexadecimal number :");
        Scanner sc=new Scanner(System.in);
        String hexa=sc.nextLine();
        hexa=hexa.toUpperCase();
        int decimal=0 , count =0;
        for(int i=hexa.length()-1;i>=0;i--){
            if(hexa.charAt(i)>='0' && hexa.charAt(i)<='9'){
                // ASCII VALUE OF 0 IS 48
                decimal +=(hexa.charAt(i)-48)*Math.pow(16,count);
                count ++;
            }
            else if(hexa.charAt(i)>='A' && hexa.charAt(i)<='F'){
                // ASCII VALUE OF A IS 65
                decimal +=(hexa.charAt(i)-55)*Math.pow(16,count);
                count ++;
            }

        }
        System.out.println("Decimal conversion of "+hexa+" is "+decimal);
    }
}
