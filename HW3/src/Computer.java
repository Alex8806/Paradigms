import java.util.Scanner;
import java.util.Random;

public class Computer extends Gamers {

    public Computer(Gamers g) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите символ для компютера");
            char s = scanner.nextLine().charAt(0);
            if (g.getSymbol() == s) {
                System.out.println("Символ занят");
                continue;
            }
            this.setSymbol(s);
            return;
        }
    }

    public boolean makeMove(GameBoard board) {
        Random random = new Random();
        int row, col;
        do {
            row = random.nextInt(board.getSize()); // Генерируем случайную строку
            col = random.nextInt(board.getSize()); // Генерируем случайный столбец
        } while (!board.isCellEmpty(row, col)); // Повторяем, пока не найдем пустую ячейку
        return board.makeMove(row, col, getSymbol()); // Выполняем ход
    }
}
