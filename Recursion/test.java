public class test{
   public static void main(String[] args) {

     System.out.println("Hello!");

      //function
     void print(int n){
       if(n>5) return; //condition for 5
       System.out.println(n);
       print(n+1);
     }

    
  
    
  }
}
