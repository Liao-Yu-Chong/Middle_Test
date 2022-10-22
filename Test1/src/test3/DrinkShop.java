/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test3;

/**
 *
 * @author user
 */
public class DrinkShop {

    public Drink order(String drink, Drink.SugarType sugarType, Drink.IceType iceType) {

        return switch (drink) {
            case "coffee" ->
                new Coffee(sugarType, iceType);
            case "tea" ->
                new Tea(sugarType, iceType);
            default ->
                null;
        };
    }
}
