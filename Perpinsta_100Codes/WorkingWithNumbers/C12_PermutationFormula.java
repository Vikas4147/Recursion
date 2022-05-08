package Perpinsta_100Codes.WorkingWithNumbers;
import java.util.Scanner ;

public class C12_PermutationFormula {
    static int calcFact(int x) {
        int fact = 1;
        for (int i = x; i >= 1; i--) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println("Enter the value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the value of r:");
        int r = sc.nextInt();
        int Nr = calcFact(n);
        int Dr = calcFact((n - r));
        int permutation = Nr / Dr;
        if (Nr > Dr) {
            System.out.println("Permutation is "+permutation );
        } else {
            System.out.println("Please enter valid input:");
        }

    }
}
