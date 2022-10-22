/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test4;

/**
 *
 * @author user
 */
public class Test4 {
     public static void main(String[] args){

        Cola cola = (Cola) SingletonFactory.getColaFactory().getProduct();
        Humberger humberger =(Humberger) SingletonFactory.getHumbergerFactory().getProduct();
        Hello hello = (Hello) SingletonFactory.getHelloFactory().getProduct();
        
        System.out.println(cola.getName());
        System.out.println(humberger.getName());
        System.out.println(hello);

    }
}
