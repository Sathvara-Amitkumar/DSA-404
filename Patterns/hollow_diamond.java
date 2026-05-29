public class hollow_diamond {
    public static void main(String[] args) {
        int n = 5;

        for (int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }

            if(i == 1) {
                for(int j=1; j<= 2*i-1; j++) {
                    System.out.print("X ");
                }
            }
            else {
                System.out.print("X ");

                for(int j=1; j<=2*i-3; j++) {
                    System.out.print("  ");
                }

                System.out.print("X");
            }

            System.out.println();
        }

        // Down side
        for (int i=n-1; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }

            if(i == 1) {
                for(int j=1; j<= 2*i-1; j++) {
                    System.out.print("X ");
                }
            }
            else {
                System.out.print("X ");

                for(int j=1; j<=2*i-3; j++) {
                    System.out.print("  ");
                }

                System.out.print("X");
            }

            System.out.println();
        }
    }
}
