package Abstraction.PracticeQuestions;

// interface
interface Bicycle{
    void ApplyBrakes();    /// functions
    void ApplyAccelerator();
}

class KJCycles implements Bicycle{

    void playHorn(){
        System.out.println("Ting! Ting!");
    }
    public void ApplyBrakes(){
        System.out.println("Bicycles ");
    }

    public void ApplyAccelerator(){
        System.out.println("Speeding up");

    }
}


public class Q9 {
   public static void main(String[] args) {
       KJCycles k1 = new KJCycles(); // Objects
       k1.ApplyAccelerator(); // interface options
       k1.ApplyBrakes();


    }
}
