package algo.hackerrank.problem.solving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SaveThePrisoner {

    // Complete the saveThePrisoner function below.
    static int saveThePrisoner(int n, int m, int s) {

        int expr = (((m % n) + s) - 1) % n;
        return   expr == 0 ? n : expr;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.println(saveThePrisoner(99,99,1));

    }
}
