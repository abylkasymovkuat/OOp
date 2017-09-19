package Task_5;

public class King extends Piece
    {
        public  King(String cur){
            super(cur);
        }
        @Override
        public boolean isLegalMove(String endPosition) {
            setTempCell(endPosition);
            if (Math.abs(x1-x2)<=1 && Math.abs(y1 - y2)<= 1)
                return  true;
            else {
               return false;
            }
        }
    }
