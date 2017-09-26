package Task_5;

public class Position {
    private char charPos;
    private int intPos;
    public Position( String position){
        setCharPos(position.charAt(0));
        setIntPos(Integer.parseInt(String.valueOf(position.charAt(1))));
    }
    public void setCharPos(char charPos) {

        this.charPos = charPos;
    }

    public char getCharPos() {
        return charPos;
    }

    public int getIntPos() {
        return intPos;
    }

    public void setIntPos(int intPos) {
        this.intPos = intPos;
    }
}
