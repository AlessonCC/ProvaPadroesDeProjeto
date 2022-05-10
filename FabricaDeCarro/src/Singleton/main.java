package Singleton;

public class main {
    public static void main(String[] args) {
        CarroSingleton carro = CarroSingleton.getInstance();
        carro.newLog();
        carro.newLog();
        System.out.println(carro.newLog());
    }
}
