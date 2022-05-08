package Perpinsta_100Codes.WorkingWithNumbers;
import java.util.Scanner ;

public class C23_RootsOfQuadraticEquation {
    public static void main(String[] args) {
        System.out.println("Enter the coefficient of x^2 :");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the coefficient of x:");
        int b = sc.nextInt();
        System.out.println("Enter the constant of Quadratic Equation ");
        int c = sc.nextInt();
        double D= Math.pow(b*b-4*a*c ,0.5);
        double res1 =(-b+D)/(2*a);
        double res2 =(-b-D)/(2*a);
        if(D>=0){
            System.out.print("Roots are real which are :"+res1+" "+res2);
        }else {
            System.out.print("Roots are imaginary ");
        }

    }}

