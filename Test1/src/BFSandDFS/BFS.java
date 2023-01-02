/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BFSandDFS;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author user
 */
public class BFS {

    private final int numVertices;
    private final LinkedList<Integer> adjacencyList[]; // 鄰接清單

    BFS(int numVertices) {
        this.numVertices = numVertices;
        adjacencyList = new LinkedList[numVertices];
        for (int i = 0; i < numVertices; i++) {
            adjacencyList[i] = new LinkedList();
        }
    }

    void addEdge(int startVertex, int endVertex) {
        adjacencyList[startVertex].add(endVertex);
    }

    // 執行 BFS 演算法：印出順序
    void bfs(int startVertex) {
        // 已訪問節點的集合
        boolean visited[] = new boolean[numVertices];

        // 建立FIFO Queue 存放待探索節點
        LinkedList<Integer> queue = new LinkedList<>();

        // 設定起始節點為已訪問並進入Queue
        visited[startVertex] = true;
        queue.add(startVertex);

        // 執行迴圈，直到Queue為空
        while (!queue.isEmpty()) {
            // 移除Queue中第一個節點並印出
            startVertex = queue.poll();
            System.out.print(startVertex + " ");

            // 檢查該節點的鄰接節點
            Iterator<Integer> iterator = adjacencyList[startVertex].listIterator();
            while (iterator.hasNext()) {
                int nextVertex = iterator.next();
                // 如果頭一次被訪問，將其加入Queue中並設定為已訪問
                if (!visited[nextVertex]) {
                    visited[nextVertex] = true;
                    queue.add(nextVertex);
                }
            }
        }
    }

    public static void main(String args[]) {
        BFS bfs = new BFS(4);
        bfs.addEdge(0, 1);
        bfs.addEdge(0, 2);
        bfs.addEdge(1, 2);
        bfs.addEdge(2, 0);
        bfs.addEdge(2, 3);
        bfs.addEdge(3, 3);

        System.out.println("以深度優先搜尋的結果 : ");
        bfs.bfs(2);
    }
}
