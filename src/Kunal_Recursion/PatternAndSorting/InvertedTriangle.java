package Kunal_Recursion.PatternAndSorting;
  // Required Pattern To Print
//         *  *  *  *
//         *  *  *
//         *  *
//         *

public class InvertedTriangle {
    public static void main(String[] args) {
        int row =4 ;int col = 0;
        pattern(4,0);
    }
    static void pattern(int row,int col){
        if(row==0){     // Base Condition
            return ;
        }
        // This will print  required no of starts in the row
        if(col<row){
            // Note -If we are going to write the print statement after function call it will give normal triangle
            System.out.print(" * ");
            pattern(row,col+1);

        }
        // This will give new line and comdition for no of stars in next row
        else{
            System.out.println();
            pattern(row-1,0);
        }
    }

}
