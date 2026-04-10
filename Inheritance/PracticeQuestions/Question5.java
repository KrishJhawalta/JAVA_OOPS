package Inheritance.PracticeQuestions;
class krish{
    krish(){ //constructor
        System.out.println("i am krish");
    }
    krish(int a){
        System.out.println("i am in overloaded constructor" + a);
    }
}


class child extends krish{
    child(){
        System.out.println("i am in child");
    }
    child(int a,int b){
        super(a);
        System.out.println("i am in overloaded constructor :" + b);
    }
}

public class Question5 {
    public static void main(String[] args) {
        //child c = new child();
        child c = new child();

    }
}
