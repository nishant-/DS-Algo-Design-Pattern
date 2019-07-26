package common;

public class ReverseInteger {

    public int reverse(int i) {

        int result = 0;
        while(i > 0) {
            int r = i % 10;
            result = result * 10 + r;
            i/=10;
        }
        return result;
    }
}
