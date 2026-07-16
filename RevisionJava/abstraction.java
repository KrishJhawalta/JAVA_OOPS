abstract class car{

    abstract void start();

    void horn(){
        System.out.println("Beep! Beep!");
    }
}
class Toyota extends car{
    @Override
    void start(){
        System.out.println("Toyota car started");
    }
}



public class abstraction {
    public static void main(String[] args) {
        
        Toyota c = new Toyota();
        c.start();
        c.horn();
    }
    
}
