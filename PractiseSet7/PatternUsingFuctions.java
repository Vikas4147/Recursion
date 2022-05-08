package PractiseSet7;

public class PatternUsingFuctions {
    static void pattern(int x){
        for(int i=1;i<=x;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(4);


    }
}
