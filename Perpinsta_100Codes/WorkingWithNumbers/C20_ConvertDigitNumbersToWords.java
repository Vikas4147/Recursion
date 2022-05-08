package Perpinsta_100Codes.WorkingWithNumbers;
import java.util.Scanner;

public class C20_ConvertDigitNumbersToWords {
    static int  thousandDigit(int x ){
        x=x/1000;
        String [] thousand ={"zero","one","two","three","four","five","six","seven","eight","nine"};
        if(x!=0){
            System.out.print(thousand[x] +" thousand ");
            return x;
        }
        return 0;
    }
    static int hundredDigit(int x ){
        x=x/100 ;
        String [] hundred   ={"zero","one","two","three","four","five","six","seven","eight","nine"};
        if(x!=0){
            System.out.print(hundred[x] +" hundred");
            return x;
        }
       return 0;
    }
    static int tensDigit(int x){
      if(x/10==1){
          x=x%10 ;
          String [] unit={"ten","eleven","tewlve","thirteen","fourteen ","fifteen","sixteen","seventeen","eighteen","ninteen"};
          System.out.print("and "+unit[x]+" ");
      } else {
          x=x/10;
          String [] tens={"zero","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
          System.out.print(" and "+tens[x]+" ");
      }
      return 0;
    }
    static  int  unitDigit(int x ){
      String [] unit={"zero","one","two","three","four","five","six","seven","eight","nine"};
        System.out.print(unit[x]+" ");
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int thousand = thousandDigit(n);
       n = n- thousand*1000;
      //  System.out.println(thousand+" "+n);
        int hundred =hundredDigit(n);
        n=n-hundred*100;
     //   System.out.println(hundred+" "+n);
        int ten =tensDigit(n);
    //    System.out.println(ten+" "+n);
        if(n%10 !=0){
        unitDigit(n%10);
        }
}}
