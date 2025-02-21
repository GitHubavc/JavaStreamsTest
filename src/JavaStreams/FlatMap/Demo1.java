package JavaStreams.FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        //map()
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> list2=list1.stream().map(n->n+10).collect(Collectors.toList());
        System.out.println(list2);

        //map() -> if u have complex collection of data
        List<Integer> lst1=Arrays.asList(1,2);
        List<Integer> lst2=Arrays.asList(3,4);
        List<Integer> lst3=Arrays.asList(5,6);

        List<List<Integer>> finalList =Arrays.asList(lst1,lst2,lst3);
        List<Integer> finalResults=finalList.stream().flatMap(x->x.stream().map(n->n*2)).collect(Collectors.toList());
        System.out.println(finalResults);
    }
}
