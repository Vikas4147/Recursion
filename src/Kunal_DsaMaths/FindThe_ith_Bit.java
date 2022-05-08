package Kunal_DsaMaths;

public class FindThe_ith_Bit {
    public static void main(String[] args) {
        int n=7;
        System.out.println(bit(n,2));

    }
    static int bit(int n ,int bit_place){
       return (n&(1<<(bit_place-1)));
    }
}
