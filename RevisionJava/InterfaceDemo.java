interface Students{
    void wearUniform();
    void wearID();

}

class Krish implements Students{
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
        Krish k = new Krish();
        k.wearUniform();
        k.wearID();
       
    }
    
}
