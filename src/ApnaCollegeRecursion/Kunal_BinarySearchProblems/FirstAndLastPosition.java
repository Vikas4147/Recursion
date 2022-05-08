package ApnaCollegeRecursion.Kunal_BinarySearchProblems;
import java.util.Arrays ;
// In this problem the array is sorted and for a particular target we need to check its first and last occurence
public class FirstAndLastPosition {
    public static void main(String[] args) {
        int []arr ={5,7,7,8,8,10};
        int[] ans ={-1,-1};
        ans[0]=search(arr,7,true);
        ans[1]=search(arr,7,false);
        System.out.println(Arrays.toString(ans));


    } // This will return the starting  index of target element
    // Also ending index can be obtained by passing false boolean value
    static int search(int[]nums,int target,boolean firstStartIndex){
        int ans =-1;
        int start =0 ;int end = nums.length-1;
        while(start<=end){
            int mid =start+(end-start)/2;

            if(target >nums[mid]){
                start=mid+1;
            }else if(target<nums[mid]){
                end =mid-1;
            }else{
                // potential answer
                ans = mid ;         // Same logic of binary search is applied when we find our target element it may be our potential answer
                if(firstStartIndex){   // now what we are doing is dividing our arrays into two parts to check whether target element is present in left side or right side
                    end=mid-1;         // in both left and right side we are applying binary search
                }else{                 // for left side end =mid-1 and for right start= mid +1
                   start=mid +1;
                }
            }

        }
        return ans ;
    }
}
