package Task_5;

public class Queen extends Piece {
    public Queen() {
        super();
    }

    @Override
    public boolean isLegalMove(Position p1, Position p2) {

       if (Rook.isLegalMoveRook(p1, p2)){
          return true;
       }
       else return Bishop.isLegalMoveBishop(p1, p2);
    }
}
