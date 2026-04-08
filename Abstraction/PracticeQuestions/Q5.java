package Abstraction.PracticeQuestions;
// Polymorphism using monkey class of question 3
class Monkey{
    void jump(){
        System.out.println("Monkey jumps");
    }
    void bite(){
        System.out.println("Monkey bites");
    }
}

class Human extends Monkey{
    @Override
    void jump(){
        System.out.println("Human Jumps");
    }
    @Override
    void bite(){
        System.out.println("Human bites");
    }
}
public class Q5 {
    public static void main(String[] args) {
        Monkey o1 = new Human();
        o1.bite();
        o1.jump();



    }
}
