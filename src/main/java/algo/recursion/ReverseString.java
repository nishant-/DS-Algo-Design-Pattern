package algo.recursion;

/*return the reversed string using recursion*/

public class ReverseString {

    public static void main(String[] args) {

        System.out.println(reverse("abcd"));

    }

    private static final String reverse(String s) {

        int len = s.length();

       return reverse(s, len);


    }

    private static String reverse(String s, int len) {

        if (len == 1) {
            return s;
        }
        return s.charAt(len - 1) + reverse(s.substring(0, len - 1), len - 1);

    }


}
