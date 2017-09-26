package Task_5;

public class Knight extends Piece {
    public Knight() {
        super();
    }

    @Override
    public boolean isLegalMove(Position p1, Position p2) {
        int dx = Math.abs(p1.getCharPos() - p1.getCharPos());
        int dy = Math.abs(p2.getIntPos() - p2.getIntPos());
        if (dx * dy == 2) {
         return true;
        }
        else {
            return false;
        }
    }
}
