/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test3;

/**
 *
 * @author user
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DrinkShop drinkShop = new DrinkShop();

        //點一杯烏龍茶
        Tea tea = (Tea) drinkShop.order("tea", Drink.SugarType.FREE, Drink.IceType.EASY);
        tea.setTeaType(Tea.TeaType.OOLONG);
        System.out.println(tea.getIce() + " " + tea.getSugar() + " " + tea.getTeaType());

        //點一杯美式
        Coffee coffee = (Coffee) drinkShop.order("coffee", Drink.SugarType.QUARTER, Drink.IceType.HOT);
        coffee.setCoffeeType(Coffee.CoffeeType.AMERICANO);
        System.out.println(coffee.getIce() + " " + coffee.getSugar() + " " + coffee.getCoffeeType());
    }
}
