package hackerrank.problem.solving;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SherlockAndAnagrams {


        // Complete the sherlockAndAnagrams function below.
        static int sherlockAndAnagrams(String s) {

            Set<String> allSortedSubstrings = new HashSet<>();
            int anagramCount = 0;
            for(int i = 0; i < s.length(); i++) {
                for(int k = i+1; k <= s.length(); k++) {
                    String sub = s.substring(i, k);
                    char arr[] = sub.toCharArray();
                    Arrays.sort(arr);
                    sub = new String(arr);
                    if(allSortedSubstrings.contains(sub)){
                        anagramCount++;
                    }
                    else {
                        allSortedSubstrings.add(sub);
                    }
                }
            }
            return anagramCount;
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int q = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int qItr = 0; qItr < q; qItr++) {
                String s = scanner.nextLine();

                int result = sherlockAndAnagrams(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            }

            bufferedWriter.close();

            scanner.close();
        }
    }