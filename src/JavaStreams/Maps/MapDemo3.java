package JavaStreams.Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {
    public static void main(String[] args) {
        List<Integer> numbersList= Arrays.asList(2,4,6,7,8,1);
        List<Integer> mulList = new ArrayList<Integer>();
        //Before Streams
        for(Integer num:numbersList){
            //System.out.println(num*3);
            mulList.add(num*3);
        }
        System.out.println("Before Streams: "+mulList);
        //After Streams
       mulList= numbersList.stream().map(num->num*3).collect(Collectors.toList());
        System.out.println("After Streams: "+mulList);

        numbersList.stream().map(num->num*3).forEach(i-> System.out.print(" "+i));

    }
}
