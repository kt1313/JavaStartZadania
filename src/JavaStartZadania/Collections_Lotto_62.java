package JavaStartZadania;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_Lotto_62 {
    private static final Integer maxNumbers = 6;
    private static final Integer totalNumbers = 49;
    List<Integer> numbers = new ArrayList<>();
    public static List<Integer> resultNrs;

    Collections_Lotto_62() {
        generate(numbers);
        randomize(numbers);
    }

    public static List<Integer> getLottoResults() {
        return resultNrs;
    }

    public static Integer getMaxNumbers() {
        return maxNumbers;
    }

    private static void generate(List<Integer> numbers) {
        for (int i = 1; i < (totalNumbers); i++) {
            numbers.add(i);
        }
    }

    static void randomize(List<Integer> numbers) {
        Collections.shuffle(numbers);
        resultNrs = numbers.subList(0, 6);
    }
    int compareResult(List<Integer> customerNrs) {
        int shot = 0;
        for (int i = 0; i < Collections_Lotto_62.getMaxNumbers(); i++) {
            if (resultNrs.contains(customerNrs.get(i))) {
                shot++;
            }
        }
        return shot;
    }

    @Override
    public String toString() {
        return "Numery: " + numbers.subList(0,6);
    }
}
