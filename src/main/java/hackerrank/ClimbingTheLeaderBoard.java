package hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ClimbingTheLeaderBoard {


    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {

        int rankArr[] = new int[alice.length];
        int c = 0;
        for (int i = 0; i < alice.length; i++) {
            int[] mergedArray = Arrays.copyOf(scores, scores.length + 1);
            mergedArray[scores.length] = alice[i];
            Arrays.sort(mergedArray);
            int reversedMergedArr[] = new int[mergedArray.length];
            int k = 0;
            for(int j = mergedArray.length -1; j >= 0; j--) {
                reversedMergedArr[k++] = mergedArray[j];
            }
            rankArr[i] = getRank(reversedMergedArr).get(alice[i]);

        }
        return rankArr;
    }


    static int[] climbingLeaderboard2(int[] scores, int[] alice) {

        int rankArr[] = new int[alice.length];
        int c = 0;
        for(int i = 0; i < alice.length; i++) {
            int aliceScore = alice[i];
            int rank = 1;
            for(int j = 0; j < scores.length - 1; j++) {
                if(scores[j] != scores[j+1]) {
                    rank++;
                }
                if(aliceScore == scores[j]) {
                    rankArr[c++] = rank;
                    break;
                }
                else if(aliceScore > scores[j]) {
                    rankArr[c++] = rank + 1;
                    break;
                }
                else if(aliceScore < scores[j + 1] && j == scores.length -1) {
                    rankArr[c++] = rank + 1;
                    break;
                }
                else continue;
            }
        }
        return rankArr;
    }


    public static Map<Integer,Integer> getRank(int[] arr) {

       Map<Integer, Integer> rankMap = new HashMap<>();
       int rank = 1;
        rankMap.put(arr[0], 1);
       for(int i=1; i < arr.length; i++) {
           int prev = arr[i - 1];
           if(prev != arr[i]) {
               rank = rank + 1;
           }
           rankMap.put(arr[i], rank);
       }
       return rankMap;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));


        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
