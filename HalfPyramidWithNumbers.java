package PatternPrograms;

public class HalfPyramidWithNumbers {
    public static void main(String[] args) {
        int n = 5;

        System.out.println("Half Number pyramid.");
        //outer loop
        for(int i = 1; i <= n ; i++) {
            // inner loop
            for(int j = 1; j <= i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("Inverted half number pyramid .");
        // inverted half numbers pyramid
        for(int i = n ; i > 0 ; i--) {
            // inner loop
            for(int j = 1 ; j <= i ; j++)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}