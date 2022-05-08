package Perpinsta_100Codes.WorkingWithNumbers;
import java.util.Scanner ;

public class C22_NoOfTimesADigitOccurs {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        String number =sc.nextLine();
        System.out.println("Enter the digit which is to be found :");
        int found = sc.nextInt(); int count =0;
        for(int i=0;i<number.length();i++){
            if(found+48==number.charAt(i)){
                count++;
            }
        }
        System.out.println("Digit "+found+" in number "+number+" occurs "+count+" times ");



    }
}
