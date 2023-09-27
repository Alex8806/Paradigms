public class Game {
    GameBoard g = new GameBoard(3);
    Player p1 = new Player();
    Computer c1 = new Computer(p1);
    Boolean flag = false;
    public void start(){
        g.printBoard();
        while (!flag){
            p1.makeMove(g);
            g.printBoard();
            flag = g.checkForWin();
            if(flag){
                System.out.println("Player win");
                return;
            }
            if(g.isBoardFull()){
                System.out.println("Всё занято");
                return;
            }
            c1.makeMove(g);
            System.out.println("Ходит компьютер");
            g.printBoard();
            flag = g.checkForWin();
            if(flag){
                System.out.println("Computer win");
                return;
            }
            if(g.isBoardFull()){
                System.out.println("Всё занято");
                return;
            }


        }
    }

}
