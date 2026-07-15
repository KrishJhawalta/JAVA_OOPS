class Student{
    private String name;
    private int age;

    // setter 
    public String getName(){
        System.out.println(name);
        return name;
    }

    // getter
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
}



public class encapsulation {
    public static void main(String[] args) {
        //objects

        Student s1 = new Student();
        s1.setName("Krish");
        s1.setAge(20);
        s1.getName();
        
    }
}
