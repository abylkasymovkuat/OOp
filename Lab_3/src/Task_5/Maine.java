package Task_5;

import java.util.Scanner;

public class Maine
    {
        public static Boolean check(String str)
        {

            String mask = "H8";
            for (int i = 0; i < 2; i++) {
                int n = mask.charAt(i) - str.charAt(i);
                if (n > 7 || n < 0) {
                    return true;
                }} return false;
        }
        public static void main(String args[])
     {
         Scanner scanner = new Scanner(System.in);
         while (true) {
             System.out.print("Enter the data:   ");

             String[] ss = scanner.nextLine().split(" ");
             if (check(ss[1])) continue;
             if (check(ss[2])) continue;
                 switch (ss[0]) {
                     case "King":
                         King king = new King(ss[1]);
                         System.out.println(king.isLegalMove(ss[2]) ? "YES" : "NO");
                         break;
                     case "Queen":
                         Queen queen = new Queen(ss[1]);
                         System.out.println(queen.isLegalMove(ss[2]) ? "YES" : "NO");
                         break;
                     case "Bishop":
                         Bishop bishop = new Bishop(ss[1]);
                         System.out.println(bishop.isLegalMove(ss[2]) ? "YES" : "NO");
                         break;
                     case "Rook":
                        Rook rook = new Rook(ss[1]);
                         System.out.println(rook.isLegalMove(ss[2]) ? "YES" : "NO");
                         break;
                     case "Knight":
                         Knight knight = new Knight(ss[1]);
                         System.out.println(knight.isLegalMove(ss[2]) ? "YES" : "NO");

                 }
         }
     }
    }
