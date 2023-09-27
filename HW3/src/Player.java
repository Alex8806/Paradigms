import java.util.Scanner;

public class Player extends Gamers {
    Scanner scanner = new Scanner(System.in);


    public Player() {
        System.out.print("Введите ваш символ");
        char s = scanner.nextLine().charAt(0);
        this.setSymbol(s);
    }


    public boolean makeMove(GameBoard board) {

        int row, col;

        while (true) {
            System.out.print("Введите номер строки (1-" + board.getSize() + "): ");
            row = scanner.nextInt() - 1; // вычитаем 1, так как массивы начинаются с 0
            System.out.print("Введите номер столбца (1-" + board.getSize() + "): ");
            col = scanner.nextInt() - 1;

            if (row >= 0 && row < board.getSize() && col >= 0 && col < board.getSize()) {
                if (board.makeMove(row, col, getSymbol())) {// Выполняем ход
                    return true; // Ход выполнен успешно
                } else{
                    System.out.println("Эта ячейка уже занята. Пожалуйста, выберите другую.");
                }
            } else {
                System.out.println("Неверные координаты. Пожалуйста, введите числа от 1 до " + board.getSize());
            }
        }
    }
}