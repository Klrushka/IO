package task14;

import java.io.*;
import java.util.Properties;

public class NBFileOutput extends ReadingClass implements Start {
    private static final Properties properties = InitializePropertyFile.init();

    public void start() {
        assert properties != null;
        try {
            startRead(new PrintWriter((new FileWriter(properties.getProperty("NBFFile")))), properties.getProperty("NBFFile"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
