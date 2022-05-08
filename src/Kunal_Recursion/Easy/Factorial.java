package Kunal_Recursion.Easy;

public class Factorial {
    public static void main(String[] args) {
        int n=5 ;
        System.out.println(fact(n));
    }
    static int fact(int n){

        if(n==1){      // Base condition
            return 1 ;
        }
       return n*fact(n-1);      // Recurrence relation of factorial

    }
}
