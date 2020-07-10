package ua.com.alevel.stream.stream.create;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Iehor Funtusov, created 10/07/2020 - 8:26 PM
 */

public class CreateStream {

    public void createStream() {
        Collection<Integer> integers = Arrays.asList(1,2,3,4,5,3,7); // 1
        Stream<Integer> stream0 = integers.stream();

        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,3,7,7,7,7,7,10); // 2

        Integer[] integers1 = { 1,2,3,4,5,3,7,7,7,7,7,10 };
        Stream<Integer> stream2 = Arrays.stream(integers1); // 3

//        System.out.println("sort: " + stream2.sorted().distinct().collect(Collectors.toList()));

        File file = new File("test.txt");
        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.write("1");
            printWriter.write("2");
            printWriter.write("3");
            printWriter.write("4");
        } catch (IOException e) {
            System.out.println("e = " + e.getMessage());
        }
        System.out.println("file : " + file.getAbsolutePath());
        Stream<String> stream3 = null;
        try {
            stream3 = Files.lines(Paths.get(file.getAbsolutePath())); // 4
        } catch (IOException e) {
            e.printStackTrace();
        }

        Stream<Object> stream4 = Stream.builder() // 5
                .add(1)
                .add(2)
                .add(5)
                .add(3)
                .add(78)
                .add(8)
                .add(8)
                .add(8)
                .build();

        System.out.println("sort: " + stream4.sorted().distinct().collect(Collectors.toList()));
    }
}
