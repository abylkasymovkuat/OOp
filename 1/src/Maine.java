import java.util.Scanner;

public class  Maine{
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