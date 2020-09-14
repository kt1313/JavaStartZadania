package JavaStartZadania;

public class Tablica3x3_17 {
    public static void main(String[] args) {

        int totalSum = 0;
        double[][] array = new double[3][3];
        array[0][0] = 1.0;
        array[0][1] = 1.5;
        array[0][2] = 2.0;
        array[1][0] = 1.0;
        array[1][1] = 1.5;
        array[1][2] = 2.0;
        array[2][0] = 1.5;
        array[2][1] = 1.5;
        array[2][2] = 2.0;

        System.out.println("Suma iloczynów przekątnych: " + ((array[0][0]*array[1][1]*array[2][2])+(array[0][2]*array[1][1]*array[2][0])));
        System.out.println("Iloczyn sum sr. wiersza i sr. kolumny: " + ((array[1][0]+array[1][1]+array[1][2])*(array[0][1]+array[1][1]+array[2][0])));

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                totalSum +=array[i][j];
            }
        }
        System.out.println("Suma po krawędzi: " + (totalSum-array[1][1]));
    }
}
