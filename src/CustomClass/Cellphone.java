package CustomClass;

class Cellphone1{
    public void ring(){
        System.out.println("Ringing....");
    }
    public void vibrate(){
        System.out.println("Vibrating .....");
    }

}
public class Cellphone {
    public static void main(String[] args) {
        Cellphone1 asus= new Cellphone1();
        asus.ring();
        asus.vibrate() ;


    }
}
