package Perpinsta_100Codes.WorkingWithNumbers;
import java.util.Scanner;

public class C24_IntergersWhichHavexDivisors {
    static int calcFactors(int x){
        int count =0;
        for(int i=1;i<=x;i++){
            if(x%i==0){
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Enter the lower limit:");
        Scanner sc= new Scanner(System.in);
        int ll= sc.nextInt();
        System.out.println("Enter the upper limit:");
        int ul=sc.nextInt();
        System.out.println("Enter the factor count you want to find :");
        int facCount=sc.nextInt();
        System.out.println("Numbers which have "+facCount+" divisors are ");
        for(int i=ll;i<=ul;i++){
            if(facCount==calcFactors(i)){
                System.out.print(i+" ");
            }

        }

    }
}
