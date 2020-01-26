package hackerrank;

import hackerrank.problem.solving.ClimbingTheLeaderBoard;
import org.junit.Test;

public class ClimbingTheLeaderBoardTest {

    @Test
    public void mergedArray() {

       /* int a[] = ClimbingTheLeaderBoard.mergedArray(new int[] {100, 100, 50, 40, 40,20,10}, 5);

        for (int i:a) {
            System.out.println(i);
        }*/
    }



    @Test
    public void climbingLeaderboard() {

        int a[] = ClimbingTheLeaderBoard.climbingLeaderboard(new int[] {100}, new int[]{500});
        for (int i:a) {
            System.out.println(i);
        }
    }

    @Test
    public void climbingLeaderboard2() {

        int a[] = ClimbingTheLeaderBoard.climbingLeaderboard2(new int[] {100}, new int[]{500});
        for (int i:a) {
            System.out.println(i);
        }
    }
}