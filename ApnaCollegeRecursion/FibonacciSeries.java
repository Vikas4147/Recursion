package ApnaCollegeRecursion;

public class FibonacciSeries {
    static void fibonacci(int a ,int b ,int n){
        if(n==0){
            return ;
        }
        System.out.print(a+" ");
        fibonacci(b,a+b, n-1);

    }
    public static void main(String[] args) {
        fibonacci(0,1,6);

    }
}
