package JavaStreams.StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//NonTerminal methods : distinct(),limit()
//Terminal methods : count(),foreach()

public class DistinctCountLimit {
    public static void main(String[] args) {
        List<String > vehicleList= Arrays.asList("car","bike","scooter","car",
                "ship","aeroplane","boat","bike");
        //distinct
        List<String> distinctVehicles= vehicleList.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctVehicles);
        vehicleList.stream().distinct().forEach(s-> System.out.print(s+" "));
        System.out.println();
        //count
        long count=vehicleList.stream().distinct().count();
        System.out.println(count);
        //limit
        List<String> limitList=vehicleList.stream().limit(3).collect(Collectors.toList());
        System.out.println(limitList);

    }
}
