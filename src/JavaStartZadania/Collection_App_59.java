package JavaStartZadania;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Collection_App_59 {
    private final static int EXIT = 0;
    private final static int NEW_TASK = 1;
    private final static int DO_TASK = 2;
    private static int option=-1;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Queue<Collections_Task_59> todoList = new PriorityQueue<>();

        do {
            try {
                printOptions();
                option = readOptions();
                switch (option) {
                    case 1: {
                        todoList.offer(addNewTask());
                        break;
                    }
                    case 2: {
                        System.out.println(todoList.peek());
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("Wybierz właściwą opcję.");
            }
        } while (option != 0);
        sc.close();
    }

    private static void printOptions() {
        System.out.println(NEW_TASK + " - Dodanie zadania");
        System.out.println(DO_TASK + " - Wykonaj zadanie o najwyższym priorytecie");
        System.out.println(EXIT + " - Wyjście z programu");
    }

    private static int readOptions() {
        int option = sc.nextInt();
        sc.nextLine();
        return option;
    }

    private static Collections_Task_59 addNewTask() {
        System.out.println("Podaj nazwę zadania: ");
        String name = sc.nextLine();
        System.out.println("Podaj opis zadania: ");
        String description = sc.nextLine();
        System.out.println("Wybierz priorytet zadania: (HIGH, MEDIUM, LOW)");
        String priorityString = sc.nextLine().toUpperCase();
        Collections_Task_59.Priority priority = Collections_Task_59.Priority.valueOf(priorityString);
        Collections_Task_59 newTask = new Collections_Task_59(name, description, priority);
        return newTask;
    }
//c.close();
}
