package tasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Если рассматривать что у одной колонки может быть только одно значение, то
 **/

public class Task2 {
    public static void main(String[] args) {

        Task2.example("column1", "33");

    }


    private static void Stackoverlow() {
        Path path = Paths.get("C:/Users/kogartun/IdeaProjects/tasks01/src/main/resources/file.txt");

        Stream<String> lines = null;
        try {
            lines = Files.lines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String, String> resultMap =
                lines.map(line -> line.split(";"))
                        .collect(Collectors.toMap(a -> a[0], a -> a[1]));


        lines.close();
        System.out.println(resultMap);
        ;


    }

    private static void Stackoverlow2() {
        String delimiter = ";";
        Path path = Paths.get("C:/Users/kogartun/IdeaProjects/tasks01/src/main/resources/file.txt");

        Map<String, String> map = new HashMap<>();

        try (Stream<String> lines = Files.lines(path)) {
            lines.filter(line -> line.contains(delimiter)).forEach(
                    line -> map.putIfAbsent(line.split(delimiter)[0], line.split(delimiter)[1])
            );
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(map);
    }

    private static void example(String column, String value) {
        Path path = Paths.get("C:/Users/kogartun/IdeaProjects/tasks01/src/main/resources/file.txt");
        final String delimeters = ";";
        try {
            List<String> lines = Files.readAllLines(path);

            int index = Arrays.asList(lines.get(0).split(delimeters)).indexOf(column);

            String[] values = lines.get(1).split(delimeters);
            values[index] = value;
            lines.remove(1);
            lines.add(String.join(delimeters, values));
            Files.write(path, lines);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
