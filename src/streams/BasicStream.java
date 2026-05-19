package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.stream.Stream;

public class BasicStream {
    public static void main(String[] args){
        List<Integer> al = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        //al.forEach(n -> System.out.print(n + " "));
        //Implementation in Detail
        // Consumer<Integer> con = new Consumer<Integer>(){
        //     public void accept(Integer n){
        //         System.out.print(n + " ");
        //     }
        // };
        // al.forEach(con);

        //'filter' method takes a predicate as a parameter and passes it to a method 'test' which returns a boolean value.
        // Predicate<Integer> p = new Predicate<Integer>(){
        //     public boolean test(Integer n){
        //         if(n % 2 == 0) return true;
        //         return false;
        //     }
        // };

        //Predicate is a functional interface (Lambda Expression)
        //Predicate<Integer> p = n -> n % 2 == 0;

        //'map' method uses a Function (Functional interface) to implement a method 'apply' and returns a stream of values
        // Function<Integer, Integer> fun = new Function<Integer, Integer>(){
        //     public Integer apply(Integer n){
        //         return n * 2;
        //     }
        // };

        //Lambda expression
        //Function<Integer, Integer> fun = n -> n * 2;

        Stream<Integer> s1 = al.stream()
                                .filter(n -> n % 2 == 0)
                                .map(n -> n * 2);
        System.out.println("Doubling the even numbers");
        s1.forEach(n -> System.out.print(n + " "));
        System.out.println();
        
        Stream<Integer> s2 = al.stream()
                            .filter(n -> n % 2 != 0)
                            .sorted();
        System.out.println("Sorting the Odd Numbers");
        s2.forEach(n -> System.out.print(n + " "));

    }
}
