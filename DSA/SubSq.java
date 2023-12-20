import java.util.ArrayList;

public class SubSq {
    public static void main(String[] args) {
        ArrayList<String> list = subset1("", "abc");
        for (String ss : list) {
            System.out.println(ss);
        }

    }

    public static void subset(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subset(p + ch, up.substring(1));
        subset(p, up.substring(1));
    }

    public static ArrayList<String> subset1(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subset1(p + ch, up.substring(1));
        ArrayList<String> right = subset1(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}
