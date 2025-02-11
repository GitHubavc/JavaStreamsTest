package JavaStreams.Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    int empId;
    String empName;
    int salary;

    public Employee(int empId, String empName, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
}

public class MapFilterDemo {
    public static void main(String[] args) {
        List<Employee> empList= Arrays.asList(
                new Employee(101,"Alex", 10000),
                new Employee(103,"Arjot",20000),
                new Employee(104,"Sumit",25000),
                new Employee(106,"Ani",30000),
                new Employee(107,"Anu",35000));

        //collection->Stream->Filter->map->collect
        //Combination of filter and map
        //take every salary --- if sal>20k---add to some other collection

        List<Integer> empSalList= empList.stream().filter(e->e.salary>20000).map(e->e.salary).collect(Collectors.toList());
        System.out.println(empSalList);
        empList.stream().filter(e->e.empName.length()>3).map(e->e.empName).forEach(emp-> System.out.println(emp));







    }

}
