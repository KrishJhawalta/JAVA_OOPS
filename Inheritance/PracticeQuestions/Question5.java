package Inheritance.PracticeQuestions;
class krish{
    krish(){
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
        System.out.println("i am in overloaded constr");
    }
}

public class Question5 {
    public static void main(String[] args) {

    }
}
