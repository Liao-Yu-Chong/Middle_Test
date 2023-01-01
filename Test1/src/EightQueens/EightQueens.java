/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EightQueens;

import java.util.*;
import static java.lang.Math.abs;

/**
 *
 * @author hunt8
 */
class Queen {

    final int x, y;

    Queen(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}

public class EightQueens {

    public static List<List<Queen>> queens(int n) {
        return placeQueens(n, n);
    }

    public static List<List<Queen>> placeQueens(int n, int k) {
        List<List<Queen>> queensList = new ArrayList<>();
        if (k == 0) {
            queensList.add(new ArrayList<>());
        } else {
            for (List<Queen> queens : placeQueens(n, k - 1)) {
                for (int column = 1; column <= n; column++) {
                    Queen queen = new Queen(k, column);
                    if (isSafe(queen, queens)) {
                        List<Queen> qs = new ArrayList<>();
                        qs.addAll(queens);
                        qs.add(queen);
                        queensList.add(qs);
                    }
                }
            }
        }
        return queensList;
    }

    public static boolean isSafe(Queen queen, List<Queen> queens) {
        for (Queen q : queens) {
            if (inCheck(queen, q)) {
                return false;
            }
        }
        return true;
    }

    public static boolean inCheck(Queen q1, Queen q2) {
        return q1.x == q2.x
                || // 同列
                q1.y == q2.y
                || // 同行
                abs(q1.x - q2.x) == abs(q1.y - q2.y); // 對角線
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        for (List<Queen> queens : queens(8)) {
            for (Queen queen : queens) {
                System.out.print(queen);
            }
            System.out.println();
            sum += 1;
        }
        System.out.println("Total " + sum + " solution");
    }

}
