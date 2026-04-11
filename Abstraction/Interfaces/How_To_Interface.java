package Abstraction.Interfaces;

interface Animal{
    void Sound();
}
class Dog implements Animal{
   public void Sound(){
        System.out.println("Barkk");
    }

}
public class How_To_Interface {
    public static void main(String[]args) {
        // What is an interface?
        //:It is a blueprint that contains the name of methods having (empty body).
        Dog d1 = new Dog();
        d1.Sound();



    }
}
