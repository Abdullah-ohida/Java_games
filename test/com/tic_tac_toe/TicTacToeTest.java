package com.tic_tac_toe;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    TicTacToe ticTacToe;
    Board board;

    @BeforeEach
    void setUp() {
        board = new Board(3,3);
        ticTacToe = new TicTacToe(board);
    }

    @AfterEach
    void tearDown() {
        ticTacToe = null;
    }

    @Test
    void TicTacToe_hasABoard(){
        assertNotNull(ticTacToe.getBoard());
    }
}