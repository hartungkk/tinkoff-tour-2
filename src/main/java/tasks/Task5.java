package tasks;

import java.util.*;
import java.util.stream.Collectors;

public class Task5 {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    public static void main(String[] args) {
        Task5.firstExample();
        Task5.secondExample();
    }

    public static void firstExample() {
        List<String> refkeys = Arrays.asList("A", "B", "C", "D");
        List<String> keysDB = Arrays.asList("A", "B", "C", "D", "E");

        System.out.println("DB have some keys: " + keysDB.stream().filter(x -> !refkeys.contains(x)).collect(Collectors.toList()));
        System.out.println("Ref keys: " + refkeys.stream().filter(x -> !keysDB.contains(x)).collect(Collectors.toList()));

    }

    public static void secondExample() {
        List<String> refkeys = Arrays.asList("A", "B", "C", "D");
        List<String> keysDB = Arrays.asList("A", "B", "C", "E");
        System.out.println("DB have some keys: " + keysDB.stream().filter(x -> !refkeys.contains(x)).collect(Collectors.toList()));
        System.out.println("Ref keys: " + refkeys.stream().filter(x -> !keysDB.contains(x)).collect(Collectors.toList()));
    }
}
