package PracticeQuestions;
class Star {
    void starpat(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
public class bokin {
    public static void main(String[] args) {
        Star st = new Star();
        st.starpat();

    }
}
