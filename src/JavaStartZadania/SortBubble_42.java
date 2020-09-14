package JavaStartZadania;

import static com.sun.tools.javac.jvm.ByteCodes.swap;

class SortBubble_42 {
    public static void main(String[] args) {

        int n = 0;
        int[] numberArray = {
                23, 45, 2, 52, 89, 32, 6, 5};


        Sortable_42 sortable = new Sortable_42() {

            @Override
            public void sort(int[] tab) {

                int n = numberArray.length;
                do {
                    for (int j = 0; j < (n - 1); j++) {
                        for (int i = 1; i < n; i++) {
                            if (numberArray[i - 1] > numberArray[i]) {
                                int temp = numberArray[i - 1];
                                numberArray[i - 1] = numberArray[i];
                                numberArray[i] = temp;
                            }
                        }
                    }n = n - 1;

                } while (n > 1);
            }
        };
        printData(numberArray);
        System.out.println();
        System.out.println(numberArray.length);
        sortable.sort(numberArray);
        printData(numberArray);
    }

    public static void printData(int[] array) {
        for (int s : array) {
            System.out.print(s + " ");
        }
    }
}
