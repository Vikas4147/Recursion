package CustomClass;

class Employee1{
    int salary;
    String name ;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name ;
    }
    public void setName(String n){
        name =n;
    }

}

public class EmployeeClassWithProperties {
    public static void main(String[] args) {
        Employee1 vikas = new Employee1();
        vikas.salary=233;
        vikas.setName("CodeWithVikas");
        System.out.println(vikas.getName());
        System.out.println(vikas.getSalary());

    }

}
