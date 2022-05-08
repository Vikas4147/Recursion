package Kunal_Recursion.Array_Recursion;
import java.util.ArrayList;

public class LinearSearch_ReturnArrayList {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 18, 1, 9, 1};
//        System.out.println(findAll(arr, 0, 1, new ArrayList<>()));
        System.out.println(findAll2(arr,0,1));
    }

    static ArrayList<Integer> findAll(int[] arr, int index, int target, ArrayList<Integer> list) {
        if (index == arr.length) {    // Base Condition
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAll(arr, index + 1, target, list);   // Return type is void hence we will directly call the function
    }

    // Note - In this we are passing array list as an arguement and hece by the knowledge of Arrays we know that
    // different reference variables will be created pointing to the same object
    // Means changes in any one of the reference variable will lead to changes in all the reference variables
    // Case 2 -- If we are not passing array list in the arguement but we are passing it into the function body
    // At every new function call new object will be created and hence changes made in one object will not be reflected
    // in other objects

    // Problem Statement - Return the array list without passing it as arguement
    static ArrayList<Integer> findAll2(int[] arr, int index, int target) {
        ArrayList<Integer>list=new ArrayList<>();  // Passing Array List in the function body
        if (index == arr.length) {    // Base Condition
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        // Return type is void hence we will directly call the function

        ArrayList<Integer>ansFromBelowCalls= findAll2(arr, index + 1, target);  // Answer from each call is stored here
        // As changes wont me made in all reference variable  because list is not passed in the arguement
        list.addAll(ansFromBelowCalls);  // All the list element will be added and a new list will be created
        return list ;
    }
}

