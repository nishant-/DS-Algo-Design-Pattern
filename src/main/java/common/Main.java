package common;

public class Main {

    public static void main(String[] args) {

        Palindrome<String> p = s -> {
            char arr[] = s.toCharArray();
            for(int i = 0 ; i < arr.length/2 ; i++) {
                if(arr[i]!=arr[arr.length-i-1]) {
                    return false;
                }
            }
            return true;
        };
    }
}
