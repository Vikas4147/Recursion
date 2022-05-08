package Perpinsta_100Codes;

public class C8_PrimeNumbersInGivenRange {
    public static void main(String[] args) {
        int lower=1;
        int upper=20;
        for(int i=1;i<=upper;i++){
            if(isPrime(i)){
                System.out.print(" "+i+" ");
            }
        }
    }
    static boolean isPrime(int n ){
        if(n<2){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }

        }
        return true ;
    }

}
