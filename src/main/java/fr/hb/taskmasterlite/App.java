package fr.hb.taskmasterlite;

import java.util.Scanner;

/**
 * The <code>App</code> class is the main entry point for the command-line task manager application.
 */
public class App {
    /**
     * The main method of the application.
     * It allows users to add and list tasks via the console.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();

            if (input.startsWith("add ")) {
                String task = input.substring(4).replaceAll("^\"|\"$", "");
                manager.addTask(task);
            } else if (input.equals("list")) {
                manager.getAllTasks().forEach(System.out::println);
            } else if (input.equals("exit")) {
                break;
            }
        }
        scanner.close();
    }
}
