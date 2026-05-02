package Polymorphism;

//Polymorphism is the ability of a method or object to take many forms and perform different actions

class Animal{
    void sound(){
        System.out.println("Animal makes sound!!");

    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Barks!! ");
    }

}


class Cat extends Animal{
    void sound(){
        System.out.println("Meow! Meow!");
    }
}

public class HowToPolymor {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();   // Polymorphism
        a.sound();

        a = new Cat();
        a.sound();








    }
}
