/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test2;

/**
 *
 * @author user
 */
public class PriceCalculator {

    MRTStrategy strategy;

    public PriceCalculator(MRTStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(MRTStrategy strategy) {
        this.strategy = strategy;
    }

    public int calculate(int km) {
        return this.calculate(km, strategy);
    }

    public int calculate(int km, MRTStrategy strategy) {
        this.strategy = strategy;
        return strategy.calculate(km);
    }
}
