package JavaStreams.Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus","bicycle","flight","train");
        List<String> vehiclesUpper = new ArrayList<String>();
        //without streams
        for(String vehicle:vehicles){
            vehiclesUpper.add(vehicle.toUpperCase());
        }
        System.out.println("Without using streams "+vehiclesUpper);
        //with streams

        vehiclesUpper= vehicles.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
        System.out.println("With using streams "+vehiclesUpper);


    }
}
