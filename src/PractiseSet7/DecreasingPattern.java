package PractiseSet7;

public class DecreasingPattern {
    static void pattern2(int x ){
        for(int i=x;i>=1;i--){
            for(int j=0 ;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern2(4);

    }
}
