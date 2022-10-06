package TicTacToe;

import TicTacToe.exception.TicTacToeException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static TicTacToe.Mark.*;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
   private Player player1;
   private Player player2;
    private Board board;

    @BeforeEach
    void setUp() {
        player1 = new Player(X);
        player2 = new Player(O);
        board = new Board();
    }
    @Test
    void testPlayer1AndPlayer2Exist(){
        assertNotNull(player1);
        assertNotNull(player2);
        assertNotNull(board);

    }
    @Test
    void boardCanBeDisplay(){
        board.displayBoardSurface();
    }
    @Test
    void testThatXAppearsOnThePositionPlayer1PlaysTo(){
        player1.playTicTacToe(3, board);
        var boardSurface = board.getBoardSurface();
         assertEquals(X,boardSurface[0][2]);
         board.displayBoardSurface();

    }
    @Test
    void testThatOAppearsOnThePositionPlayer2PlaysTo() {
        player2.playTicTacToe(5, board);
        var boardSurface = board.getBoardSurface();
        assertEquals(O, boardSurface[1][1]);
        board.displayBoardSurface();
    }
    @Test
    void testThatXAppearsOnThePlayer1PositionAndOAppearsOnThePlayer2position(){
        var boardSurface = board.getBoardSurface();
        player1.playTicTacToe(3,board);
        player2.playTicTacToe(1,board);
        assertEquals(X, boardSurface[0][2]);
        assertEquals(O, boardSurface[0][0]);
        board.displayBoardSurface();

    }
    @Test
    void testThatPlayerCanOnlyPlayToEmptyPosition() {
        var boardSurface = board.getBoardSurface();
        player1.playTicTacToe(5, board);
        assertThrows(TicTacToeException.class, () -> player2.playTicTacToe(5, board));
        assertEquals(X, boardSurface[1][1]);
    }
    @Test
    void testThatPlayersCanOnlyPlayToPositionsOnTheBoard(){
        assertThrows(ArrayIndexOutOfBoundsException.class,()->player1.playTicTacToe(10, board));
        //player1.playTicTacToe(10,board);

    }
    @Test
    void testThatTrueIsReturnedIfThereIsAWinnerInRowZero(){
       player1.playTicTacToe(1,board);
       player1.playTicTacToe(2,board);
       player1.playTicTacToe(3,board);
       assertTrue(board.isAWinner());
    }
    @Test
    void testThatTrueIsReturnedIfThereIsAWinnerInRowOne(){
        player1.playTicTacToe(4,board);
        player1.playTicTacToe(5,board);
        player1.playTicTacToe(6,board);
        assertTrue(board.isAWinner());
    }
    @Test
    void testThatTrueIsReturnedIfThereIsAWinnerInRowTwo(){
        player1.playTicTacToe(7,board);
        player1.playTicTacToe(8,board);
        player1.playTicTacToe(9,board);
        assertTrue(board.isAWinner());
    }
    @Test
    void testThatTrueIsReturnedIfThereIsAWinnerInColumnZero(){
        player1.playTicTacToe(1,board);
        player1.playTicTacToe(4,board);
        player1.playTicTacToe(7,board);
        assertTrue(board.isAWinner());
    }
    @Test
    void testThatTrueIsReturnedIfThereIsAWinnerInColumnOne(){
        player1.playTicTacToe(2,board);
        player1.playTicTacToe(5,board);
        player1.playTicTacToe(8,board);
        assertTrue(board.isAWinner());
    }
    @Test
    void testThatTrueIsReturnedIfThereIsAWinnerInColumnTwo(){
        player1.playTicTacToe(3,board);
        player1.playTicTacToe(6,board);
        player1.playTicTacToe(9,board);
        assertTrue(board.isAWinner());
    }
    @Test
    void testThatTrueIsReturnedIfThereIsAWinnerInBackwardDiagonal(){
        player1.playTicTacToe(1,board);
        player1.playTicTacToe(5,board);
        player1.playTicTacToe(9,board);
        assertTrue(board.isAWinner());
    }
    @Test
    void testThatTrueIsReturnedIfThereIsAWinnerInForwardDiagonal(){
        player1.playTicTacToe(3,board);
        player1.playTicTacToe(5,board);
        player1.playTicTacToe(7,board);
        assertTrue(board.isAWinner());
        board.displayBoardSurface();

    }

}

