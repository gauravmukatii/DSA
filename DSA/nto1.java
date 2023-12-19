public class nto1 {
    public static void main(String[] args) {
        int n = 5;
        function(n);
    }

    public static void function(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n + "\n");

        function(n - 1);
    }
}