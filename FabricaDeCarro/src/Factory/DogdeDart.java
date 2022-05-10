package Factory;

public class DogdeDart implements Carro{
    @Override
    public void exibirInfo() {
        System.out.println("Modelo: Dart\nFabricante: Dodge\nAno: 2018\nPreço: R$ 350.000");
    }
}
