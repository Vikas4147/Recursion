package Perpinsta_100Codes.WorkingWithNumbers;
import java.util.Scanner ;

public class C16_GivenNumberAsSumOfTwoPrimes {
    static boolean isPrime(int x){
        for(int i=2;i<x;i++){     // Condition to check prime numbers
            if(x%i==0){
                return false ;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Entered number "+n+" can be expressed as sum of :");
        for(int i=2;i<=n/2;i++){
            if(isPrime(i) && isPrime(n-i)){
                System.out.println(i+" and "+(n-i));
            }

        }

    }
}
