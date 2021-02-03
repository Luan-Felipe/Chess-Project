package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

    private final Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public ChessPosition getChessPosition() {
        return ChessPosition.fromPosiiton(position);
    }

    protected boolean isThereOpponentPiece(Position posiiton) {
        ChessPiece p = (ChessPiece) getBoard().piece(posiiton);
        return p != null && p.getColor() != color;
    }
}
