package third;

import java.util.Stack;

public class DragonLaunch {

    private String arr;
    public DragonLaunch()
    {
        arr = "";
    }
    public void kidnap( Person p)
    {
        arr += p.toString();
    }
    public boolean ArePair(char opening,char closing)
    {
        if(opening == 'B' && closing == 'G') return true;
        return false;
    }
    public boolean willDragonEatOrNot() {
        int balance = 0;    
        if(arr.length()%2!=0) return  false;
        for ( int i =0; i < arr.length(); i++)
       {
         if (arr.charAt(i) == 'B') balance ++;
         else if (arr.charAt(i) == 'G') balance--;
         if (balance < 0) return false;
       }
        if (balance !=0)
        return false;
        return true;
    }}

        




