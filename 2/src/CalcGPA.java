public class CalcGPA {
    private String word = "";
    private int n;
    public CalcGPA( double num){
        word = word.concat("A A-B+B B-C+C C-D+D D-");
        n = (int)(5*(Math.floor(num/5)));
    }
    public String getWord()
    {
        if (n == 100) return word = "A";
        else return  word = word.substring((95-n)*2/5,(95-n)*2/5+2);
    }
}
