package ApnaCollegeRecursion;

public class SumOfnNaturalNumbers {
    static void sumOfNaturalNumbers(int n,int sum){
        if(n==0){
            System.out.println(sum);
            return ;
        }
        sum+=n;
        sumOfNaturalNumbers(n-1,sum);

    }
    public static void main(String[] args) {
        sumOfNaturalNumbers(5,0);
    }
}
