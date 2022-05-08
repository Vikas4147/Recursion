package Perpinsta_100Codes.WorkingWithNumbers;
import java.util.Scanner;
public class MaximumHandshakes {    // In this we can directly use the formula n*(n-1)/2
    static int calcFact(int x ){
        int fact =1;
        for(int i=x;i>=1;i--){
            fact=fact*i;
        }
       return fact ;
    }
    public static void main(String[] args) {
        System.out.println("Enter no of persons :");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int Nr= calcFact(n);
        int Dr= calcFact((n-2));
        int handshakes = Nr/(2*Dr);
        System.out.println("Maximum no of handshakes are :"+handshakes);

    }
}
