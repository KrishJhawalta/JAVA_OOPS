package Abstraction;

abstract class mobiles{

    mobiles(){
        System.out.println("Constructor of mobiles");
    }

    abstract void call();   // abstract methods
    abstract void message();

}

class Samsung extends mobiles{

    @Override
    void call(){
        System.out.println("Calling samsung");  // method overrriding
    }

    @Override                      
    void message(){                 // again method overrride
        System.out.println("Messaging from samsung");
    }
}


public class Abstraction{
    public static void main(String[] args) {
        Samsung s1 = new Samsung();    // object of extended new class
        s1.message();
        
        
    }

}
