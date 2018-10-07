package tasks;

import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.stream.IntStream;

public class Task1 {


    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10)

                .parallel()

                .forEach(val -> System.out.println(String.format("First test. Thread %s have unique id %s", val, getUniqueId())));
        System.out.println("-====================================-\n");
        IntStream.rangeClosed(1, 15)

                .parallel()

                .forEach(val -> System.out.println(String.format("Second test. Thread %s have unique id %s", val, getUniqueId())));

    }


    static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10, false,
            Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));


    private static int getUniqueId() {
        int uniqueId = 0;
        try {

            if (queue != null) { // один раз при запуске инициализируем очередь
                uniqueId = queue.take();
                queue.put(uniqueId);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return uniqueId;

    }
}
