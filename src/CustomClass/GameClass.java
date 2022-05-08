package CustomClass;

class Game{
    public void hit(){
        System.out.println("Hitting.....");
    }
    public void run(){
        System.out.println("Running....");
    }
    public void fire(){
        System.out.println("Firing......");
    }
}
public class GameClass {
    public static void main(String[] args) {
        Game TommyVecetti = new Game();
        TommyVecetti.hit();
                TommyVecetti.run();
        TommyVecetti.fire();

    }
}
