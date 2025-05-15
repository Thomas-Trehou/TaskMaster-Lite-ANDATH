package fr.hb.taskmasterlite;

import java.util.Scanner;

public class App {
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
