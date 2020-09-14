package JavaStartZadania;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class ReferencesToMethods_Names_64 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Jan", "Karol", "gucio", "Aga", "Zofija");
        names.sort(String::compareToIgnoreCase);
        names.forEach(System.out::println);
    }
}
