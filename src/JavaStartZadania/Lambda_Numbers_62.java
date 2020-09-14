package JavaStartZadania;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Lambda_Numbers_62 {
    public static void main(String[] args) {

        Random random = new Random();
        Supplier<Integer> supplier = () -> {
            int number;
            number = random.nextInt(49);
            return number;
        };
        List<Integer> numbers = generateRandomNumbers(10, supplier);
        consumeList(numbers, n -> System.out.print(n + " "));
        filterList(numbers, n->n%2==0);
        System.out.println(" ");
        consumeList(numbers, n->System.out.print(n + " "));
    }


    private static <T>List<T> generateRandomNumbers(int numbers, Supplier<T> supplier) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < numbers; i++) {
            result.add(supplier.get());
        }
        return result;
    }

    private static <T>void consumeList(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }

    private static <T> void filterList(List<T> list, Predicate<T> predicate) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            T tmp = it.next();
            if (predicate.test(tmp)) {
                it.remove();
            }
        }
    }
}
