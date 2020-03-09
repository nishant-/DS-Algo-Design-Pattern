package patterns.behavioral.template;

import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assertions.assertTrue;


public class DataRendererTest {

    @Test
    public void testXMLDataRenderer(){
        DataRenderer renderer = new XMLDataRenderer();
        String retVal = renderer.render();
        assertTrue(retVal.contains("XML"));
    }

    @Test
    public void testCSVDataRenderer(){
        DataRenderer renderer = new CSVDataRenderer();
        String retVal = renderer.render();
        assertTrue(retVal.contains("csv"));
    }

}