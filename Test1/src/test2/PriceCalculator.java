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

    IStrategy_BusAndMRT strategy;

    public PriceCalculator(IStrategy_BusAndMRT strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(IStrategy_BusAndMRT strategy) {
        this.strategy = strategy;
    }

    public int calculate(int km) {
        return this.calculate(km, strategy);
    }

    public int calculate(int km, IStrategy_BusAndMRT strategy) {
        this.strategy = strategy;
        return strategy.calculate(km);
    }
}
