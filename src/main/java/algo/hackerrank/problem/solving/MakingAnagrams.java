package algo.hackerrank.problem.solving;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MakingAnagrams {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {

        Stream<Character> s1 = a.chars().mapToObj(c -> (char) c);
        Stream<Character> s2 = b.chars().mapToObj(c -> (char) c);

        Map<Character, Integer> freqA = s1.collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(count -> 1)));
        Map<Character, Integer> freqB = s2.collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(count -> 1)));

        int charsToBeRemoved = 0;

        //count chars to be removed from first string
        for (char c : freqA.keySet()) {
            if (freqB.containsKey(c)) {
                //if a matching char is found, remove the extra number of chars only
                //the freq of chars need to remain the same for anagram.
                //this needs to be done only once.
                charsToBeRemoved = charsToBeRemoved + Math.abs(freqA.get(c) - freqB.get(c));
            } else {
                charsToBeRemoved = charsToBeRemoved + freqA.get(c);
            }
        }
        for (char c : freqB.keySet()) {
            if (!freqA.containsKey(c)) {
                charsToBeRemoved = charsToBeRemoved + freqB.get(c);
            }
        }
        return charsToBeRemoved;
    }

    public static void main(String[] args) {
        int x = makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke");
        System.out.println(x);
    }
}
