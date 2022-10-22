/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test4;

/**
 *
 * @author user
 */
public class SingleObject {

    //創建SingleObject的一個對象
    private static SingleObject instance = new SingleObject();

    //讓構造函數為 private，這樣該類就不會被實例化
    private SingleObject() {
    }

    //獲取唯一可用的對象
    public static SingleObject getInstance() {
        return instance;
    }
}
