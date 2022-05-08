package ApnaCollegeRecursion.Kunal_LinearSearch;

public class C7_NumbersWithEvenDigit {
    public static void main(String[] args) {
        int []arr ={1,345,20,6,7896};
        int count =0;
        for(int  num:arr){
            if(noOfDigits(num)%2==0){
                count ++;
            }
        }
        System.out.println(count);
    }
    static int noOfDigits(int n){
//        int count =0;
//        while(n!=0){
//            count ++;
//            n=n/10;
//        }
//        return count ;
        if(n<0){
            n=n*-1;
        }
        return (int)(Math.log10(n))+1 ;  // Shortcut to calculate no of digits
    }
}
