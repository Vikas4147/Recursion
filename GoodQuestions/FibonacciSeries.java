package GoodQuestions;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in Fibonacci Series ");
        int n= sc.nextInt();
        System.out.println("ELemnts of Fibonacci Series are ");
        int a =0;
        int b =1;
        int c ;
        System.out.print(" "+a);
        System.out.print(" "+b);
        for(int i=1 ;i<=n-2 ;i++){
            c=(a+b);
           System.out.print(" "+c);
            a=b;
            b=c;
        }


    }
}
