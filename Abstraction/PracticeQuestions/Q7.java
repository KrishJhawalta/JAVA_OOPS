package Abstraction.PracticeQuestions;

interface Tv1Remote{
    void Remote();
}

class TV implements Tv1Remote{
    public void Remote(){
        System.out.println("TV Remote working inside TV class");
    }
}

public class Q7 {
    public static void main(String[] args) {

        // Objects
        TV t = new TV();
        t.Remote();

    }
}
