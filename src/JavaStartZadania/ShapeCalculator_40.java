package JavaStartZadania;

import java.util.NoSuchElementException;
import java.util.Scanner;

class ShapeCalculator_40 {
    public static void main(String[] args) {

        int shape;
        System.out.println("Wybierz kształt: \n1 - Prostokąt \n2 - Koło \n3 - Trójkąt ");
        Scanner sc = new Scanner(System.in);
        do {
            shape = sc.nextInt();
            switch (shape) {
                case 1:
                    chooseShape(1);
                    break;
                case 2:
                    chooseShape(2);
                    break;
                case 3:
                    chooseShape(3);
                    break;
                default:
                    System.out.println("Ponów wybór.");
            }
        } while ((shape != 1 && shape != 2 && shape != 3));
        sc.close();
    }

    static void chooseShape(int shape) {
        Scanner scanner = new Scanner(System.in);
        switch (shape) {
            case 1: {
                double a, b;
                System.out.println("Wybrałeś prostokąt, podaj dwa boki: ");
                System.out.print("a = ");
                a = scanner.nextDouble();
                System.out.print("b = ");
                b = scanner.nextDouble();
                Shape_40 rectangle = new ShapeRectangle_40(a, b);
                double area = rectangle.calculateArea();
                double perimeter = rectangle.calculatePerimeter();
                String result = rectangle.toString();
                //System.out.println("Pole: " + area + ", obwód: " + perimeter);
                System.out.println(result);
                break;
            }
            case 2: {
                double r;
                System.out.println("Wybrałeś koło, podaj promień: ");
                System.out.println("r = ");
                r = scanner.nextDouble();
                Shape_40 circle = new ShapeCircle_40(r);
                circle.calculateArea();
                circle.calculatePerimeter();
                circle.toString();
                break;
            }
            case 3: {
                double a, b, c, h;
                System.out.println("Wybrałeś trójkąt, podaj trzy boki i wysokość: ");
                System.out.print("a = ");
                a = scanner.nextDouble();
                System.out.print("\nb = ");
                b = scanner.nextDouble();
                System.out.print("\nc = ");
                c = scanner.nextDouble();
                System.out.println("\nh = ");
                h = scanner.nextDouble();
                Shape_40 triangle = new ShapeTriangle_40(a, b, c, h);
                triangle.calculatePerimeter();
                triangle.calculateArea();
                triangle.toString();
                break;
            }
            default:
                throw new NoSuchElementException();
        }

    }
}
