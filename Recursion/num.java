package Recursion;


public class num {
    void fun(int n){
        if (n>0){           // condition 1
            System.out.println(n);     // 2
fun(n-1);                         // 3
            System.out.println(n);     // 4
        }
    }
    public static void main(String[] args) {
        num n = new num();
        n.fun(5);


    }


}
