package PractiseSet7;
import java.util.Scanner;

public class MultiplicationUsingFunction {
    static void  table(int x){
        int table ;
        for(int i=1;i<=10;i++){
            table =x*i;
            System.out.print(" "+table );
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int a = sc.nextInt();
        table (a);


    }
}
