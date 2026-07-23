interface Students{  //interface 
    void wearUniform();
    void wearID();

}

class Krish implements Students{ // implementing interface Students
    @Override 
    public void wearUniform(){
        System.out.println("Krish wears uniform");
    }

    public void wearID(){
        System.out.println("Krish wears ID");
    }

}

public class InterfaceDemo {
    public static void main(String[] args) {

        // objects 
        Krish k = new Krish();
        k.wearUniform();
        k.wearID();
       
    }
    
}
