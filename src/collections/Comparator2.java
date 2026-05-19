package collections;
import java.util.*;

class Student{
    String name;
    int age;
    double cgpa;
    public Student(String name, int age, double cgpa){
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }
}

public class Comparator2 {
    public static void main(String[] args){

        List<Student> ls = new ArrayList<>();
        ls.add(new Student("roshini", 19, 9.18));
        ls.add(new Student("sai", 25, 7.8));
        ls.add(new Student("karunya", 14, 8.9));
        ls.add(new Student("Sanjay", 19, 8.0));

        Comparator<Student> comp = new Comparator<Student>(){
            public int compare(Student s1, Student s2){
                // if(s1.age > s2.age) return 1;
                // if(s1.age < s2.age) return -1;
                // return -1;
                return Integer.compare(s1.age, s2.age);
            }
        };

        Collections.sort(ls, comp);
        for(Student s : ls){
            System.out.println(s.name + " got " + s.cgpa + " who is " + s.age + " years old");
        }
    }
}
