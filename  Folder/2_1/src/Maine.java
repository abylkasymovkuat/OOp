import java.util.Scanner;

public class Maine {
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String word = sc.nextLine();
        System.out.println("Enter the id");
        String word1 = sc.nextLine();
        Student student = new Student( word, word1);
        student.changeYear();
        System.out.print ( student.getId()+ " " + student.getName()  );
    }
}
