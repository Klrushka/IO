package task14;

import java.io.*;


public class BFileOutput extends ReadingClass implements Start {
    String file = "src\\task14\\BFileOutput.out";

    @Override
    public void start() {
        try {
            startRead(new PrintWriter(
                    new BufferedWriter(new FileWriter(file))), file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
