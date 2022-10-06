package TicTacToe;

import TicTacToe.exception.TicTacToeException;

import static TicTacToe.Mark.E;

public class Player {
    private Mark mark;
    public Player(Mark mark){
        this.mark = mark;
    }
    public void playTicTacToe(int position, Board board){
       if(position < 1 ||position > 9) throw new ArrayIndexOutOfBoundsException("You can only play the numbers between 1 and 9");
       else{
           var boardSurface = board.getBoardSurface();
           int row = 0;
           int column = position-1;

           if(position > 3) {
               row = 1;
               column = position - 4;
           }
           if(position > 6) {
               row = 2;
               column = position - 7;
           }
           if( boardSurface[row][column] == E){
               boardSurface[row][column] = mark;
           }
           else throw new TicTacToeException("you can only play to empty position");
       }

    }


}
