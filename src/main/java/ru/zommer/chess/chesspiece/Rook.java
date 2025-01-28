package ru.zommer.chess.chesspiece;

import ru.zommer.chess.Cell;

/**
 * Ладья
 */
public class Rook extends ChessPiece {
    public Rook(String color, Cell position) {
        super(color, position);
    }

    @Override
    protected boolean canMoveToPosition(int dX, int dY) {
        return dX == 0 || dY == 0;
    }
}
