package JavaStreams.StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ToArrayMethod {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("A","B","C","1","2","3");
        System.out.println(stringList);
        Object[] arr=stringList.stream().toArray();
        System.out.println(arr.length);
        for(String s:stringList){
            System.out.println("list is : "+s);
        }
        for(Object v:arr){
            System.out.println(v+" ");
        }
    }
}
