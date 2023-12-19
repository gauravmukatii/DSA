public class ReverseNumber {

    public static int reverse(int n, int noOfDigits) {
        if (n < 10) {
            return n;
        }

        int rem = n % 10;
        return (int) (rem * Math.pow(10, noOfDigits) + reverse(n / 10, noOfDigits - 1));
    }

    public static void main(String[] args) {
        int n = 5578;
        n = 4558899;
        reverseIterate(n);
        System.out.println("----------------------------------------------------------------");
        int noOfDigits = (int) Math.log10(n);
        int ans = reverse(n, noOfDigits);
        System.out.println(ans);
    }

    public static void reverseIterate(int num) {
        int result = 0;
        while (num != 0) {
            int temp = num % 10;
            result = result * 10 + temp;
            num /= 10;
        }
        System.out.println(result);
    }
}
