package JavaStreams.StreamsMethods2;

import java.awt.event.ComponentAdapter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedDemo {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2,4,1,3,7,5,10,9,6,8);
        List<String> strList = Arrays.asList("Anu","Sura","Adi","Benjamin","Rony","Zid","Mathews");
        System.out.println("Before sorting Strings "+strList);
        System.out.println("Before sorting Integers "+list1);
        List<Integer> sortedList=list1.stream().sorted().collect(Collectors.toList());
        List<String> sortedString=strList.stream().sorted().collect(Collectors.toList());
        System.out.println("After sorting Integers "+sortedList);
        System.out.println("After sorting Strings "+sortedString);
        //To sort in Reverse order
        List<Integer> revList=list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<String> revStrList=strList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("After Reversing Integers order "+revList);
        System.out.println("After Reversing String order "+revStrList);

    }
}
