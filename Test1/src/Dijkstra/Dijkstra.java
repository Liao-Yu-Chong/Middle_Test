/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Dijkstra;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Dijkstra {

    public static int MaxValue = 100000;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入頂點數和邊數:");
        //頂點數
        int vertex = input.nextInt();
        //邊數
        int edge = input.nextInt();

        int[][] matrix = new int[vertex][vertex];
        //初始化鄰接矩陣
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < vertex; j++) {
                matrix[i][j] = MaxValue;
            }
        }
        for (int i = 0; i < edge; i++) {
            System.out.println("請輸入第" + (i + 1) + "條邊與其權值:");
            int source = input.nextInt();
            int target = input.nextInt();
            int weight = input.nextInt();
            matrix[source][target] = weight;
        }

        //單元最短路徑，原點
        int source = input.nextInt();
        //呼叫dijstra計算最短路徑
        dijstra(matrix, source);
    }

    public static void dijstra(int[][] matrix, int source) {
        //最短路徑長度
        int[] shortest = new int[matrix.length];
        //判段該點的最短路徑是否求出
        int[] visited = new int[matrix.length];
        //儲存輸出路徑
        String[] path = new String[matrix.length];

        //初始化輸出路徑
        for (int i = 0; i < matrix.length; i++) {
            path[i] = source + "->" + i;
        }

        //初始化原節點
        shortest[source] = 0;
        visited[source] = 1;

        for (int i = 1; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            int index = -1;

            for (int j = 0; j < matrix.length; j++) {
                //已經求出最短路徑的節點不需要再加入計算並判断加入節點后是否存在更短路徑
                if (visited[j] == 0 && matrix[source][j] < min) {
                    min = matrix[source][j];
                    index = j;
                }
            }

            //更新最短路徑
            shortest[index] = min;
            visited[index] = 1;

            //更新從index跳到其它節點的較短路徑
            for (int m = 0; m < matrix.length; m++) {
                if (visited[m] == 0 && matrix[source][index] + matrix[index][m] < matrix[source][m]) {
                    matrix[source][m] = matrix[source][index] + matrix[index][m];
                    path[m] = path[index] + "->" + m;
                }
            }

        }

        //打印最短路径
        for (int i = 0; i < matrix.length; i++) {
            if (i != source) {
                if (shortest[i] == MaxValue) {
                    System.out.println(source + "到" + i + "不可達");
                } else {
                    System.out.println(source + "到" + i + "的最短路徑：" + path[i] + "，最短距離是：" + shortest[i]);
                }
            }
        }
    }
}
