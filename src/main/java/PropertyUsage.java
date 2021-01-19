import utils.PropertiesReaderClassLoader;

public class PropertyUsage {

    public static void main(String[] args) {
        String baseUrl = PropertiesReaderClassLoader.getInstance().getValueFromProperty( "baseUrl");
        String defaultTimeoutValue = PropertiesReaderClassLoader.getInstance().getValueFromProperty( "defaultTimeout");
        System.out.println("baseUrl = " + baseUrl);
        System.out.println("defaultTimeoutValue = " + defaultTimeoutValue);
    }
}
