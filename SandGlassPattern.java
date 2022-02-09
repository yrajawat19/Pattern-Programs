package PatternPrograms;

/* Program to print pattern
 * * * * *
  * * * *
   * * *
    * *
     *
    * *
   * * *
  * * * *
 * * * * *
 */

public class SandGlassPattern {
    public static void main(String[] args) {
        int n = 5;
        /*
        for loop to print upper half pattern
            * * * * *
             * * * *
              * * *
               * *
                *
         */
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < i ; j++)
                System.out.print(" ");
            for(int j = n - i ; j > 0 ; j--)
                System.out.print("*"+" ");
            System.out.println();
        }

        /*
            for loop to print lower half patter
                * *
               * * *
              * * * *
             * * * * *
         */
        for(int i = n-1 ; i >= 0 ; i--) {
            for(int j = 0 ; j < i ; j++)
                System.out.print(" ");
            for(int j = i; j <= n-1 ; j++)
                System.out.print("*"+" ");
            System.out.println();
        }
    }
}
