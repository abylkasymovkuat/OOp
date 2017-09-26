package Task_5;

public class Rook extends  Piece {


    public Rook() {
        super();
    }

    @Override
    public boolean isLegalMove(Position p1, Position p2) {
        return isLegalMove(p1, p2);
    }

    public static boolean isLegalMoveRook(Position p1, Position p2) {
        if(  p1.getIntPos()== p2.getIntPos() || p1.getCharPos()== p2.getCharPos())
        {
            return true;
        }
        else return false;
    }
}
