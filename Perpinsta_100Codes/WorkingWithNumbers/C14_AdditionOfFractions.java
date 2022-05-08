package Perpinsta_100Codes.WorkingWithNumbers;
import java.util.Scanner ;

public class C14_AdditionOfFractions {
    static int calcHCF(int x ,int y){
        int hcf=1;
        for (int i=1;i<=x|| i<=y;i++){
            if(x%i==0 && y%i==0){
                hcf=i;
            }
        }
        return hcf ;
    }
    public static void main(String[] args) {
        System.out.println("Enter the Nr of first fraction:");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the Dr of first fraction:");
        int b= sc.nextInt();
        System.out.println("Enter the Nr of second  fraction:");
        int c = sc.nextInt();
        System.out.println("Enter the Dr of second  fraction:");
        int d = sc.nextInt();
        int Nr = a*d+b*c ;
        int Dr= b*d;
        int hcf= calcHCF(Nr,Dr);
        System.out.println("Addition of two fraction is "+(Nr/hcf)+"/"+(Dr/hcf));

    }
}
