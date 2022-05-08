package CustomClass;

class Square{
    public void Area(int side ){
        int area=side*side;
        System.out.println("Area is "+area);
    }
    public void Perimeter (int side){
        int perimeter=4*side;
        System.out.println("Perimeter is "+perimeter );
    }

}
public class AreaAndPerimeter {
    public static void main(String[] args) {
        Square s1=new Square();
        s1.Perimeter(5);
        s1.Area(5);

    }
}
