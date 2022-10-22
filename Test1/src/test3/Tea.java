/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test3;

/**
 *
 * @author user
 */
public class Tea extends Drink {

    TeaType teaType;

    public Tea(SugarType sugar, IceType ice) {
        super(sugar, ice);
    }

    public void setTeaType(TeaType teaType) {
        this.teaType = teaType;
    }

    public TeaType getTeaType() {
        return teaType;
    }

    public enum TeaType {
        LEMON, OOLONG, GINGER, HONEY
    }

}
