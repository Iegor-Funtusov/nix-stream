package ua.com.alevel.stream.stream.operations;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Iehor Funtusov, created 10/07/2020 - 8:28 PM
 * <p>
 * -- No storage. A stream is not a data structure that stores elements; instead, it conveys elements from a source such as a data structure, an array, a generator function, or an I/O channel, through a pipeline of computational operations.
 * -- Functional in nature. An operation on a stream produces a result, but does not modify its source. For example, filtering a Stream obtained from a collection produces a new Stream without the filtered elements, rather than removing elements from the source collection.
 * -- Laziness-seeking. Many stream operations, such as filtering, mapping, or duplicate removal, can be implemented lazily, exposing opportunities for optimization. For example, "find the first String with three consecutive vowels" need not examine all the input strings. Stream operations are divided into intermediate (Stream-producing) operations and terminal (value- or side-effect-producing) operations. Intermediate operations are always lazy.
 * -- Possibly unbounded. While collections have a finite size, streams need not. Short-circuiting operations such as limit(n) or findFirst() can allow computations on infinite streams to complete in finite time.
 * -- Consumable. The elements of a stream are only visited once during the life of a stream. Like an Iterator, a new stream must be generated to revisit the same elements of the source.
 * <p>
 * link -- https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html
 **/

public class IntermediateAndTerminalOperations {

    private final Stream<Integer> stream1 = Stream.of(5, 1, 2, 3, 4, 5, 3, 7, 7, 7, 7, 7, 10);
    private final Stream<Integer> stream2 = Stream.of(5, 1, 2, 3, 4, 5, 3, 7, 7, 7, 7, 7, 10);
    List<String> strings = Arrays.asList("3", "6", "7", "9", "3", "6", "7", "9");
    List<String> strings1 = Arrays.asList("a", "b", "v", "c", "d", "e", "e", "f");

    public Integer print(Integer o) {
        System.out.println("o = " + o);
        return o;
    }

    public void run() {

        int[] random = IntStream.generate(() -> new Random().nextInt(1000)).limit(1000).toArray();
        List<Integer> list1 = Arrays.stream(random).boxed().collect(Collectors.toList());
//        List<Integer> list2 = list1;
//        List<Integer> list3 = list1;

        long start = System.currentTimeMillis();
        int sumParallel = list1.stream().parallel().mapToInt(Integer::intValue).sum();
        System.out.println("sumParallel = " + sumParallel);
        System.out.println("time sumParallel : " + (System.currentTimeMillis() - start));


//        start = System.currentTimeMillis();
//        int sumParallelStream = list2.parallelStream().mapToInt(Integer::intValue).sum();
//        System.out.println("sumParallelStream = " + sumParallelStream);
//        System.out.println("time sumParallelStream : " + (System.currentTimeMillis() - start));
//
//        start = System.currentTimeMillis();
//        int sumStream = list3.stream().mapToInt(Integer::intValue).sum();
//        System.out.println("sumStream = " + sumStream);
//        System.out.println("time sumStream : " + (System.currentTimeMillis() - start));



//        int sum = stream1.collect(Collectors.summingInt(integer -> integer % 2 == 0 ? integer : 0));
//
//        int sum1 = stream2.mapToInt(integer -> integer % 2 == 0 ? integer : 0).sum();
//
//        System.out.println("sum = " + sum);
//        System.out.println("sum1 = " + sum1);
//
//        long start = System.currentTimeMillis();

//        Integer max = stream1
//                .distinct()
//                .sorted()
//                .map(this::print)
//                .max(Integer::compareTo)
//                .get();
//
//        System.out.println("max = " + max);






//        List<String> strings12 = strings1
//                .stream()
//                .distinct()
//                .limit(3) // limit
//                .map(s -> s.concat("!!!!"))
//                .map(String::toUpperCase)
//                .collect(Collectors.toList());
//
//        System.out.println("strings1 = " + strings12);

//        boolean res = strings.stream().anyMatch(s -> s.equals("3"));

//        System.out.println("res = " + res);





//        int sum = strings.stream().skip(2).mapToInt(Integer::parseInt).filter(integer -> integer < 7).sum();  / skip
//        System.out.println("sum = " + sum);

//        List<Integer> list = stream1
//                .distinct()
//                .map(integer -> ++integer)
//                .map(integer -> integer * 2)
//                .map(integer -> integer / 3)
//                .distinct()
//                .sorted()
//                .collect(Collectors.toList());
//
//        System.out.println("list = " + list);


//        Integer first = stream1
//                .distinct()
//                .map(integer -> ++integer)
//                .map(integer -> integer * 2)
//                .map(integer -> integer / 3)
//                .distinct()
//                .sorted()
//                .findAny()
//                .get();
//
//        System.out.println("first = " + first);




//        IntStream range = IntStream.range(0, 1_000_000);
//        List<Integer> list = range.boxed().collect(Collectors.toList()); // range


//        int sum = stream1.distinct().filter(integer -> integer <= 7).sorted().mapToInt(Integer::intValue).sum();
//        System.out.println("sum = " + sum);

//        System.out.println("stream = " + stream.filter(integer -> integer <= 4).collect(Collectors.toList())); // filter
//        System.out.println("stream = " + stream.filter(integer -> integer <= 4).distinct().collect(Collectors.toList())); // distinct

//        List<Integer> list1 = stream1.filter(integer -> integer <= 7).distinct().sorted().collect(Collectors.toList());
//        System.out.println("stream 1 = " + (System.nanoTime() - start));
//        start = System.nanoTime();
//        List<Integer> list2 = stream2.distinct().filter(integer -> integer <= 7).sorted().collect(Collectors.toList());
//        System.out.println("stream 2 = " + (System.nanoTime() - start));

//        List<Integer> list1 = stream1
//                .distinct()
//                .filter(integer -> integer % 2 == 0)
//                .filter(integer -> integer >= 2)
//                .sorted()
//                .collect(Collectors.toList());
//
//        System.out.println("result 1 = " + (System.nanoTime() - start));
//
//        start = System.nanoTime();
//
//        List<Integer> list2 = stream2
//                .distinct()
//                .filter(integer -> integer % 2 == 0 && integer >= 2)
//                .sorted()
//                .collect(Collectors.toList());
//
//        System.out.println("result 2 = " + (System.nanoTime() - start));
//        System.out.println("list2 = " + list2);


//        Integer[] ints = new Integer[1_000_00];
//        int index = 0;
//        for (int i = 0 ; i < ints.length ; i++) {
//            index = (int) Math.floor(Math.random() * 100000);
//            ints[i] = index;
//        }
//
//        List<Integer> list2 = Stream.of(ints).distinct()
//                .filter(integer -> integer % 2 == 0 && integer >= 2)
//                .sorted()
//                .collect(Collectors.toList());
//
//        System.out.println("result 2 = " + (System.currentTimeMillis() - start));
//        System.out.println("list2 = " + list2);
    }
}
