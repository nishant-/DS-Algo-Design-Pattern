package algo.hackerrank.problem.solving;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;

public class AlternatingCharacters {

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {

        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        stack.push(chars[0]);
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (stack.peek() == chars[i]) {
                count++;
            } else {
                stack.push(chars[i]);
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int x = AlternatingCharacters.alternatingCharacters("ABABABAB");
        System.out.println(x);
    }

}
