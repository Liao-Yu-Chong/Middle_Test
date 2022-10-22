/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test2;

/**
 *
 * @author user
 */
public class Calculator {

    private IStrategy strategy;

    //策略模式
    public int execute(int a, int b) {
        return strategy.caculate(a, b);
    }

    //簡單工廠模式
    public void setStrategy(DoType doType) {
        switch (doType) {
            case ADD ->
                this.strategy = new add();
            case MINUS ->
                this.strategy = new minus();
            case DIVIDE ->
                this.strategy = new divide();
            case MULTYPLY ->
                this.strategy = new multyply();
        }
    }

    public enum DoType {
        ADD, MINUS, DIVIDE, MULTYPLY
    }
}
