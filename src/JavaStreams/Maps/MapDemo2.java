package JavaStreams.Maps;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus","bicycle","flight","train");
        //without streams
        for(String vehicle:vehicles){
            System.out.println("without streams "+vehicle.length());
        }
        //with streams
        vehicles.stream().map(vname->vname.length()).forEach(len-> System.out.println("with streams "+len));

    }
}
