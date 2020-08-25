package algo.hackerrank.problem.solving;

public class JumpingClouds {

    public static void main(String[] args) {

        int i = jumpingOnClouds(new int[]{0, 0, 0, 1, 0, 0});
        System.out.println(i);

    }

    static int jumpingOnClouds(int[] c) {

        int currentPosition = 0;
        int jumpCount = 0;

        while (currentPosition < c.length - 1) {
            if ((currentPosition < (c.length - 2)) && (c[currentPosition + 2] == 0)) {
                currentPosition = currentPosition + 2;
                jumpCount++;
            } else {
                currentPosition++;
                jumpCount++;
            }
        }
        return jumpCount;

    }

}
