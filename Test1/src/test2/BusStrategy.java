/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test2;

/**
 *
 * @author user
 */
public class BusStrategy implements IStrategy_BusAndMRT {

    @Override
    public int calculate(int km) {

        //一段票15元
        //十公里內一段票，超過十公里兩段票
        int count = 0;

        if (km <= 10) {
            count = 1;
        } else if (km > 10) {
            count = 2;
        }

        return count * 15;

    }
}
