public class number_pattern {
    public static void main(String[] args) {
        int n = 5;

        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }


        // int count = 1;
        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(count + " ");
        //         count++;
        //     }
        //     System.out.println();
        // }

        // Pyramid number pattern

        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print("  ");
        //     }

        //     // numbers - Left side part
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(j + " ");
        //     }

        //     // right side part
        //     int decRow = i-1;
            
        //     for(int j=1; j<=i-1; j++) {
        //         System.out.print(decRow + " ");
        //         decRow--;
        //     }

        //     System.out.println();
        // }


        // Triangle number
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }

            for(int j=1; j<=2*i-1; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }   
    }
}
