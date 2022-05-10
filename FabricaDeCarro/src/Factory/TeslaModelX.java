package Factory;

public class TeslaModelX implements Carro{
    @Override
    public void exibirInfo() {
        System.out.println("Modelo: Model X\nFabricante: Tesla\nAno: 2022\nPreço: R$ 250.000");
    }
}
