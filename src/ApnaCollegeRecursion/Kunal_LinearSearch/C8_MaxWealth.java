package ApnaCollegeRecursion.Kunal_LinearSearch;

public class C8_MaxWealth {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{3,1}};
        int ans = maxWealth(arr);
        System.out.println(ans);

    }
    static int maxWealth(int [][]arr){
        // person - row   , // account -  column
        int ans = Integer.MIN_VALUE;
        for(int person =0;person<arr.length;person++){
            int sum =0;
            for(int account=0;account<arr[person].length;account++){
                sum+=arr[person][account];
            }
            if(sum>ans){
                ans=sum;
            }
        }
         return ans ;
    }
}
