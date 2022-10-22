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

    //    簡單工廠模式
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        Calculator.DoType DoType = Calculator.DoType.ADD;

        myCalculator.setStrategy(DoType.MINUS);
        System.out.println(myCalculator.execute(1, 5));

        MRTStrategy myMRTStartegy = new MRTStrategy();
        PriceCalculator MRTPriceCalculator = new PriceCalculator(myMRTStartegy);
        System.out.println(MRTPriceCalculator.calculate(20));

        BusStrategy myBusStrategy = new BusStrategy();
        PriceCalculator BusPriceCalculator = new PriceCalculator(myBusStrategy);
        System.out.println(BusPriceCalculator.calculate(20));
    }

}
