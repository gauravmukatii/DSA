public class nto1 {
    public static void main(String[] args) {
        int n = 5;
        // function(n);
        // function2(n);
        functionboth(n);
    }

    public static void function(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n + "\n");

        function(n - 1);
    }

    public static void function2(int n) {
        if (n == 0) {
            return;
        }

        function2(n - 1);
        System.out.println(n + "\n");

    }

    public static void functionboth(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n + "\n");
        functionboth(n - 1);
        System.out.println(n + "\n");
    }
}