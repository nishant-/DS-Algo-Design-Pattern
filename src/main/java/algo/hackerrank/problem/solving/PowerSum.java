package algo.hackerrank.problem.solving;

public class PowerSum {

    static int powerSum(int X, int N) {

        return powerSum(X, N, 1);


    }

    private static int powerSum(int x, int n, int i) {

        int pow = (int) Math.pow(i, n);
        if (pow > x)
            return 0;
        if (pow == x)
            return 1;
        return powerSum(x, n, (i + 1)) + powerSum(x - pow, n, i + 1);
    }


    public static void main(String[] args) {

        int ans = powerSum(100, 2);
        System.out.println(ans);

    }

}
