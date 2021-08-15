package task14;

import java.io.*;

public class NBFileOutput {
    static String file = "src\\task14\\NBFileOutput.out";

    public static void start(String[] args)
            throws IOException {
        BufferedReader in = new BufferedReader(
                new StringReader(
                        BufferedInputFile.read("src\\task14\\NBFileOutput.java")));
        PrintWriter out = new PrintWriter((new FileWriter(file)));
        int lineCount = 1;
        String s;
        while ((s = in.readLine()) != null)
            out.println(lineCount++ + ": " + s);
        out.close();
        // Show the stored file:
        System.out.println(BufferedInputFile.read(file));
    }
}
