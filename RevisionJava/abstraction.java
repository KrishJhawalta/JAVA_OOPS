abstract class Animal{
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
        Animal a = new Dog();
        Animal a2 = new Cat();
        a.sound();
        a.eat();
        a2.sound();
        a2.eat();
        
       
      
       
    }
}