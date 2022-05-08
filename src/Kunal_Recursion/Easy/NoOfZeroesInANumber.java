package Kunal_Recursion.Easy;

public class NoOfZeroesInANumber {
    public static void main(String[] args) {
        int n=10304;
        System.out.println(zeroes(n,0));
    }

    static int zeroes(int n,int count){
       int  rem=n%10;
       if(n==0){   // Base condition
           return count ;
       }
       // Here we wrote different recurrence relation depending upon no of possible cases
        if(n!=0 && rem==0){
           return zeroes(n/10,count+1);
        }
        else {
           return zeroes(n/10,count);
        }
    }
}
