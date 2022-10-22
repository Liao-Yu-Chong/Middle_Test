/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test3;

/**
 *
 * @author user
 */
public class Coffee extends Drink {

    private CoffeeType coffeeType;

    public Coffee(SugarType sugar, IceType ice) {
        super(sugar, ice);
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(CoffeeType coffeeType) {
        this.coffeeType = coffeeType;
    }

    public enum CoffeeType {
        LATTE, MOCHA, WHITE, BLUE_MOUNTAIN, AMERICANO, ESPRESSO
    }
}
