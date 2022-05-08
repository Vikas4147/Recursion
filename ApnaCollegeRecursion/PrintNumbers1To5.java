package ApnaCollegeRecursion;

public class PrintNumbers1To5 {
    static void printNumbers(int n){
        if(n==6){
            return;
        }
        System.out.print(n+" ");
        printNumbers(n+1);
    }

    public static void main(String[] args) {
        printNumbers(1);

    }
}
