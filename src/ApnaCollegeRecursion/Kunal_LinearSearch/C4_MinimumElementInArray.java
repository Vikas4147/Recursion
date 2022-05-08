package ApnaCollegeRecursion.Kunal_LinearSearch;

public class C4_MinimumElementInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,-4,9};
        System.out.println(min(arr));
    }
    static int min(int []arr){
        // check for array length
        if(arr.length==0){
            return -1;
        }
        int ans = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans ;
    }
}
