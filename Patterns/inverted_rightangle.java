public class inverted_rightangle {
    public static void main(String[] args) {
        int n = 5;

        for(int i=1; i<=n; i++) {
            
            // stars
            for (int j=1; j<= n-i+1; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}