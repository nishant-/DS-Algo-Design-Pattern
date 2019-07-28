package patterns.behavioral.template;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DataRendererTest {

    @Test
    public void testXMLDataRenderer(){
        DataRenderer renderer = new XMLDataRenderer();
        String retVal = renderer.render();
        Assert.assertTrue(retVal.contains("XML"));
    }

    @Test
    public void testCSVDataRenderer(){
        DataRenderer renderer = new CSVDataRenderer();
        String retVal = renderer.render();
        Assert.assertTrue(retVal.contains("csv"));
    }

}