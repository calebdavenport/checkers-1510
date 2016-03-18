/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkers.pkg1510;


/**
 *
 * @author rmartin-
 */
public class Board {

    public Square board[][] = new Square[8][8];
    // Squares are counted from bottom left to top right.
    // in indexing, first element is row, second is column: [row][column]

    public enum Square {
        
        invalid(-2, null, null, null, false),
        empty(-1, null, null, false, true),
        blackSerf(0, false, false, true, true),
        redSerf(1, true, false, true, true),
        blackKing(2, false, true, true, true),
        redKing(3, true, true, true, true);

        private final double rawNumber;   // number representing state
        private final Boolean isRed; // f=black t=red Null=empty
        private final Boolean isKing; // f=not_king t=king Null=empty
        private final Boolean isOccupied; // f=empty t=occupied Null=invalid
        private final Boolean isValid; // f=invalid, t=valid

        Square(double rawNumber, Boolean isRed, Boolean isKing, Boolean isOccupied,
                Boolean isValid) {
            this.rawNumber = rawNumber;
            this.isRed = isRed;
            this.isKing = isKing;
            this.isOccupied = isOccupied;
            this.isValid = isValid;
        }

        public double rawNumber() { return rawNumber; }
        public Boolean isRed() { return isRed; }
        public Boolean isKing() { return isKing; }
        public Boolean isOccupied() { return isOccupied; }
        public Boolean isValid() { return isValid; }
        
    }
    
    /**
     * Loads board into program variables from text file
     * @auth Roan
     * 
     * @param path path to setup file
     */
    public void setupBoard(/*String path*/) {
        //Initialize board as empty, but with invalid and valid squares
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i + j % 2 == 1) {
                    board[i][j] = Square.invalid;
                }
                else {
                    board[i][j] = Square.empty;
                }
            }
        }
    }
    
    /**
     * Returns the state of an given square
     * @auth Caleb
     * 
     * @return state of the square as int (perhaps enum)
     */
    public Square coord(int x, int y) {
        return board[x][y];
    }
    
    /**
     * Edits a piece at a given square to be a king
     * @auth Ashley
     * 
     * @param square location to find and king a piece
     */
    public void kingPiece(int[] square) {
        // if x==0 black is a king
        //if x==7 red is a king
        /*if (//space you want to move to x !=0)
        board[//space you want to move to] = 1
        else
        board[//space you want to move to] = 1 * 3 //king multiplyer*/
    } 
    
}
