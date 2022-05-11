package Factory;

public class DodgeDart implements Carro {
    @Override
    public String exibirInfo() {
        return "Marca: Dodge\nModelo: Dart\nAno: 2022\nPreço: R$ 250.000";
    }
}
