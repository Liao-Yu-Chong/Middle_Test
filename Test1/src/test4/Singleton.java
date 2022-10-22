/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test4;

/**
 *
 * @author user
 */
public class Singleton {

    private static Singleton instance;

    //私有的建構式讓別人不能創造
    private Singleton() {
    }

    //因為整個系統都要存取這個類別，很可能有多個process或thread同時存取
    //為了讓線程安全添加synchronized在多線程下確保物件唯一性
    //但這樣每次都需要進行同步，效率較低
    //public static synchronized Singleton getInstance() {
    //    if (instance == null) {
    //       instance = new Singleton();
    //    }
    //      return instance;
    //}
    
    //雙重鎖
    public static Singleton getInstance() {

        //第一層判斷為了避免不必要的同步
        if (instance == null) {

            synchronized (Singleton.class) {
                //第二層判斷為了在null的狀況下建立實例
                if (instance == null) {
                    instance = new Singleton();
                }
            }

        }

        return instance;
    }

}
