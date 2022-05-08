package Kunal_Recursion.Easy;
// Just solve the reverse using recursion and check for palindrome

public class PalindromeUsingReverse {
    public static void main(String[] args) {
        int n = 12345 ;
        double count =Math.log10(n);
        int rev=rev(n,(int)count);
        if(rev==n){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
    static int rev(int n,int count){
        if(count==0){    // Base Condition
            return n;
        }
        return (n%10)*(int)Math.pow(10,count)+rev(n/10,count-1); // Recurrence relation

    }
}
