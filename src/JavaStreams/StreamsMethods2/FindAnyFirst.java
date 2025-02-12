package JavaStreams.StreamsMethods2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyFirst {
    public static void main(String[] args) {
        List<String> stringList= Arrays.asList("two","three","four");
        //findAny
        Optional<String> ele=stringList.stream().findAny();
        System.out.println(ele.get());
        //findFirst
        Optional<String> ele1=stringList.stream().findFirst();
        System.out.println(ele1.get());

    }
}
