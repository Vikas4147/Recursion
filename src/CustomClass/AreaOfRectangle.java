package CustomClass;

class Rectangle{
    public void perimeter(int l,int b){
        int perimeter = 2*(l+b);
        System.out.println("Perimter is :"+perimeter);
    }
    public void area(int l,int b){
        int area=l*b;
        System.out.println("Area is "+area);
    }

}
public class AreaOfRectangle {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.perimeter(5,4);
        r1.area(5,4);
    }
}
