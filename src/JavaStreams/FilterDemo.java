package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
    public static void main(String[] args) {
       /*
       ArrayList<Integer> numbersList= new ArrayList<Integer>();
        numbersList.add(10);
        numbersList.add(15);
        numbersList.add(20);
        numbersList.add(25);
        numbersList.add(30);
        numbersList.add(35);

        */

        List<Integer> numbersList= Arrays.asList(10,15,20,25,30,35,40,45,50);
        List<Integer> evenNumbersList= new ArrayList<Integer>();
        //without using streams
        for (int n:numbersList){
            if(n%2==0)
                evenNumbersList.add(n);
        }
        System.out.println("Without Streams "+evenNumbersList);

        //with streams
        evenNumbersList=numbersList.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println("Using Streams "+evenNumbersList);

        //using foreach
        numbersList.stream().filter(n->n%2==0).forEach(n-> System.out.print(" "+n));

    }
}
