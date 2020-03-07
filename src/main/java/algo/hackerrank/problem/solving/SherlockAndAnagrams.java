package algo.hackerrank.problem.solving;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class SherlockAndAnagrams {


        // Complete the sherlockAndAnagrams function below.
        static int sherlockAndAnagrams(String s) {
            int anagramCount = 0;
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                for (int k = i + 1; k <= s.length(); k++) {
                    String sub = s.substring(i, k);
                    System.out.println(sub);
                    sub = new String(sort(sub.toCharArray()));
                    int value = map.getOrDefault(sub, 0);
                    if(value > 0) {
                        anagramCount = anagramCount + value;
                    }
                    map.put(sub, value+1);

                }
            }
            return anagramCount;
        }

        private static char [] sort(char arr[]) {
            Arrays.sort(arr);
            return arr;
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {

            sherlockAndAnagrams("kkkk");

        }
    }