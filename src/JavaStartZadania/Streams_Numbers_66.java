package JavaStartZadania;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams_Numbers_66 {
    public static void main(String[] args) {

       Stream.iterate(0, x -> x+ 1)
                .filter(x -> (x >100)&&(x<1000)&&(x%5==0))
                .limit(10)
                .map(x->x*3)
                //.toArray()
       .forEach(System.out::println);
        System.out.println();
    }
}
