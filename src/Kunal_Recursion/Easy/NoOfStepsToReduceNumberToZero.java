package Kunal_Recursion.Easy;
 // Question Statement -- If Number is even then divide it by 2 and if it is odd subtract -1 from it
// Return the no of steps required

public class NoOfStepsToReduceNumberToZero {
    public static void main(String[] args) {
        int n=14 ;
        System.out.println(steps(n,0));
    }
    static int steps(int n,int count){
        if(n==0){           // Base condition
            return count ;
        }
        // Different possible cases
        if(n%2==0){
            return steps(n/2,count+1);
        }
        else{
            return steps(n-1,count+1);
        }
    }
}
