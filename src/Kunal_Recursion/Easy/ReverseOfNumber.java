package Kunal_Recursion.Easy;

public class ReverseOfNumber {
    public static void main(String[] args) {
        int n = 12345 ;
        // This will give answer of (no of digits-1)
        double count =Math.log10(n);
//        System.out.println(count);
//        System.out.println(rev(n,(int)count));
        System.out.println(rev1(n));
    }
     // Method 1 - Note sometimes to get our answer we need to use additional variables and for that
      // we can create helper funtion -- Here I can create a function of count which will help me to solve
    static int rev(int n,int count){
        if(count==0){    // Base Condition
            return n;
        }
       return (n%10)*(int)Math.pow(10,count)+rev(n/10,count-1); // Recurrence relation

    }


    static int sum =0;
     // Method 2
    static int rev1(int n){
        if(n==0){
            return 0;
        }
        int rem=n%10;
        sum=sum*10+rem;
        rev1(n/10);
        return sum;

    }
}
