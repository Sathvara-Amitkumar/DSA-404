public class butterfly_pattern {
    public static void main(String[] args) {
        int n = 5;

        // Upper Part
        for (int i=1; i<=n; i++) {
            // stars
            for(int j=1; j<=i; j++) {
                System.out.print("X ");
            }

            // spaces => 2n - 2i => 2(n-i)
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print("  ");
            } 

            // stars
            for(int j=1; j<=i; j++) {
                System.out.print("X ");
            }

            System.out.println();
        }

        // Below part
        for (int i=n; i>=1; i--) {
            // stars
            for(int j=1; j<=i; j++) {
                System.out.print("X ");
            }

            // spaces => 2n - 2i => 2(n-i)
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print("  ");
            } 

            // stars
            for(int j=1; j<=i; j++) {
                System.out.print("X ");
            }

            System.out.println();
        }
    }
}
