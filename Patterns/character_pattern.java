public class character_pattern {
    public static void main(String[] args) {
        int n = 5;

        // ABCD pattern
        // char ch = 'A';
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(ch + " ");
        //         ch++;
        //     }
        //     System.out.println();
        // }


        // for (int i=1; i<=n; i++) {
        //     char ch = 'E';
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(ch + " ");
        //         ch--;
        //     }
        //     System.out.println();
        // }


        // character pyramid
        for(int i=1; i<=n; i++) {
            char ch = 'A';

            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }

            for(int j=1; j<=i; j++) {
                System.out.print(ch + " ");
                ch++;
            }

            char c = (char)('A' + i - 2);
            for(int j=1; j<=i-1; j++) {
                System.out.print(c + " ");
                c--; 
            }

            System.out.println();
        }

    }
}
