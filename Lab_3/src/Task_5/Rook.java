package Task_5;

public class Rook extends  Piece {

    public Rook(String curPosition) {
        super(curPosition);
    }
    @Override
    public boolean isLegalMove(String endPosition) {
        setTempCell(endPosition);
        if( x1 == x2 || y1 == y2)
        {
            return true;
        }
        else return false;
    }
}
