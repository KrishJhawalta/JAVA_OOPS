package Abstraction.PracticeQuestions;
interface Animal{
    void play();
    void sleep();
}

interface Pet extends Animal{

}

class Dog implements Pet{
    public void play(){
        System.out.println("Dog is playing");
    }

    public void sleep(){
        System.out.println("Dog is sleeping");
    }

}

public class Q8 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.play();
        d1.sleep();

    }
}
