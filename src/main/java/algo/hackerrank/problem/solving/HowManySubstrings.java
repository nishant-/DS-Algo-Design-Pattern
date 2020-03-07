package algo.hackerrank.problem.solving;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class HowManySubstrings {

    /*
     * Complete the countSubstrings function below.
     */
   public static int[] countSubstrings(String s, int[][] queries) {

        List<Integer> aList = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < queries.length; i++) {

            int start = queries[i][0];
            int end = queries[i][1];

            if(map.containsKey(start + ":" + end)) {
                int cachedSize = map.get(start + ":" + end);
                aList.add(cachedSize);
            }

            else {

                String substr = s.substring(start, end + 1);
                Set<String> set = new HashSet<>();
                for (int k = 0; k < substr.length(); k++) {
                    for (int l = k + 1; l <= substr.length(); l++) {
                        String tmp = substr.substring(k, l);
                        set.add(tmp);
                    }
                }
                aList.add(set.size());
                map.put(start + ":" + end, set.size());
            }
        }
        int arr [] = new int[aList.size()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = aList.get(i);
        }
        return arr;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nq[0].trim());

        int q = Integer.parseInt(nq[1].trim());

        String s = scanner.nextLine();

        int[][] queries = new int[q][2];

        for (int queriesRowItr = 0; queriesRowItr < q; queriesRowItr++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");

            for (int queriesColumnItr = 0; queriesColumnItr < 2; queriesColumnItr++) {
                int queriesItem = Integer.parseInt(queriesRowItems[queriesColumnItr].trim());
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
        }

        int[] result = countSubstrings(s, queries);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
