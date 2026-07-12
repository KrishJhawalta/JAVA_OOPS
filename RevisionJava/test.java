// Single Inheritance

class Test {
    void sayHello() {
        System.out.println("Greetings, Hello!");
    }
}

class Over extends Test {
    void message() {
        System.out.println("Hello User! I am class Over");
    }
}

// Hierarchical Inheritance

class Vehicle {
    void type() {
        System.out.println("Vehicle Types");
    }
}

class Car extends Vehicle {
    void car() {
        System.out.println("Four Wheeler Car");
    }
}

class Bike extends Vehicle {
    void bike() {
        System.out.println("2 Wheeler");
    }
}

// Multilevel Inheritance

class Smartphone {
    void phone() {
        System.out.println("I am Phone");
    }
}

class Camera extends Smartphone {
    void camera() {
        System.out.println("Camera");
    }
}

class CameraInterface extends Camera {
    void interfaceMethod() {
        System.out.println("Camera Interface");
    }
}

// Main Class

public class Main {
    public static void main(String[] args) {

        // Single Inheritance
        Over o1 = new Over();
        o1.sayHello();
        o1.message();

        System.out.println();

        // Hierarchical Inheritance
        Car c1 = new Car();
        c1.type();
        c1.car();

        System.out.println();

        Bike b1 = new Bike();
        b1.type();
        b1.bike();

        System.out.println();

        // Multilevel Inheritance
        CameraInterface s1 = new CameraInterface();
        s1.phone();
        s1.camera();
        s1.interfaceMethod();
    }
}
