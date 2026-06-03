public class maths_questions {
    static void print_digit(int n) {
        while(n != 0) {
            int ans = n % 10;
            System.out.println(ans);
            n /= 10;
        }
    }

    static void count_digit(int n) {
        int count = 0;

        while(n != 0) {
            int ans = n % 10;
            count++;
            n /= 10;
        }
        System.out.print("Total nuumbers = " + count);
    }
    public static void main(String[] args) {
        int n = 53127;
        print_digit(n);
        // count_digit(n);
    }
}
