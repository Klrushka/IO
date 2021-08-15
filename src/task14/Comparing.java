package task14;

import java.io.IOException;

public class Comparing {
    public static long deltaBF(String... args) throws IOException {
        long start;
        long end;

        start = System.currentTimeMillis();
        BFileOutput.start(args);
        end = System.currentTimeMillis();
        return end - start;
    }

    public static long deltaNBF(String... args) throws IOException {
        long start;
        long end;

        start = System.currentTimeMillis();
        NBFileOutput.start(args);
        end = System.currentTimeMillis();
        return end - start;
    }
}
