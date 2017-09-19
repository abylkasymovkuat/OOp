package Task_5;

public class Bishop extends Piece {
    public Bishop(String curPosition) {
        super(curPosition);
    }

    @Override
    public boolean isLegalMove(String endPosition) {
        setTempCell(endPosition);
        if (Math.abs(x1-x2) == Math.abs(y1-y2))
            return true;
        else return false;
    }
}
