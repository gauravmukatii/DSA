public class CountZeroes {
    public static void main(String[] args) {
        int num = 30209;
        System.out.println(countZeroes(num));
    }

    public static int countZeroes(int num) {
        if (num == 0)
            return 0;

        int count = 0;

        if (num % 10 == 0) {
            count++;
        }

        return count + countZeroes(num / 10);

    }
}
