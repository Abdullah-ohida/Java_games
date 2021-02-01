package com.tic_tac_toe;

public class Board {
    private gamePiece[][] board;

    public Board(int numberOfRow, int numberOfColumn) {
        this.board = new gamePiece[numberOfRow][numberOfColumn];
    }

}
