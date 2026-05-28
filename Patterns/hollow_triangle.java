public class hollow_triangle {
    public static void main(String[] args) {
        int n = 10;

        for (int i=1; i<=n; i++) {
            if (i == 1 || i == 2 || i == n) {
                for(int j=1; j<=i; j++) {
                    System.out.print("X ");
                }
            }

            else {
                // middle rows
                System.out.print("X");

                for(int j=1; j<=i-1; j++) {
                    System.out.print("  ");
                }

                System.out.print("X");
            }

            System.out.println();
        }
    }
}
