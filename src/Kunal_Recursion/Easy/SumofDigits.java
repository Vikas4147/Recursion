package Kunal_Recursion.Easy;

public class SumofDigits {
    public static void main(String[] args) {
        int n=12345 ;
        System.out.println(sumOfDigits(n));
    }
    static int sumOfDigits(int n){
        if(n==0){            // Base Condition
           return 0;
        }
        return (n%10)+sumOfDigits(n/10);   // Recurrence Relation
    }
}
