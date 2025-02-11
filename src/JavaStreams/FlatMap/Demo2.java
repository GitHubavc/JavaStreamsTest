package JavaStreams.FlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        List<String> teamA= Arrays.asList("Scott","Sara","Linda");
        List<String> teamB= Arrays.asList("John","Ted","Patty");
        List<String> teamC= Arrays.asList("Sara","Pam","Patty");

        List<List<String>> playersInWorldCup = new ArrayList<List<String>>();

        playersInWorldCup.add(teamA);
        playersInWorldCup.add(teamB);
        playersInWorldCup.add(teamC);
        //Before Java 8
        for(List<String> team:playersInWorldCup){
            for(String name:team){
                System.out.println("Using old way " +name);
            }
        }
        //using stream flat map

        List<String> names=playersInWorldCup.stream().flatMap(pList->pList.stream()).collect(Collectors.toList());
        System.out.println(names);





    }
}
