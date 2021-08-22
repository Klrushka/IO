package task14;

import java.io.IOException;

public class Comparing {

    public static <T extends ReadingClass> long comp(Start t){
        long start;
        long end;

        start = System.currentTimeMillis();
        t.start();
        end = System.currentTimeMillis();
        return end - start;


    }
}
