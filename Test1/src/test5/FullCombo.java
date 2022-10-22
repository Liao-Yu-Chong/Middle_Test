/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test5;

/**
 *
 * @author user
 */
public class FullCombo extends SimpleCombo {

    public FullCombo(Restaurant restaurant) {
        super(restaurant);
    }

    private void sweet() {
        System.out.println("one dessert");
    }

    @Override
    public void order() {
        super.order();
        sweet();
    }
}
