package JavaStreams.FlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    String name;
    int id;
    char grade;

    public Student(String name, int id, char grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
}

public class Demo3 {
    public static void main(String[] args) {
        List<Student> studentList1 = new ArrayList<Student>();
        studentList1.add(new Student("Smith",101,'A'));
        studentList1.add(new Student("Mary",102,'B'));
        studentList1.add(new Student("Arjun",103,'C'));

        List<Student> studentList2 = new ArrayList<Student>();
        studentList2.add(new Student("Amit",104,'B'));
        studentList2.add(new Student("Anu",105,'A'));
        studentList2.add(new Student("Aarav",106,'B'));

       List<List<Student>> studentMainList= Arrays.asList(studentList1,studentList2);
       //before Streams
        for(List<Student> s:studentMainList){
            for(Student stu:s){
                System.out.println(stu.name);
            }
        }
        //Using Streams Flat map
       List<String > nameList= studentMainList
               .stream()
               .flatMap(stuList->stuList.stream())
               .map(s->s.name)
               .collect(Collectors.toList());
        System.out.println(nameList);



    }
}
