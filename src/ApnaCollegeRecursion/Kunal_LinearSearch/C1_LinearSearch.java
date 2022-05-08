package ApnaCollegeRecursion.Kunal_LinearSearch;

public class C1_LinearSearch {
    public static void main(String[] args) {
        int [] arr = {23,45,1,2,8,19,-3,16,-11,28};
        System.out.println(linearSearch(arr,0));

    }
    static int linearSearch(int[]arr ,int target){
        // Check if length of array is greter than zero or not
        if(arr.length ==0){
            return -1;
        }
         // In enhanced for loop it compares with actual element while in normal for loop it compares with index of element
        for(int index :arr){
            if (target == index){
                return index ;
            }
        }
        return -1;  // this will execute if no target elememt is found
    }

}
