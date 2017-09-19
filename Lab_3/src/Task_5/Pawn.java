package Task_5;

public class Pawn extends  Piece {
    public Pawn(String curPosition) {
        super(curPosition);
    }

    @Override
    public boolean isLegalMove(String endPosition) {
       setTempCell(endPosition);
       if (y1 == '2'  && (y2-y1) == 2 || y1 !='2' && y2-y1 ==1)
       {
           return true;
       }
       else if ( y2-y1 == 1 && Math.abs(x2-x1) == 1) return true;
       else return false;


    }
}
