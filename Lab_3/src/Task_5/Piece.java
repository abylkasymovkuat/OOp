package Task_5;

public abstract class Piece {
    protected char x1, y1;
    protected char x2, y2;
    public Piece(String curPosition) {
        this.x1 = curPosition.charAt(0);
        this.y1 = curPosition.charAt(1);
    }
    public abstract boolean isLegalMove(String endPosition) ;
    public void setTempCell (String endPosition)
    {
        x2 = endPosition.charAt(0);
        y2 = endPosition.charAt(1);
    }

}
