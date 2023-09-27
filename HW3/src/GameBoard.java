public class GameBoard {
    private char[][] board;
    private int size;

    public char[][] getBoard() {
        return board;
    }

    public void setBoard(char[][] board) {
        this.board = board;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public GameBoard(int size) { //Новое поле
        this.size = size;
        this.board = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '_';
            }
        }
    }

    public void printBoard() { //печать поля
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(this.board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isCellEmpty(int row, int col) { //Проверить пустая ли ячека, чтобы сделать ход
        return board[row][col] == '_';
    }


    public boolean makeMove(int row, int col, char symbol) {
        if (isCellEmpty(row, col)) {
            board[row][col] = symbol;
            return true; // Ход выполнен успешно
        }
        return false;// Ход не выполнен успешно
    }

    public boolean checkForWin() {
        // Проверка по горизонталям
        for (int i = 0; i < size; i++) {
            if (board[i][0] != '_' && board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                return true;
            }
        }
        // Проверка по вертикалям
        for (int j = 0; j < size; j++) {
            if (board[0][j] != '_' && board[0][j] == board[1][j] && board[0][j] == board[2][j]) {
                return true;
            }
        }
        // Проверка по диагоналям только для поля 3 х 3
        if (board[0][0] != '_' && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return true;
        }
        if (board[0][2] != '_' && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isBoardFull() {// Все ли ячейки заняты
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == '_') {
                    return false;
                }
            }
        }
        return true;
    }
}

