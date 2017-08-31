public class TriangleStar {

  private int num;

    public TriangleStar( int num)
    {

        this.num = num;
    }

     public String toString(){
        String str = "";
        for (int i = 0; i<num;i++)
        {
        for ( int j = 0 ; j < i+1; j++)
        {
            str =str.concat("[*] ");
        }
        str = str.concat("\n");

    }
         return str;
    }}

