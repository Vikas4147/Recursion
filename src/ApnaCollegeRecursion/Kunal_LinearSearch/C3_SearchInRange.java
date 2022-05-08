package ApnaCollegeRecursion.Kunal_LinearSearch;

public class C3_SearchInRange {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(linearSearch(arr,2,9,5));

    }
    static boolean linearSearch(int []arr ,int start ,int end ,int target ){
        // Check for size of array
        if(arr.length==0){
            return false ;
        }
        for(int index =start ;index <=end ;index ++){
            if (target == arr[index]){
                return true ;
            }
        }
        return false ;
    }
}
