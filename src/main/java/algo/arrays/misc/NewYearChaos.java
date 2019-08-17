package algo.arrays.misc;

import java.util.Scanner;

public class NewYearChaos {
    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {

        int lastIndex = q.length - 1;
        int sCount = 0;
        int diff = 0;
        for(int i = lastIndex; i >= 0; i--) {
            diff = 0;
            int difPos[] = findDiffPos(q, lastIndex);
            if(difPos[0] == -1) {
                System.out.println("Too chaotic");
                return;
            }
            else {
                 diff = difPos[0];
                int pos = difPos[1];

                for (int k = 0; k < diff; k++) {
                    int tmp = q[pos];
                    q[pos] = q[pos + 1];
                    q[pos + 1] = tmp;
                    pos++;
                }
                sCount = sCount + diff;
            }
        }
        System.out.println(sCount);
    }

    private static int[] findDiffPos(int[] q, int lastIndex) {

        int arr[] = new int[2];
        int diff = 0;
        int index = -1;
        for(int i = lastIndex; i >= 0; i--) {
            diff = q[i] - (i + 1);
            if(diff > 2) {
                return new int[]{-1, -1};
            }
            if(diff > 0) {
                index = i;
                break;
            }
        }
        return new int[] {diff, index};
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
