public class CalcGPA {
    private String word;
    private int n;
    public CalcGPA( double num){
         n = (int)(5*(Math.floor(num/5)));
    }

    public String getWord() {
        switch (n)
        {

            case 95:
                word = "A";
                break;
            case 100:
                word = "A";
                break;
            case 90:
                word = "A-";
                break;

            case 85:
                word = "B+";
                break;

            case 80:
                word = "B";
                break;

            case 75:
                word = "B-";
                break;

            case 70:
                word = "C+";
                break;

            case 65:
                word = "C";
                break;

            case 60:
                word = "C-";
                break;

            case 55:
                word = "D+";
                break;

            case 50:
                word = "D";
                break;
            default:
                word =("He-he");
        }
        return word;
    }
}
