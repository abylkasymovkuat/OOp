package Task_5;

public class Knight extends Piece {
    public Knight(String curPosition) {
        super(curPosition);
    }

    @Override
    public boolean isLegalMove(String endPosition) {
      setTempCell(endPosition);
        int dx = Math.abs(x1 - x2);
        int dy = Math.abs(y1 - y2);
        if (dx * dy == 2) {
         return true;
        }
        else {
            return false;
        }
    }
}
