package algo.hackerrank.problem.solving;

public class RepeatedString {

    // Complete the repeatedString function below.
    public static long repeatedString(String s, long n) {

        int len = s.length();
        long q = n / len;
        long r = n % len;
        return q * s.chars().filter(c -> c == 'a').count() + s.substring(0, (int) r).chars().filter(c -> c == 'a').count();
    }


    public static void main(String[] args) {
        long ans = RepeatedString.repeatedString("qqqqqqqqeeeeeeaaaaaaaaggggggggggggghaaaaa", 736778906400L);
        System.out.println(ans);
    }
}
