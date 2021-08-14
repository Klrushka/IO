import task1.DirList;
import task10.FReader;
import task6.ProcessFiles;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        Exercise 7: (2) Open a text file so that you can read the file one line at a time. Read each
        line as a String and place that String object into a LinkedList. Print all of the lines in the
        LinkedList in reverse order.

        Exercise 8: (1) Modify Exercise 7 so that the name of the file you read is provided as a
        command-line argument.

        Exercise 10: (2) Modify Exercise 8 to take additional command-line arguments of words
        to find in the file. Print all lines in which any of the words match.
         */

        //E:\University\Programming\JavaDirectory\IO\src\testfiles\Test.txt

        try {
            System.out.println("Please enter file path" +
                    "after enter words, which you need find through a space (If you want end, enter 0)");
            FReader.readFileAndDisplayReverseOrder(new Scanner(System.in).nextLine(),FReader.readWords());

        } catch (IOException e){
            e.printStackTrace();
        }


        System.out.println();

        /*

         */









    }
}

