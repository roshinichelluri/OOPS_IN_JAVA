package streams;

import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Stream2 {
    public static void main(String[] args){
        int size = 10000;

        List<Integer> ls = new ArrayList<>(size);
        Random ran = new Random();

        for(int i = 0; i < size; i++) ls.add(ran.nextInt(100));

        // int sum1 = ls.stream()
        //             .map(i -> i * 2)
        //             .reduce(0, (c, e) -> c + e);
        // System.out.println("Doubling and adding using 'map' and 'reduce' : " + sum1);

        long startSeq = System.currentTimeMillis();
        int sum2 = ls.stream()
                    .map(i -> i * 2)
                    .mapToInt(i -> i)
                    .sum();
        long endSeq = System.currentTimeMillis();
        System.out.println("Doubling and adding using 'mapToInt' and 'sum' : " + sum2 + "\nExecuted within " + (endSeq - startSeq) + " Seconds");

        long startPara = System.currentTimeMillis();
        int sum3 = ls.parallelStream()
                    .map(i -> i * 2)
                    .mapToInt(i -> i)
                    .sum();
        long endPara = System.currentTimeMillis();
        System.out.println("Doubling and adding using 'parallelStream' : " + sum3 + "\nExecuted within " + (endPara - startPara) + " Seconds");


    }
}
