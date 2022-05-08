package Perpinsta_100Codes.WorkingWithNumbers;
import java.util.Scanner ;

public class C8_DecimalToHexadecimal {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc=new Scanner(System.in);
        int deci = sc.nextInt(); int n= deci;
        char[] hexa = new char[100]; int i=0; int rmndr;
        while(deci!=0){
            rmndr = deci%16 ;
            if(rmndr<10){
                 hexa[i]= (char) (rmndr+48) ;
                i++;
            }
            else{
                hexa[i]=(char)(rmndr+55);
                i++;
            }
         deci=deci/16;
        }
        System.out.print("Hexadecimal conversion of "+n+" is ");
        for(int j=i-1;j>=0;j--){
            System.out.print(hexa[j]);
        }
    }
}
