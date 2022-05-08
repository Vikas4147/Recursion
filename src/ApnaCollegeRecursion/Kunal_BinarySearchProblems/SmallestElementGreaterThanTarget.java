package ApnaCollegeRecursion.Kunal_BinarySearchProblems;
// Leet code problem similar to ceiling problem only difference is we need to return the smallest element greater
// than the target and not gretater than equal to
// also if no element is geater than the target return the smallest element in the array

public class SmallestElementGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr ={'c','f','j'};
        System.out.println(smallestElement(arr,'f'));

    }
    static char smallestElement(char[]letters ,char target){
        int start =0; int end =letters.length-1 ;
        while(start<= end){
            int mid = start+(end-start)/2 ;

            if(target> letters[mid]){
                start =mid+1 ;
            }
            else{
                end=mid-1 ;
            }
        }
// When the target element is greter than the target our start will reach the end of the cursor and hence we need to return the smallest element
        // Which can be obtained from the modulus operator because n%n ==0
        return letters[start % letters.length];
    }
}
