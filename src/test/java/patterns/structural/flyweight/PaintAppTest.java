package patterns.structural.flyweight;

import org.junit.gen5.api.Test;
import patterns.structural.flyweight.problem.PaintApp;

public class PaintAppTest {

    @Test
    public void testDrawShapes () {

        PaintApp paintApp = new PaintApp();
        paintApp.render(10);
    }

}