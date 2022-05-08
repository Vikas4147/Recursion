package Kunal_Recursion.Array_Recursion;
import java.util.ArrayList;


public class LinearSaearchUsingRecursion {
    public static void main(String[] args) {
        int []arr={3,2,1,18,1,9,1};
//        System.out.println(search(arr,10,0));
        findAll(arr,0,1);
        System.out.println(list);
    }
    static boolean search(int[]arr,int target,int index){
        if(index>arr.length-1){      // Base condition
            return false;
        }
        return arr[index]==target || search(arr,target,index+1);   // Recurrence Relation
    }

    // When our target element is repeated multiple times and we want to return the index of target elements
    // We can define an array list and add all the indexes in taht list

    static ArrayList<Integer> list =new ArrayList<>();
     static void findAll(int[]arr,int index,int target){
         if(index== arr.length){    // Base Condition
             return;
         }
         if(arr[index]==target){
             list.add(index);
         }
         findAll(arr,index+1,target);   // Return type is void hence we will directly call the function

     }
}
