package Abstraction.PracticeQuestions;

abstract class Telephone{

   abstract void ring();
    abstract void disconnect();
  abstract void liftin();

}
class SmartTelephone extends Telephone{
    @Override
    void ring(){
        System.out.println("Ringing");
    }
    @Override
    void disconnect(){
        System.out.println("Call disconnected");
    }
    @Override
    void liftin(){
        System.out.println("Call picked!");
    }

}

public class Q4 {
    static void main(String[] args) {

    }
}
