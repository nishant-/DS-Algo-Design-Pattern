package hackerrank;

import hackerrank.problem.solving.MaxPerimeterTriangle;
import org.junit.Test;

public class MaxPerimeterTriangleTest {

    @Test
    public void maximumPerimeterTriangle() {

        int x[] = MaxPerimeterTriangle.maximumPerimeterTriangle(new int[] {3,9,2,5,1,3});
        for(int i : x){
            System.out.println(i);
        }
    }
}