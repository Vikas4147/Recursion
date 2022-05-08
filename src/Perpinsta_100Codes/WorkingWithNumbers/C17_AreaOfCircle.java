package Perpinsta_100Codes.WorkingWithNumbers;
import java.util.Scanner ;

public class C17_AreaOfCircle {
    public static void main(String[] args) {
        System.out.println(" Enter the radius of a circle :");
        Scanner sc= new Scanner(System.in);
        float r = sc.nextFloat();
        double  Area = 3.14*r*r;
        System.out.println("Area of circle is :" +Area);

    }
}
