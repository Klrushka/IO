package task14;

import java.io.*;
import java.util.Properties;


public class BFileOutput extends ReadingClass implements Start {


    private final static Properties PROPERTIES = InitializePropertyFile.init();



    @Override
    public void start() {
        try {
            assert PROPERTIES != null;
            startRead(new PrintWriter(
                    new BufferedWriter(new FileWriter(PROPERTIES.getProperty("BFFile")))), PROPERTIES.getProperty("BFFile"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
