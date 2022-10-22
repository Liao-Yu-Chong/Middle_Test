/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test5;

/**
 *
 * @author user
 */
public class BusinessLunch extends Restaurant {

    private Restaurant restaurant;

    public BusinessLunch(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    private void salad() {
        System.out.println("a plate of salads");
    }

    private void mainMeal() {
        System.out.println("one main meal");
    }

    @Override
    public void order() {
        super.order();
        salad();
        mainMeal();
    }
}
