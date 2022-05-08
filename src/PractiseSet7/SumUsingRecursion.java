package PractiseSet7;

public class SumUsingRecursion {
    static int SumRecursion(int x){
        if(x==1){
            return 1;
        }
        return x + SumRecursion(x-1);
    }

    public static void main(String[] args) {

      int c=  SumRecursion(5);
        System.out.print("The value of sum is "+c);

    }
}
