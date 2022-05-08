package CustomClass;
  // Creating a Custom Class
class Employee {
    int id;
    String name;
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name );
    }
}
public class CustomClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class ");
        Employee Vikas = new Employee();  // Instatntiating a new Employee object
         // Setting the attributes
        Vikas.id =12;
        Vikas.name ="CodeWithVikas";
        // Printing the attributes
        Vikas.printDetails();


    }
}
