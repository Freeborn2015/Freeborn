package TicTacToe;

import static TicTacToe.Mark.*;

public class Board {
    private boolean isWinner;
 private Mark[][] boardSurface= {{E,E,E},{E,E,E},{E,E,E,}};


 public void displayBoardSurface(){
     for(int i=0;i<3;i++){
         System.out.print("| ");
         for (int j=0;j<3;j++){
             System.out.print(boardSurface[i][j]);
             System.out.print(" | ");
         }
         System.out.println();
         System.out.println(" --  --  --");

     }


     }
     public Mark[][] getBoardSurface() {
        return boardSurface;
    }
    public boolean isAWinner(){
     if(checkWinnerAcrossRowZero()) return true;
     if(checkWinnerAcrossRowOne()) return true;
     if(checkWinnerAcrossRowTwo()) return true;
     if(checkWinnerAcrossColumnZero()) return true;
     if(checkWinnerAcrossColumnOne()) return true;
     if(checkWinnerAcrossColumnTwo()) return true;
     if(checkWinnerAcrossBackwardDiagonal())return true;
     if(checkWinnerAcrossForwardDiagonal()) return true;
     else return false;
    }

    private boolean checkWinnerAcrossRowZero(){
     boolean isX = (boardSurface[0][0] == X && boardSurface[0][1] == X && boardSurface[0][2] == X);
     boolean isO = (boardSurface[0][0] == O && boardSurface[0][1] == O && boardSurface[0][2] == O);
     if(isX || isO) return true;
     else return false;
    }
    private boolean checkWinnerAcrossRowOne(){
     boolean isX =(boardSurface[1][0] == X && boardSurface[1][1]== X && boardSurface[1][2]==X);
     boolean isO =(boardSurface[1][0] == O && boardSurface[1][1]== O && boardSurface[1][2]==O);
     if(isX || isO) return true;
     else return false;
    }
    private boolean checkWinnerAcrossRowTwo(){
     boolean isX = (boardSurface[2][0] == X && boardSurface[2][1] == X && boardSurface[2][2] == X);
     boolean isO = (boardSurface[2][0] == O && boardSurface[2][1] == O && boardSurface[2][2] == O);
     if (isX || isO) return true;
     else return false;
    }
    private boolean checkWinnerAcrossColumnZero(){
     boolean isX = (boardSurface[0][0] == X && boardSurface[1][0] == X && boardSurface[2][0] == X);
     boolean isO = (boardSurface[0][0] == O && boardSurface[1][0] == O && boardSurface[2][0] == O);
     if(isX || isO) return true;
     else return false;
    }
    private boolean checkWinnerAcrossColumnOne(){
    boolean isX = (boardSurface[0][1] == X && boardSurface[1][1] == X && boardSurface[2][1] == X);
    boolean isO = (boardSurface[0][1] == O && boardSurface[1][1] == O && boardSurface[2][1] == O);
     if(isX || isO) return true;
     else return false;
    }
    private boolean checkWinnerAcrossColumnTwo(){
        boolean isX = (boardSurface[0][2] == X && boardSurface[1][2] == X && boardSurface[2][2] == X);
        boolean isO = (boardSurface[0][2] == O && boardSurface[1][2] == O && boardSurface[2][2] == O);
        if(isX || isO) return true;
        else return false;
    }
    private boolean checkWinnerAcrossBackwardDiagonal(){
     boolean isX = (boardSurface[0][0] == X && boardSurface[1][1] ==X && boardSurface[2][2] == X);
     boolean isO = (boardSurface[0][0] == O && boardSurface[1][1] ==O && boardSurface[2][2] == O);
     if(isX || isO)return true;
     else return false;
    }
    private boolean checkWinnerAcrossForwardDiagonal(){
        boolean isX = (boardSurface[2][0] == X && boardSurface[1][1] ==X && boardSurface[0][2] == X);
        boolean isO = (boardSurface[2][0] == O && boardSurface[1][1] ==O && boardSurface[0][2] == O);
        if(isX || isO)return true;
        else return false;
    }
    public void checkTile(){

    }
}

