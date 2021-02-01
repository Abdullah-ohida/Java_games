package com.tic_tac_toe;

public class TicTacToe {

    private Board board;

    public TicTacToe(Board board) {
        this.board = new Board(3, 3);
    }

    public Board getBoard() {
        return board;
    }
}
