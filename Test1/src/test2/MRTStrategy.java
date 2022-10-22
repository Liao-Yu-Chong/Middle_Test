/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test2;

/**
 *
 * @author user
 */
public class MRTStrategy implements IStrategy_BusAndMRT {

    @Override
    public int calculate(int km) {

        //小於十公里20元，超過每五公里多五元
        int result = 0;

        if (km <= 0) {
            return result;
        }

        if (km <= 10) {
            result = 20;
        }

        if (km > 10) {
            int count = ((km - 10) / 5) + 1;
            result = 20 + 5 * count;
        }

        return result;

    }
}
