package Abstraction.PracticeQuestions;

// interface
interface Bicycle{
    void ApplyBrakes();    /// functions
    void ApplyAccelerator();
}

class KJCycles implements Bicycle{
    public void ApplyBrakes(){
        System.out.println("Bicycles ");
    }

    public void ApplyAccelerator(){
        System.out.println("Speeding up");

    }
}


public class Q9 {
   public static void main(String[] args) {
       KJCycles k1 = new KJCycles();
       k1.ApplyAccelerator();
       k1.ApplyBrakes();


    }
}
