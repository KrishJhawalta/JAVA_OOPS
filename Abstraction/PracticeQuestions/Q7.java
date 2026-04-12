package Abstraction.PracticeQuestions;

 // interfaces 1
interface SmartR{
    void Remote1();}

// interfaces 2
interface Tv1Remote extends SmartR{
    void Remote();}

// TV class
class TV implements Tv1Remote{
    public void Remote(){
        System.out.println("TV Remote working inside TV class"); }

    public void Remote1(){
        System.out.println("Working Smartly");
    } }

public class Q7 {
    public static void main(String[] args) {

        // Objects of interfaces and TV clas
        TV t = new TV();
        t.Remote();
        t.Remote1();

    } }