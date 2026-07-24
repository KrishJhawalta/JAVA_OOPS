interface payment{
    void pay();
}

class UPI implements payment{
    @Override
    public void pay(){
        System.out.println("Payment done using UPI");
    }
}

class creditcard implements payment{
    @Override
    public void pay(){
        System.out.println("Payment done using credit card");
    }
}

public class InterfaceQuestion {
    public static void main(String[] args) {
        UPI u = new UPI();
        creditcard c = new creditcard();
        u.pay();
        c.pay();

        
    }
    
}
