package ApnaCollegeRecursion.Kunal_LinearSearch;
import java.util.Arrays ;
public class C2_SearchInStrings {
    public static void main(String[] args) {
        String name = "Vikas";
        char element = 'a';
        System.out.println(Arrays.toString(name.toCharArray()));  // Converting string to array
        System.out.println(search(name ,element));
    }
    static boolean search( String str , char target){
        // check for empty string length
        if(str.length()==0){
            return false ;
        }
//        for(int i=0; i<str.length();i++){
//            if(target == str.charAt(i)){
//                return true ;
//            }
//        }

         // Rather than using normal for loop we can use enhanced for loop by converting string to arrays
           for(char ch: str.toCharArray()){
               if(ch== target){
                   return true ;
               }
           }
        return false ; //This line will execute if above code doesn't gives result
    }
}
