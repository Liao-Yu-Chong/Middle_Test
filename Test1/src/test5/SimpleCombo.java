/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test5;

/**
 *
 * @author user
 */
public class SimpleCombo extends BusinessLunch {

    public SimpleCombo(Restaurant restaurant) {
        super(restaurant);
    }

    private void soup() {
        System.out.println("a soup");
    }

    @Override
    public void order() {
        super.order();
        soup();
    }
}
