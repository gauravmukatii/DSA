public class ProductsOfDigits {
    public static void main(String[] args) {
        int n = 1342;
        // n = 0;
        System.out.println(productOf(n));
    }

    public static int productOf(int n) {
        if (n % 10 == n) {
            return n;
        }

        return productOf(n / 10) * (n % 10);
    }

}
