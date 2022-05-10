package Factory;

public class DodgeChager implements Carro{
    @Override
    public void exibirInfo() {
        System.out.println("Modelo: Chager\nFabricante: Dodge\nAno: 2015\nPreço: R$ 200.000");
    }
}
