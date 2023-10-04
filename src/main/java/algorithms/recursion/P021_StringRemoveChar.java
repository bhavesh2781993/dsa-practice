package algorithms.recursion;

public class P021_StringRemoveChar {
    public static void main(String[] args) {
        String ans = removeA("abbcadda", "");
        System.out.println(ans);
        ans = removeA("abbcadda");
        System.out.println(ans);
    }
    private static String removeA(String name, String ans) {
        if (name == null || name.isEmpty()) {
            return ans;
        }
        if (name.charAt(0) == 'A' || name.charAt(0) == 'a') {
            return removeA(name.substring(1), ans);
        } else {
            return removeA(name.substring(1), ans + name.charAt(0));
        }
    }

    private static String removeA(String name) {
        if (name == null || name.isEmpty()) {
            return "";
        }

        if (name.charAt(0) == 'a' || name.charAt(0) == 'A') {
            return removeA(name.substring(1));
        } else {
            return name.charAt(0) + removeA(name.substring(1));
        }
    }
}
