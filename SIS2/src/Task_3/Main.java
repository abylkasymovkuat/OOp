package Task_3;

import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        MyVector myVector = new MyVector();
        myVector.add(1);
        myVector.add(2);
        myVector.add(3);
        myVector.add(6);
        myVector.add(5);
        myVector.add(7);
        myVector.reverse();

        System.out.println(myVector);
    }
}
