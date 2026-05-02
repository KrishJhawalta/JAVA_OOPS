package Polymorphism;

//Polymorphism is the ability of a method or object to take many forms and perform different actions

class Animal{
    void sound2(){
        System.out.println("Animal makes sound!!");

    }
}

class Dog extends Animal {
    void sound1() {
        System.out.println("Barks!! ");
    }

}


class Cat extends Dog{
    void sound(){
        System.out.println("Meow! Meow!");
    }
}

public class HowToPolymor {
    public static void main(String[] args) {
        Cat c = new Cat();    // Polymorphism
        c.sound();
        c.sound1();
        c.sound2();







    }
}
