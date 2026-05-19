package streams;

import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class Student{
    private String name;
    private int age;

    public Student(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
}

public class ConstructorRef {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Roshini", "Sirisha", "Kumar");
        List<Student> students = new ArrayList<>();

        // for(String name : names){
        //     students.add(new Student(name));
        // }

        students = names.stream()
                        .map(Student::new)
                        .toList();

        students.forEach(student -> System.out.println(student.getName() + " " + student.getAge()));
    }
}
