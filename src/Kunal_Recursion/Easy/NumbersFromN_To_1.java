package Kunal_Recursion.Easy;

public class NumbersFromN_To_1 {
    public static void main(String[] args) {
//        fun(5);
        funBoth(5);
    }
    static void fun(int n){
        if(n==0){        // Base condition
            return ;
        }
        // In this we are printing first and then calling the function for recursion ,but if we want to print the number
        // From 1 to 5 using the same method we will call the function first and then print
        System.out.println(n);
        fun(n-1);    // Function Call for recursion
    }

    // This will print first from 5-1 and then 1-5
    static void funBoth(int n){
        if(n==0){        // Base condition
            return ;
        }// Printing numbers from 1 to 5  using the same method
        System.out.println(n);
        funBoth(n-1);    // Function Call for recursion
        System.out.println(n);
    }

}
