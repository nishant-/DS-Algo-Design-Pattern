package hackerrank.java;

import java.util.*;

import static java.util.Arrays.*;

// Write your Checker class here

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {


    @Override
    public int compare(Player o1, Player o2) {
        if(o1.score == o2.score) {
            return o1.name.compareTo(o2.name);
        }
        else {
            if(o1.score > o2.score) {
                return -1;
            }
            else return 1;
        }
    }
}

public class JavaComparator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
