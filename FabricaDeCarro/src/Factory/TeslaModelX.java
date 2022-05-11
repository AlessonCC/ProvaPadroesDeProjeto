package Factory;

public class TeslaModelX implements Carro{
    @Override
    public String exibirInfo() {
         return "Marca: Tesla\nModelo: Model X\nAno: 2021\nPreço: R$ 400.000";
    }
}
