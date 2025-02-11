package JavaStreams.StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CountMinMax {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        //count()
        Long evenNum=numbersList.stream().filter(num->num%2==0).count();
        System.out.println("Total no of even numbers : " +evenNum);
        //min()
       Optional<Integer> minNumber= numbersList.stream().min((v1, v2)->{return v1.compareTo(v2);});
        System.out.println(minNumber.get());
        //max()
        Optional<Integer> maxNumber= numbersList.stream().max((v1, v2)->{return v1.compareTo(v2);});
        System.out.println(maxNumber.get());


    }
}
