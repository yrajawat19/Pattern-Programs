package PatternPrograms ;

/* Program to print pattern
    * * * * *
    * * * *
    * * *
    * *
    *
 */


public class DownwardTriangle {
    public static void main(String[] args) {
        int n = 5;
        // outer loop
        for(int i = 0; i < n ; i++) {
            // inner loop
            for(int j = n-i; j > 0 ; j--)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}