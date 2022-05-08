package AcessModifier;
// Private Acess Modifier is used for Data Hiding and it cannot be accessed directly by giving input from main function
// Note in order to Acess private attributes we need to make method
// Getter and setters are used where setter doesn not return anything but getter returns

class MyEmployee{
    private int id ;
    private String name ;

    public String  getName(){
        return name ;
    }
    public void setName(String n){
        name=n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id=i;
    }
}

public class PrivateAcessModifier {
    public static void main(String[] args) {
        MyEmployee vikas = new MyEmployee();
      //  vikas.id=12;               // Throws an error as acess modifier used in class MYEmployee is private
      //  vikas.name="CodeWithVikas"  // And we cannot acess it using dot operator
        vikas.setName("CodeWithVikas");
        System.out.println("MyEmployee name is :"+vikas.getName());
        vikas.setId(12);
        System.out.println("MyEmployee id is :"+vikas.getId());

    }
}
