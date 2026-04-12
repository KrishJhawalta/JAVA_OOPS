package Abstraction.PracticeQuestions;
interface TvRemote{
    void Buttons();
}
interface SmartTVRemote extends TvRemote{
    void voiceFeature();
}
class Tv implements SmartTVRemote{       // accessing interface 1
    public void Buttons(){
        System.out.println("Click click! Working");
    }
    public void voiceFeature(){
        System.out.println("Voice Assistant");
    }
}

public class Q6 {
    static void main(String[] args) {
        Tv t1 = new Tv();
        t1.Buttons();
        t1.voiceFeature();

    }
}
