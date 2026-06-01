package ConstructorBasic;

class machine{
    machine(){    //constructor: for giving initial/default value
        System.out.println("I am Machine");
    }
    void Car(){
        System.out.println("Honda ");
    }
    void Bike(){
        System.out.println("Yahama");
    }

}
public class WhatIsConstructor {
    public static void main(String[] args) {
        machine m = new machine();
        m.Bike();
        m.Car();

    }
}
