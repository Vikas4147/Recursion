package ApnaCollegeRecursion;

public class PrintNumbers5To1 {
    static void printNumbers(int x){
        if(x==0){
            return  ;
        }
        System.out.print(x+" ");
        printNumbers(x-1);
    }
    public static void main(String[] args) {
      printNumbers(5);
    }
}
