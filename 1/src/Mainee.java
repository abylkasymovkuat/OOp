import java.util.Scanner;

public class  Mainee{
    public static void main (String args[])
    {
        DrawingBox drawingBox;
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            drawingBox = new DrawingBox(sc.nextLine());
            drawingBox.printarr();
        }
    }
}