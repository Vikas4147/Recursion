package Kunal_Recursion;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fibo(50));
    }
    static int fibo(int n){
        // Base Condition
        if(n<2){
            return n ;
        }
        return  fibo(n-1)+fibo(n-2);
    }
}
