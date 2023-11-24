import java.util.Random;
class DiceRollingGame {
    int[][] board = new int[10][10];
    int x = 0;
    int y=0;
    Random random = new Random();

    public  void DiceMoving() 
    {
         while (x != 9 || y != 9) 
         {
            int diceRoll = random.nextInt(6) + 1;
            printBoard(board, x, y);
            if (diceRoll == 1 && x < 9) 
            {
                x++;
            } 
            else if (diceRoll == 2 && x > 0) 
            {
                x--;
            } 
            else if (diceRoll == 3 && y < 9) 
            {
                y++;
            } 
            else if (diceRoll == 4 && y > 0) 
            {
                y--;
            } 
            else if (diceRoll == 5 && x < 9 && y < 9) 
            {
                x++;
                y++;
            } 
            else if (diceRoll == 6 && x > 0 && y > 0) 
            {
                x--;
                y--;
            }
        }

        printBoard(board,x,y);
    }
     void printBoard(int[][] board, int x, int y) 
     {
        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < 10; j++)
            {
                if (i == x && j == y) 
                {
                    System.out.print("x ");
                } 
                else 
                {
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
public class q3 {
    public static void main(String[] args) {
        DiceRollingGame drg = new DiceRollingGame();
        drg.DiceMoving();
    }
}
