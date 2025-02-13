package JavaStreams.ParallelStreams;

import java.util.Arrays;
import java.util.List;

class Student{
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName(){
        return this.name;
    }
    public int getScore(){
        return this.score;
    }
}

public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<Student> studentList= Arrays.asList(
                new Student("David",82),
                new Student("Tom",90),
                new Student("Eric",55),
                new Student("Scott",48),
                new Student("Pam",78),
                new Student("Patty",98),
                new Student("Don",88),
                new Student("Rex",33)
        );

        //Using Stream
        studentList.stream()
                .filter(s->s.getScore()>80)
                .limit(3)
                .forEach(stu-> System.out.println(stu.getName()+" "+stu.getScore()));

        //Using Parallel Stream
        studentList.parallelStream()
                .filter(s->s.getScore()>80)
                .limit(3)
                .forEach(stu-> System.out.println(stu.getName()+" "+stu.getScore()));
        //convert stream->parallel stream

        studentList.stream().parallel()
                .filter(s->s.getScore()>80)
                .limit(3)
                .forEach(stu-> System.out.println(stu.getName()+" "+stu.getScore()));



    }

}
