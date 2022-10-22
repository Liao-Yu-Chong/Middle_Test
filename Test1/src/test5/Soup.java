/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test5;

/**
 *
 * @author user
 */
public class Soup extends Item {

    private void addSoup() {
        System.out.println("add a soup");
    }

    @Override
    public void show() {
        super.show();
        addSoup();
    }

}
