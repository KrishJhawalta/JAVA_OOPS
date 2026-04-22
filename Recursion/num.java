package Recursion;

public class num {
    void fun(int n){
        if (n>0){
            System.out.println(n);
fun(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        num n = new num();
        n.fun(5);


    }


}
