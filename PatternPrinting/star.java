package PatternPrinting;

public class star {
    public static void main(String[] args) {

        /*
        Pattern 1:
        ****
        ****
        ****
        ****

       CODE:
        for(int i =1; i<=5; i++){
            for(int j=1; j<=5; j++){
                System.out.print("* ");}
            System.out.println();}
    */

        /*
        Pattern 2:
        *
        **
        ***
        ****
        *****

        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");}
            System.out.println();
        }
        */

        /*
        Pattern 3:
             *
            **
           ***
          ****
*/


     /*
        CODE:
        for(int i=1; i<=4; i++){
              for(int j=1; j<=4; j++){

                  if(j > 4 - i)
                      System.out.print("*");
                  else
                      System.out.print(" ");

              }
              System.out.println();
          }
*/

        int [] arr = {1,2,3,4,5};
        System.out.println(arr[1]);


}}