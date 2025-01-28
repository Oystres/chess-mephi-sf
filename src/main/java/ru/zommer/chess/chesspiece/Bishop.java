package ru.zommer.chess.chesspiece;

import ru.zommer.chess.Cell;

/**
 * Слон
 */
public class Bishop extends ChessPiece {
    public Bishop(String color, Cell position) {
        super(color, position);
    }

    @Override
    protected boolean canMoveToPosition(int dX, int dY) {
        return Math.abs(dX) == Math.abs(dY);
    }
}
