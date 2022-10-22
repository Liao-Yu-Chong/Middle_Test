/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test4;

/**
 *
 * @author user
 */
public class StaticInnerClass {

    private StaticInnerClass() {
    }

    public static StaticInnerClass getInstance() {
        return StaticInnerClassHolder.instance;
    }

    /**
     * 靜態的內部類別
     */
    private static class StaticInnerClassHolder {

        private static StaticInnerClass instance = new StaticInnerClass();
    }

}
