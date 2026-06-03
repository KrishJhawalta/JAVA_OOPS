package ConstructorBasic;

class S{
    int age;      // without constructor
    String name;

    S(){
        age = 0;
        name = null;

    }

    class T {
        T(){    // constructor
            System.out.println("I am teacher");

        }
    }
}

public class students {
    public static void main(String[] args) {
        S s = new S();
        System.out.println(s.age);



    }

}
