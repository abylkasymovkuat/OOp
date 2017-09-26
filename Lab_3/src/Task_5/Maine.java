package Task_5;

import javafx.geometry.Pos;

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
         Position p, p1;
         while (true) {
             System.out.print("Enter the data:   ");

             String[] ss = scanner.nextLine().split(" ");
             if (check(ss[1])) continue;
             if (check(ss[2])) continue;
             p = new Position(ss[1]);
             p1 = new Position(ss[2]);
                 switch (ss[0]) {
                     case "King":
                         King king = new King();
                         System.out.println(king.isLegalMove(p, p1) ? "YES" : "NO");
                         break;
                     case "Pawn":

                         Pawn pawn = new Pawn();
                         System.out.println(pawn.isLegalMove(p, p1) ? "YES" : "NO");
                         break;
                     case "Queen":
                         Queen queen = new Queen();
                         System.out.println(queen.isLegalMove(p, p1) ? "YES" : "NO");
                         break;
                     case "Bishop":
                         Bishop bishop = new Bishop();
                         System.out.println(bishop.isLegalMove(p, p1) ? "YES" : "NO");
                         break;
                     case "Rook":
                        Rook rook = new Rook();
                         System.out.println(rook.isLegalMove(p, p1) ? "YES" : "NO");
                         break;
                     case "Knight":
                         Knight knight = new Knight();
                         System.out.println(knight.isLegalMove(p, p1) ? "YES" : "NO");

                 }
         }
     }
    }
