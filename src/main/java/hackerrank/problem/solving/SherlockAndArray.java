package hackerrank.problem.solving;

import java.io.*;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class SherlockAndArray {

    // Complete the balancedSums function below.
    static String balancedSums(List<Integer> arr) {

        if(arr.size() == 1) {
            return "YES";
        }
        int a[] = arr.stream().mapToInt(Integer::intValue).toArray();
        int sumLeft = 0;
        int sumRight = 0;
        int i = 0;
        int j = a.length - 1;
        while(i < j) {
            if ((sumLeft + a[i]) < (sumRight + a[j])) {
                sumLeft += a[i];
                i++;
            }
            else  {
                sumRight += a[j];
                j--;
            }
            if( i==j ) {
                return (sumLeft == sumRight) ? "YES" : "NO";
            }
        }
        return "NO";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, T).forEach(TItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                String result = balancedSums(arr);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
