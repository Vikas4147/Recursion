package Perpinsta_100Codes.WorkingWithNumbers;
import java.util.Scanner ;

public class C21_NoOfDaysInGivenMonthOfYear {
    static boolean leapYear(int x){
        if(x%400 ==0 || x%4==0 && x%100 !=0){
            return true ;
        }
       return false ;
    }
    public static void main(String[] args) {
        System.out.println("Enter the month :");
        Scanner sc=new Scanner(System.in);
        String month = sc.nextLine();
        System.out.println("Enter the year :");
        int year = sc.nextInt();
        boolean a =leapYear(year);
       // System.out.println(a);
        month=month.toUpperCase();
       // System.out.println(month);
        if (month.equals("FEBRUARY") && a){
            System.out.println("Entered month "+month+" contains 29 days ");
        }else if(month.equals("JANUARY")|| month.equals("MARCH")|| month.equals("MAY")||month.equals("JULY")||month.equals("AUGUST")||month.equals("OCTOBER")||month.equals("DECEMBER")){
            System.out.println("Entered month "+month+" contains 31 days ");
        }
        else if(month.equals("APRIL")||month.equals("JUNE")||month.equals("SEPTEMBER")||month.equals("NOVEMBER")){
            System.out.println("Entered month "+month+" contains 30days ");
        }else{
            System.out.println("Entered month contains 28 days ");
        }


    }
}
