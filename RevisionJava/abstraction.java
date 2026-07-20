abstract class Animal{     //abstract class
    abstract void sound();

    void eat(){
        System.out.println("Animal is eating");
    }}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat meows");
    }
}

public class abstraction{
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
// obejcts
        a1.sound();
        a1.eat();
        a2.sound();
        a2.eat();
        
       // output will be
       // Dog barks
         // Animal is eating
         // Cat meows
      
       
    }
}