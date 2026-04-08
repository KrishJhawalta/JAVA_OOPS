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

class Human{
    void jump(){
        System.out.println("Human Jumps");
    }
    void bite(){
        System.out.println("Human bites");
    }
}
public class Q5 {
    public static void main(String[] args) {
        Monkey o1 = new Monkey();
        Human h1= new Human();
        o1.jump();
        o1.bite();




    }
}
