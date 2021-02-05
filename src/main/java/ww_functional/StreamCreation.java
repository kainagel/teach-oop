package ww_functional;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class StreamCreation {

    public static void main(String[] args) {

        List<String> list = List.of("a", "b", "c");
        Stream<String> stream = list.stream();

        String[] array = {"a", "b", "c"};
        stream = Arrays.stream(array).parallel();

        IntStream range = IntStream.range(0, 10);

        stream = StreamSupport.stream(
                Spliterators.spliteratorUnknownSize(list.iterator(), Spliterator.IMMUTABLE), false
        );


        stream = Stream.concat(stream, Stream.of("d", "e", "f"));


    }

}
