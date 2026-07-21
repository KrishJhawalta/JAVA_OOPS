package ConstructorBasic;

class S{
    int age;      // without constructor
    String name;
    int rollno;

    S(){
        age = 0;
        name = null;
        rollno = 0;

    }

    class T { //Teacher class
        T(){    // constructor
            System.out.println("I am teacher");

        }
    }
}

public class students {
    public static void main(String[] args) {
        S s = new S();
        System.out.println(s.age);
        System.out.println(s.name);
        System.out.println(s.rollno);
       



    }

}
