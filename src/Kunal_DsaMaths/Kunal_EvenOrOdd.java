package Kunal_DsaMaths;
// In bitwise operator if we and any number with 1 we get our answer as number back
// If last digit of binary is 1 -Number is odd else number is even
public class Kunal_EvenOrOdd {
    public static void main(String[] args) {
        int n= 65 ;
        System.out.println(isOdd(n));

    }
    static boolean isOdd(int n){
        if((n&1)==1){
            return true ;
        }
        return false ;
    }


}
