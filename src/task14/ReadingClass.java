package task14;

import java.io.*;
import java.util.Properties;

public class ReadingClass {

    private final static Properties PROPERTIES = InitializePropertyFile.init();

    public static void startRead(PrintWriter printWriter, String file) {


        try {
            assert PROPERTIES != null;
            BufferedReader in = new BufferedReader(
                    new StringReader(
                            BufferedInputFile.read(PROPERTIES.getProperty("ReadingFile"))));
            PrintWriter out = printWriter;
            int lineCount = 1;
            String s;
            while ((s = in.readLine()) != null)
                out.println(lineCount++ + ": " + s);
            out.close();
            // Show the stored file:
            System.out.println(BufferedInputFile.read(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

