import task1.DirList;
import task10.FReader;
import task14.BFileOutput;
import task14.Comparing;
import task14.NBFileOutput;
import task6.ProcessFiles;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

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
        System.out.println("Enter data please(MM//dd//yyyy): ");
        //  08/12/2021
        String sDate = new Scanner(System.in).nextLine();

        new ProcessFiles(file -> {
            Date date = new Date(file.lastModified());
            try {
                if(date.after(simpleDateFormat.parse(sDate)))
                    System.out.println(file);
            } catch(ParseException e) {
                System.out.println(e.getMessage());
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


            System.out.println("Please enter file path" +
                    "after enter words, which you need find through a space (If you want end, enter 0)");
            FReader.readFileAndDisplayReverseOrder(new Scanner(System.in).nextLine(),FReader.readWords());




        System.out.println();

        /*
        Exercise 14: (2) Starting with BasicFileOutput.java, write a program that compares
        the performance of writing to a file when using buffered and unbuffered I/O.
         */

        System.out.println("Buffered: " + Comparing.comp(new BFileOutput()));
        System.out.println("UnBuffered: " + Comparing.comp(new NBFileOutput()));



        /*
        Exercise 24: (1) Modify IntBufferDemo.java to use doubles.
        ***********************in pack***************************
         */









    }
}

