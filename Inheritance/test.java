package Inheritance;

import java.util.Scanner;

public class test {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scanner class
        int a =  sc.nextInt();
        int b = sc.nextInt();
        int c = sc.next().charAt(0);

        switch(c){    // switch statement for operators
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
        }

    }
}
