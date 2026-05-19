package streams;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.Optional;

public class OptionalInStreams {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Rshini", "Sirisha", "Kumar", "Karunya");

        String str = names.stream()
                        .filter(s -> s.contains("o"))
                        .findFirst()
                        .orElse("User Not Found");
        //'findFirst' method return an Optional<String> if the 'orElse' method is not applied.
        //'Optional' is used to handle null values
        System.out.println(str);



        Optional<String> op = names.stream()
                                .filter(s -> s.contains("o"))
                                .findFirst();

        System.out.println(op);
    }
}
