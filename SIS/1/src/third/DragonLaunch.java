package third;

import java.util.Stack;
import java.util.Vector;

public class DragonLaunch {
    private Vector<Character> arr1;
   // private String arr;
    public DragonLaunch()
    {
        arr1 = new Vector<Character>();
        //arr = "";
    }
    public void kidnap( Person p)
    {
        arr1.add(p.toChar());
      //  arr += p.toString();
    }
    public boolean willDragonEatOrNot() {

        int balance = 0;    
        if(arr1.size()%2!=0) return  false;
            for ( int i =0; i < arr1.size(); i++)
               {
                 if (arr1.get(i) == 'B') {balance ++;
               //  System.out.print(arr1.get(i));
                 }

                     else if (arr1.get(i) == 'G') {balance--;
                   //  System.out.print(arr1.get(i));
                 }
                             if (balance < 0) return false;
               }
                    if (balance !=0)
                    { return false;}
        arr1 = new Vector<Character>();
        return true;

    }}

        




