package patterns.behavioral.template;

public class XMLDataRenderer extends DataRenderer {


    @Override
    public String readData() {
        return "XML Data";
    }

    @Override
    public String processData(String data) {
        return "processed "+ data;
    }
}
