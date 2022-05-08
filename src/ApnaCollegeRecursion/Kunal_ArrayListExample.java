package ApnaCollegeRecursion;
import java.util.ArrayList;
import java.util.Scanner;

public class Kunal_ArrayListExample {
    public static void main(String[] args) {
        // Array list is used when we don't know about the size of multidimensional array
        // syntax
        ArrayList<Integer> list= new ArrayList<Integer>(10); // List is initialized to a value of 10 but we can pass more than 10 entries
        Scanner sc = new Scanner(System.in);
        // Adding elements in the list
//        list.add(2);
//        list.add(100);
//        list.add(53);
//        list.add(65);
//        list.add(85);
//        list.add(6);
//        list.add(37);
//        list.add(54);
//        list.add(66);
//        list.add(98);
//        list.add(45);
//        list.add(24);
//        list.add(67);
//        list.add(96);
//        list.add(47);
//        list.add(35);
//        System.out.println(list);
//        // Replacing element in the list
//        list.set(2,50);  // Here 2 represents the index of list and 50 represents the value at that index to be filled
//        System.out.println(list);
//        list.remove(0);
//        System.out.println(list);

        // Input in list using loops
      for(int i=0;i<5;i++){
          list.add(sc.nextInt());
      }
       // get item at any index
//        for(int i=0;i<5;i++){
//            System.out.println(list.get(i));   // Pass index here -- Note list [index] syntax will not work here
//
//        }
        System.out.println(list);
    }
}
