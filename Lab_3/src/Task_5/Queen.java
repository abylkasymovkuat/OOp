package Task_5;

public class Queen extends Piece {
    public Queen(String curPosition) {
        super(curPosition);
    }

    @Override
    public boolean isLegalMove(String endPosition) {
        setTempCell(endPosition);
        if( x1 == x2 || y1 == y2)
        {
           return true;
        }
        else if (Math.abs(x1-x2) == Math.abs(y1-y2))
           return true;
        else return false;
    }
}
