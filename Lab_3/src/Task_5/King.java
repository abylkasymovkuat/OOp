package Task_5;

public class King extends Piece
    {
        public  King(){
            super();
        }
        @Override
        public boolean isLegalMove(Position p1, Position p2) {
            if (Math.abs(p1.getCharPos()-p2.getCharPos())<=1 && Math.abs(p1.getIntPos() - p2.getIntPos())<= 1)
                return  true;
            else {
               return false;
            }
        }
    }
