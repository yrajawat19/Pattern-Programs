package PatternPrograms;

public class Pyramid {
    public static void main(String[] args) {
        int n = 5 ;

        // outer loop
        for(int i = 0 ; i < n ; i++) {
            for(int j = n-i ; j > 1; j--)
                System.out.print(" ");
            for(int j = 0; j <= i ; j++)
                System.out.print("* ");

            System.out.println();
        }
    }
}