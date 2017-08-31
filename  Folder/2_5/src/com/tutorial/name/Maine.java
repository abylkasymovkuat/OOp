package com.tutorial.name;

public class Maine {

    public  static int[] cloneArr( int []a)
    {
        int [] b = new int[a.length*2];
        for (int i=0; i<a.length;i++)
        {
            b[i*2] = a[i];
            b[i*2+1] = a[i];
        }
        return b;
    }
    public static void main(String args[])
    {
       int [] a = {1,2,3};
       for ( int i=0; i<cloneArr(a).length;i++)
       {
           System.out.print( cloneArr(a)[i] + " ");
       }
    }
}
