class Student{
    String name;

    Student() {  // constructor created
        System.out.println("Constructor of student class");
    }
//function
    void display() {
        System.out.println("Name of student is: " + name);
    }
}

public class student {
   public static void main(String[] args) {
    Student s1 = new Student();  // object of student class
    Student s2 = new Student();  // object of student class
    s1.name = "krish";
    s1.display();
    }
}
