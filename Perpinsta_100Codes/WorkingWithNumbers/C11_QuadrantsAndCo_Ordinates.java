package Perpinsta_100Codes.WorkingWithNumbers;
import java.util.Scanner ;

public class C11_QuadrantsAndCo_Ordinates {
    public static void main(String[] args) {
        System.out.println("Enter the 'X' co-ordinate :");
        Scanner sc= new Scanner(System.in);
        int x =sc.nextInt() ;
        System.out.println("Enter the 'Y' co-ordinate :");
        int y =sc.nextInt() ;
        if(x>0 && y>0){
            System.out.println("Entered co-ordinate (x,y) ( "+x+","+y+") lies in first Quadrant ");
        }
        else if (x<0 && y>0){
            System.out.println("Entered co-ordinate (x,y) ( "+x+","+y+") lies in second  Quadrant ");
        }
        else if (x<0 && y<0){
            System.out.println("Entered co-ordinate (x,y) ( "+x+","+y+") lies in third  Quadrant ");
        }
        else if (x>0 && y<0){
            System.out.println("Entered co-ordinate (x,y) ( "+x+","+y+") lies in fourth   Quadrant ");
        }
        else if(x==0 && y!=0){
            System.out.println("Entered co-ordinate (x,y) ( "+x+","+y+") lies on Y-axis ");
        }
        else if (x!=0 & y==0){
            System.out.println("Entered co-ordinate (x,y) ( "+x+","+y+") lies on X-axis ");
        }
        else if (x==0 && y==0){
            System.out.println("Entered co-ordinate (x,y) ( "+x+","+y+") lies at origin  ");
        }

    }
}
