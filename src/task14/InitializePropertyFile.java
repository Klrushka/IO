package task14;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class InitializePropertyFile {
    public static Properties init(){
        try {
            Properties properties = new Properties();
            properties.load(new FileReader("src\\config.properties"));
            return properties;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
