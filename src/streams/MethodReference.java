package streams;

import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;

public class MethodReference {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Roshini", "Devi", "Chelluri");
        names = names.stream()
                            .map(String::toUpperCase)
                            .toList();
        names.forEach(System.out::println);
    }
}
