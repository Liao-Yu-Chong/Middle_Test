/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test3;

/**
 *
 * @author user
 */
public abstract class Drink {

    SugarType sugar;
    IceType ice;

    public enum SugarType {
        REGULAR, LESS, HALF, QUARTER, FREE
    }

    public enum IceType {
        REGULAR, EASY, FREE, HOT
    }

    private Drink() {
    }

    public Drink(SugarType sugar, IceType ice) {
        this.sugar = sugar;
        this.ice = ice;
    }

    public SugarType getSugar() {
        return sugar;
    }

    public void setSugar(SugarType sugar) {
        this.sugar = sugar;
    }

    public IceType getIce() {
        return ice;
    }

    public void setIce(IceType ice) {
        this.ice = ice;
    }
}
