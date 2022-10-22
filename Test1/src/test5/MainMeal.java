/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test5;

/**
 *
 * @author user
 */
public class MainMeal extends Item {

    private void addMeal() {
        System.out.println("add a main meal");
    }

    @Override
    public void show() {
        super.show();
        addMeal();
    }

}
