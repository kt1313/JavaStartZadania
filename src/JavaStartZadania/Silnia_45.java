package JavaStartZadania;

public class Silnia_45 {
    static int result = 1;

    public static void main(String[] args) {
        //n!=1*2*3*..*(n-1)!*n
        System.out.println("silnia 3: " + silnia(3));
    }

    static int silnia(int n) {
        return n > 1 ? n * silnia(n - 1) : 1;
    }

}

