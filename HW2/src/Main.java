//Задача
//        Написать скрипт в любой парадигме, который выводит на экран таблицу умножения всех чисел от 1 до n.
//        Обоснуйте выбор парадигм.

import java.util.Scanner;

// Т.к. задание простое, и не предполагает переиспользование кода, то можно использовать структурную парадигму

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите значение n для таблицы умножения: ");
            int n = scanner.nextInt();
            if (n < 1) {
                throw new RuntimeException("n должно быть больше или равно 1.");
            }
            System.out.println("Таблица умножения от 1 до " + n + ":");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(i + "*" + j + "=" + i * j + "\t");
                }
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println("Ошибка! " + e.toString());
            ;
        }
    }
}