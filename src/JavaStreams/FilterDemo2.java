package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Madhu","Chandana","Pearly","Amit","Anu","Aarav");
        List<String> longNames =new ArrayList<String>();

        longNames=names.stream().filter(str->str.length()>3 && str.length()<7).collect(Collectors.toList());
        System.out.println(longNames);

        names.stream().filter(str->str.length()>3 && str.length()<7).forEach(str-> System.out.print(" "+str));



    }
}
