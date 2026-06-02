package ConstructorBasic;

class S{
    int age;      // without constructor
    String name;

    S(){
        age = 0;
        name = null;

    }
}

public class students {
    public static void main(String[] args) {
        S s = new S();
        System.out.println(s.age);



    }

}
