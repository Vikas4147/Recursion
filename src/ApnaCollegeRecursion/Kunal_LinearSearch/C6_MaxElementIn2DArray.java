package ApnaCollegeRecursion.Kunal_LinearSearch;

public class C6_MaxElementIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 39, 44, 56},
                {18, 12}};
        int ans = max(arr);
        System.out.println(ans);
    }

    static int max(int [][] arr){
        int max =Integer.MIN_VALUE ;   // Similarly we can go for minimum value also
//        for(int row =0;row<arr.length;row++){
//            for(int col=0;col<arr[row].length;col++){
//                if(arr[row][col]>max){
//                    max =arr[row][col];
//                }
//            }
//        }
        // Rather than using nested for loop we can use nested enhanced for loop
        for(int[] element:arr){
            for(int num:element){
                if(num>max){
                    max =num;
                }
            }

        }
        return max ;
    }
}
