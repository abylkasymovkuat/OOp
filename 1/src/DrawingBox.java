public class DrawingBox {
    String name;
    char [][] a;
    public DrawingBox( String name)
    {
        a = new char[3][name.length()+2];
        this.name = name;
        for ( int i =0 ; i<a.length;i++)
        {
            for ( int j = 0; j<a[i].length; j++)
            {
                if ( i == 0 && j == 0 || i == 2 && j == 0 || i == 0 && j == a[i].length-1 || i == 2 && j == a[i].length-1)

                {
                    a[i][j] = '+';
                }
                else if ( i == 1)
                {
                    if ( j == 0 || j == a[i].length-1)
                    {
                        a[i][j] = '|';
                    }
                    else
                    {
                        a[i][j] = name.toCharArray()[j-1];
                    }

                }
                else
                    a[i][j] = '-';
            }
        }


    }
    public void printarr()
    {
        for ( int i =0 ; i<a.length;i++)
        {
            for ( int j = 0; j<a[i].length; j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}


