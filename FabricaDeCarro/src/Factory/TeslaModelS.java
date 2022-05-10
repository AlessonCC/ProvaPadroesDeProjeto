package Factory;

public class TeslaModelS implements Carro{
    @Override
    public void exibirInfo() {
        System.out.println("Modelo: Model S\nFabricante: Tesla\nAno: 2022\nPreço: R$ 280.000");
    }
}
