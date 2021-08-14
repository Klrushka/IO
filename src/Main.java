import task1.DirList;
import task6.ProcessFiles;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {


        /*
        Exercise 1: (3) Modify DirList.java (or one of its variants) so that the FilenameFilter
        opens and reads each file (using the net.mindview.util.TextFile utility) and accepts the
        file based on whether any of the trailing arguments on the command line exist in that file.
         */

        DirList.start(args);

        System.out.println();

        /*
        Exercise 6: (5) Use ProcessFiles to find all the Java source-code files in a particular
        directory subtree that have been modified after a particular date.
         */
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");

        new ProcessFiles(new ProcessFiles.Strategy() {
            public void process(File file) {
                Date date = new Date(file.lastModified());
                try {
                    if(date.after(simpleDateFormat.parse("08/12/2021")))
                        System.out.println(file);
                } catch(ParseException e) {
                    System.out.println(e.getMessage());
                }
            }
        }, "java").start(args);

        System.out.println();

        /*

         */






    }
}

