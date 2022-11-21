/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maze;

/**
 *
 * @author hunt8
 */
public class Maze {

    static int[][] maze = {
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 0, 1, 0, 1, 0, 0, 0, 0, 1},
        {1, 0, 1, 0, 1, 0, 1, 1, 0, 1},
        {1, 0, 1, 0, 1, 1, 1, 0, 0, 1},
        {1, 0, 1, 0, 0, 0, 0, 0, 1, 1},
        {1, 0, 0, 0, 1, 1, 1, 0, 0, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};

    static boolean findPath(int x, int y) {
        if (x == 5 && y == 8) { // 是否是迷宮出口
            maze[x][y] = 2; // 走過的路
            return true;
        } else if (maze[x][y] == 0) { // 是不是可以走的路
            maze[x][y] = 2; // 走過的路
            if (findPath(x - 1, y)
                    || // 往上
                    findPath(x + 1, y)
                    || // 往下
                    findPath(x, y - 1)
                    || // 往左
                    findPath(x, y + 1)) // 往右
            {
                return true;
            } else {
                maze[x][y] = 3; // 死路換成3
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        findPath(1, 1); // call遞迴
        System.out.println("Maze (Left to Right):");
        for (int i = 0; i <= 6; i++) {  // i = x軸
            for (int j = 0; j <= 9; j++) // j = y軸
            {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("num 1: wall");
        System.out.println("num 2: path");
    }
}
