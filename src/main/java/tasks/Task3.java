package tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {


    public static void main(String[] args) {

        System.out.println(Task3.regExp("aaabccddd"));
        System.out.println(Task3.regExp("baab"));


    }

    private static String regExp(String value) {
        Pattern pattern = Pattern.compile("([a-z])\\1");
        boolean flag = true;
        while (flag) {
            flag = false;
            Matcher m = pattern.matcher(value);
            if (m.find()) {
                flag = true;
                value = value.replaceAll("([a-z])\\1", "");
            }
        }
        return value;
    }


    // ВТОРОЙ КЕЙС НЕ ПРОХОДИТ
//       Scanner scanner = new Scanner(System.in);
//        char[] consoleInput = scanner.next().toCharArray();
//
//        for (int i = 0; i < consoleInput.length - 1; i++) {
//            if (consoleInput[i] == consoleInput[i + 1]) {
//                consoleInput[i] = ' ';
//                consoleInput[i + 1] = ' ';
//            }
//
//        }
//        System.out.println(new String(consoleInput).replaceAll("\\s", ""));


}
