package Kunal_DsaMaths;
// Important points -- 1) All operatiors follow associative property
// 2) a^0= a and a^a=0 .Hence we can say that if we xor all elements of an array we are going to get only that element which is unique

public class UniqueElementInArray {
    public static void main(String[] args) {
        int []arr={2,3,3,4,2,6,4};
        System.out.println(ans(arr));
    }
    static int ans(int[]arr){
        int unique =0 ;
        for(int n:arr){
            unique^=n ;
        }
        return unique ;
    }
}
