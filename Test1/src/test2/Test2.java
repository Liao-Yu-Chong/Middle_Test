/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test2;

/**
 *
 * @author user
 */
public class Test2 {

    private int now = 0;

    private IStrategy strategy;

    //    策略模式
    public int execute(int a, int b) {
        return strategy.caculate(a, b);
    }

    public void reset() {
        this.now = 0;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

}
