package algo.common;

public class StringReversal {


    public String reverseWithStringBuilder(String s) {

        return new StringBuilder(s).reverse().toString();
    }

    public String reverseUsingArray(String s) {

        String reversed = "";
        for(int i = s.length()-1; i >=0 ; i--) {
            reversed = reversed + s.charAt(i);
        }
        return reversed;
    }
}
