package Perpinsta_100Codes.WorkingWithNumbers;
import java.util.Scanner;

public class C15_Replace0with1 {
    public static void main(String[] args) {
        System.out.println("Enter your input:");
        Scanner sc= new Scanner(System.in);
        String integer= sc.nextLine();
        String replace= integer.replace('0','1');
        System.out.println("After replacement in "+integer+" result is "+replace);
    }
}
