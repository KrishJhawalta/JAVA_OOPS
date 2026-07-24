interface payment{
    void pay();
}

class UPI implements payment{
    @Override
    public void pay(){
        System.out.println("Payment done using UPI");
    }
}

public class InterfaceQuestion {
    public static void main(String[] args) {
        
    }
    
}
