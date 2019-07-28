package patterns.behavioral.template;

/**
 * This is the abstract class which contains
 * the template method, the render() method in this case.
 * the other methods are usually abstract and implementing classes provide specific implementation to them
 */

public abstract class DataRenderer {

    public String render() {

        String data = readData();
        String processedData = processData(data);
        System.out.println(processedData);
        return processedData;

    }

    public abstract String readData();

    public abstract String processData(String data);


}
