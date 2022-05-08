package Kunal_Recursion.Easy;

public class SumOfN_Numbers {
    public static void main(String[] args) {
        int n =100 ;
        System.out.println(sum(n));
    }
    static int sum(int n){
        if(n==1){         // Base Condition
            return 1;
        }
        return n+sum(n-1);     // Recurrence relation
    }
}
