package Factory;

public class DodgeCharger implements Carro {
    @Override
    public String exibirInfo() {
        return "Marca: Dodge\nModelo: Charger\nAno: 2021\nPreço: R$ 250.000";
    }
}
