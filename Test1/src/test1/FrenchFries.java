/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test1;

/**
 *
 * @author user
 */
public class FrenchFries implements Product {
    
    //預設有鹽巴的薯條
    String state = "salt";
    //預設的建構子
    protected FrenchFries(){}
    //帶入狀態的建構子
    protected FrenchFries(String state){
        this.state = state;
    }
    
    @Override
    public void describe(){
        System.out.println("I'm " + state + " FrenchFries");
    }
}
