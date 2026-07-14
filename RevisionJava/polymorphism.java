class Calculator{

    // method overloading
    static void add(int a, int b){
        System.out.println("Sum: " + (a+b));
    }

    static void add(int a, int b, int c){
        System.out.println("Sum: " + (a+b+c));
    }
}

class Animal{
    static void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    static void sound(){
        System.out.println("Dog barks");
    }
}
public class polymorphism{
    public static void main(String[]args){

        Calculator.add(55,22);
        Calculator.add(55,22,33);
        Animal.sound();
        Dog.sound();









    }
}