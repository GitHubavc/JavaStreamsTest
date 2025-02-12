package JavaStreams.StreamsMethods2;

import java.util.HashSet;
import java.util.Set;

public class AnyAllNoneMatch {
    public static void main(String[] args) {
        Set<String> fruits= new HashSet<String >();
        fruits.add("one Mango");
        fruits.add("one Apple");
        fruits.add("two Apples");
        fruits.add("more Grapes");
        fruits.add("two Guavas");
        fruits.add("more Oranges");
        //AnyMatch
        boolean anyResult=fruits.stream().anyMatch(val->{return val.startsWith("one");});
        System.out.println("AnyMatch result is : "+anyResult);

        //AllMatch
        boolean allResult=fruits.stream().allMatch(val->{return val.startsWith("one");});
        System.out.println("AllMatch result is : "+allResult);

        //None Match
        boolean nonResult=fruits.stream().noneMatch(val->{return val.startsWith("one");});
        System.out.println("NoneMatch result is : "+nonResult);
    }
}
