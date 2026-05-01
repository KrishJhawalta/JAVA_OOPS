package PatternPrinting;

public class star {
    public static void main(String[] args) {

//nothing to do feeling lost

    // pattern printing
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

     /*   Pattern 4:
        54321
        4321
        321
        21
        1
        CODE:
        int num=5;
       for(int i=5; i>=0; i--){
           for(int j=1; j<=i; j++){
               System.out.print(num);
               num--;
           }
           System.out.println(); //
       }
*/


}}