package Task_5;

public class Bishop extends Piece {

    public Bishop() {
        super();
    }

    @Override
    public boolean isLegalMove(Position p1, Position p2) {
        return isLegalMoveBishop(p1, p2);
    }

    public  static boolean isLegalMoveBishop(Position p1, Position p2) {
        if (Math.abs(p1.getCharPos()-p2.getCharPos()) == Math.abs(p1.getIntPos()-p2.getIntPos()))
            return true;
        return false;
    }

}
