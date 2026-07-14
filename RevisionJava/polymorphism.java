class Calculator{
    static void add(int a, int b){
        System.out.println("Sum: " + (a+b));
    }

    static void add(int a, int b, int c){
        System.out.println("Sum: " + (a+b+c));
    }
}


public class polymorphism{
    public static void main(String[]args){

        Calculator.add(55,22);
        Calculator.add(55,22,33);









    }
}