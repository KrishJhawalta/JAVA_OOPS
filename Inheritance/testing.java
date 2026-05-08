package Inheritance;

class testcase1 {
    void getred(){     // this error due to sam func name
    System.out.println("I am transporter");}

    void getred(){         // error due to same name without in another class
        System.out.println("Overrided");
    }
}
public class testing {
   public static void main(String[] args) {
       System.out.println("Hello i am under main function");

    }
}

// ever breaked
