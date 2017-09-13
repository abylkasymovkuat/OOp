package third;

public enum Gender {
    Boy('B'), Girl('G');

    public char asChar() {
        return asChar;
    }

    private final char asChar;

    Gender(char asChar) {
        this.asChar = asChar;
    }
}
