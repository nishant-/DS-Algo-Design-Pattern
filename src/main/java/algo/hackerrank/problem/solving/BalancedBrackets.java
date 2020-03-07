package algo.hackerrank.problem.solving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BalancedBrackets {

    static String isBalanced(String s) {

        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));

        for(int i = 1 ; i < s.length(); i++) {
            if(st.isEmpty()) {
                st.push(s.charAt(i));
            }
            else {
                char curr = st.peek();
                char next = s.charAt(i);

                if (curr == '{' && next == '}')
                    st.pop();
                else if(curr == '(' && next == ')')
                    st.pop();
                else if(curr == '[' && next == ']')
                    st.pop();
                else st.push(s.charAt(i));
            }
        }

        return st.isEmpty() ? "YES" : "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
