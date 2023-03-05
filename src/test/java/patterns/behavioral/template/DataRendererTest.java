package patterns.behavioral.template;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

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