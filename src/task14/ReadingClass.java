package task14;

import java.io.*;

public class ReadingClass {
    public static void startRead(PrintWriter printWriter, String file) {

        try {
            BufferedReader in = new BufferedReader(
                    new StringReader(
                            BufferedInputFile.read("src\\task14\\BFileOutput.java")));
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

