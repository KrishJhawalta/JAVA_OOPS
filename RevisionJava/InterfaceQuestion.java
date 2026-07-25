interface payment{
    void pay();
}

class UPI implements payment{ // using implements keyword we can implement the interface in the class
    @Override
    public void pay(){
        System.out.println("Payment done using UPI");
    }
}

class creditcard implements payment{  // using implements keyword we can implement the interface in the class
    @Override
    public void pay(){
        System.out.println("Payment done using credit card");
    }
}

public class InterfaceQuestion { 
    public static void main(String[] args) {
        // creating object of the class which implements the interface
        UPI u = new UPI();
        creditcard c = new creditcard();
        u.pay();
        c.pay();

        
    }
    
}
