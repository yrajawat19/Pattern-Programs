package PatternPrograms;

/*
Program to print pattern
    *
    * *
    * * *
    * * * *
    * * * * *
    * * * *
    * * *
    * *
    *
*/

public class RightPascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        /* for loop to print upper patter
         *
         * *
         * * *
         * * * *
         * * * * *
         */
        for(int i = 0 ; i < n; i++) {
            for(int j = 0 ; j <= i ; j++)
                System.out.print("*"+" ");
            System.out.println();
        }

        /* for loop to print lower triangle
            * * * *
            * * *
            * *
            *
         */
        for(int i = n-1; i > 0 ; i--) {
            for(int j = 0 ; j < i ; j++)
                System.out.print("*"+" ");
            System.out.println();
        }
    }
}
