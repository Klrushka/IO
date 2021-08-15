package task10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FReader {

    public static void readFileAndDisplayReverseOrder(String path, LinkedHashSet<String> words) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        List<String> list = new LinkedList<>();
        String tempString;
        Pattern pattern = Pattern.compile(regex(words));
        Matcher matcher = pattern.matcher("");


        while ((tempString = bufferedReader.readLine()) != null) {
            if (matcher.reset(tempString).find()) {
                list.add(tempString);
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static LinkedHashSet<String> readWords() {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<String> set = new LinkedHashSet<>();
        String temp;
        while (!(temp = scanner.nextLine()).equals("0")) {
            set.add(temp);
        }
        return set;

    }

    private static String regex(LinkedHashSet<String> set) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < set.size(); i++) {
            if (i != set.size() - 1) {
                buffer.append(".*").append(set.toArray()[i]).append(".*|");
            } else buffer.append(".*").append(set.toArray()[i]).append(".*");
        }
        return buffer.toString();
    }

}
