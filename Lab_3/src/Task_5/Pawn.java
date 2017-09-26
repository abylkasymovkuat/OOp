package Task_5;

public class Pawn extends  Piece {
    public Pawn() {
        super();
    }

    @Override
    public boolean isLegalMove(Position p1, Position p2) {

        if (p1.getIntPos() ==2 && (p2.getIntPos()-p1.getIntPos()) == 2)
       {

           return true;
       }
       else if ( (p1.getIntPos() >2 && p1.getIntPos()< 8 && p1.getIntPos() -p2.getIntPos()==1)){
           return true;
       }
       else if ( p2.getIntPos() - p1.getIntPos()== 1 && Math.abs(p1.getCharPos()-p2.getCharPos()) == 1) return true;

       else return false;

    }
}
