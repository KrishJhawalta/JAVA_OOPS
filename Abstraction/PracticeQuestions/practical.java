package Abstraction.PracticeQuestions;

class Product{
    String productName = "rajma";
    int quantity = 3;
    double price = 40.0;

    void getDetails(){
        System.out.println("Product name is: "+productName);
        System.out.println("Quantity: "+quantity);
        System.out.println("Price: "+price);
    }


    void totalsum(){
        System.out.println("Total price is: "+ quantity*price);
    }

}
public class practical {
    public static void main(String[] args) {
        Product p1 = new Product();

        p1.getDetails();
        p1.totalsum();

    }
}

