package Abstraction.PracticeQuestions;
interface TvRemote{
    void Buttons();
}
class SmartRemote implements TvRemote {
    public void Buttons(){
        System.out.println("All working");
    }
}

public class Q6 {
    static void main(String[] args) {
        SmartRemote s1 = new SmartRemote();
        s1.Buttons();

    }
}
