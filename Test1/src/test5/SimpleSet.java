/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test5;

/**
 *
 * @author user
 */
public class SimpleSet extends Set {

    private void addSet() {
        Salad salad = new Salad();
        MainMeal mainMeal = new MainMeal();
        Drink drink = new Drink();
        salad.decorate(order);
        mainMeal.decorate(salad);
        drink.decorate(mainMeal);
        this.order = drink;
    }

    @Override
    public void show() {
        addSet();
        super.show();
    }
}
