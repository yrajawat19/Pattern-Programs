package PatternPrograms;

public class FloydTriangle {
    public static void main(String[] args) {
        int n = 5;
        int k = 1;
        // outer loop
        for(int i = 0 ; i < 5; i++) {
            // inner loop
            for(int j = 0; j <= i ; j++) {
                System.out.print(k++);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}