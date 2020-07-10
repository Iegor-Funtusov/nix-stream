package ua.com.alevel.stream.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ua.com.alevel.stream.stream.create.CreateStream;
import ua.com.alevel.stream.stream.doubledot.A;
import ua.com.alevel.stream.stream.doubledot.B;
import ua.com.alevel.stream.stream.doubledot.C;
import ua.com.alevel.stream.stream.operations.IntermediateAndTerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class StreamApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamApplication.class, args);
        CreateStream createStream = new CreateStream();
//        createStream.createStream();
        new IntermediateAndTerminalOperations().run();


        List<A> aList = Arrays.asList(new A(), new A(), new A());

        List<B> bList = aList.stream().map(B::new).collect(Collectors.toList());

        List<C> cList = bList.stream().map(b -> new C(new A(), b)).collect(Collectors.toList());
    }
}
