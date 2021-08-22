package task14;

import java.io.*;

public class NBFileOutput extends ReadingClass implements Start {
    static String file = "src\\task14\\NBFileOutput.out";

    public  void start(){
        try {
            startRead(new PrintWriter((new FileWriter(file))),file);
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
