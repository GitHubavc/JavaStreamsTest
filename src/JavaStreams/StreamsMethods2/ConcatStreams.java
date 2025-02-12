package JavaStreams.StreamsMethods2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatStreams {
    public static void main(String[] args) {
        List<String> animalsList = Arrays.asList("Dog","Cat","rat");
        List<String> birdsList = Arrays.asList("Crow","Pigeon","Owl");

        Stream<String> stream1=animalsList.stream();
        Stream<String> stream2=birdsList.stream();

        List<String> finalList=Stream.concat(stream1,stream2).collect(Collectors.toList());
        System.out.println(finalList);

    }
}
