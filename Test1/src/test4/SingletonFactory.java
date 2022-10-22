/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test4;

/**
 *
 * @author user
 */
public class SingletonFactory {

    public static Factory getColaFactory() {
        return ColaFactory.colaFactory;
    }

    public static Factory getHumbergerFactory() {
        return HumbergerFactory.humbergerFactory;
    }

    public static Factory getHelloFactory() {
        return HelloFactory.helloFactory;
    }

    private static class ColaFactory implements Factory {

        private static ColaFactory colaFactory = new ColaFactory();

        private ColaFactory() {
        }

        @Override
        public Product getProduct() {
            return new Cola();
        }
    }

    private static class HumbergerFactory implements Factory {

        private static HumbergerFactory humbergerFactory = new HumbergerFactory();

        private HumbergerFactory() {
        }

        @Override
        public Product getProduct() {
            return new Humberger();
        }
    }

    private static class HelloFactory implements Factory {

        private static HelloFactory helloFactory = new HelloFactory();

        private HelloFactory() {
        }

        @Override
        public Product getProduct() {
            return new Hello();
        }
    }
}
