public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1342;
        System.out.println(sumOf(n));
    }

    private static int sumOf(int n) {
        if (n == 0) {
            return 0;
        }

        return sumOf(n / 10) + (n % 10);

    }
}
