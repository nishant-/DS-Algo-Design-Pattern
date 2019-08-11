package algo.arrays.recursion;

public class Sum {

    public int sumRecursive(int n) {

        if(n == 1)
            return 1;
        return n + sumRecursive(n - 1);
    }

    public static void main(String[] args) {

        Sum sum = new Sum();
        System.out.println(sum.sumRecursive(10000));
        System.out.println();
        System.out.println( sum.sumIterative(10000));
    }

    public int sumIterative(int n) {

        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum+=i;
        }
        return sum;
    }
}
