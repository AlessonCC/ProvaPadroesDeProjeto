package Factory;

public class TeslaModelS implements Carro{
    @Override
    public String exibirInfo() {
        return "Marca: Tesla\nModelo: Model S\nAno: 2022\nPreço: R$ 380.000";
    }
}
