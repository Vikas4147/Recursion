package ApnaCollegeRecursion.Kunal_BinarySearchProblems;
 // Floor Value = Greatest value samller than the target in the array
// Control will be out of loop if start >end and hence order of arrangement will be end ,target(if present),start
// Hence we can say that our floor value will be end
public class C2_FloorProblem {
    public static void main(String[] args) {
        int []arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 1;
        int ans =floor(arr,target);
        System.out.println(ans);

    }
    static int floor(int[]arr ,int target){
        int start =0 ; int end = arr.length-1 ;
        while(start<=end){
            int mid = start +(end-start)/2 ;
            if(target>arr[mid]){
                start =mid+1;
            }else if(target <arr[mid]){
                end =mid-1;
            }
            else{
                return mid ;
            }
        }if(end<arr[0]){
            return -1;
        }
        return end ; // If array is sorted in descending order to calculate the floor value return start
    }

}
