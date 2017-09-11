package third;

import java.util.Scanner;

public class Maine {
    public  static  void main(String args[])
    {
        DragonLaunch dragonLaunch = new DragonLaunch();
        Scanner scanner = new Scanner(System.in);
        while(true){
        String str = scanner.nextLine();
        Person [] arr = new Person[str.length()];
        for ( int i =0; i<arr.length; i++)
        {
            arr[i] = new Person(str.charAt(i));
        }
        for ( int i =0; i<arr.length; i++)
        {
            dragonLaunch.kidnap(arr[i]);
        }
        if (dragonLaunch.willDragonEatOrNot())
        {
            System.out.println("He will eat");
        }
        else System.out.println("He'll be hungry");
    }}
}
