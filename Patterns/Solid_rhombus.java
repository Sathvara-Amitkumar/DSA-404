// Solid Rhombus

public class Solid_rhombus {
    public static void main(String[] args) {
        int n = 4;

        for(int i=1; i<=n; i++) {

            // Spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            // stars
            for(int j=1; j<=n; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}
