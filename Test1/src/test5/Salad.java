/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test5;

/**
 *
 * @author user
 */
public class Salad extends Item {

    private void addSalad() {
        System.out.println("a plate of salads");
    }

    @Override
    public void show() {
        super.show();
        addSalad();
    }

}
