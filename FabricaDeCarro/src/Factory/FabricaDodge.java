package Factory;
public class FabricaDodge implements FabricaDeCarro {
    @Override
    public Carro criarCarro(String nome) {
        if(nome.equalsIgnoreCase("Charge")) {
            DodgeCharger charger = new DodgeCharger();
            System.out.println(charger.exibirInfo());
        }
        if (nome.equalsIgnoreCase("Dart")){
            DodgeDart dart = new DodgeDart();
            System.out.println(dart.exibirInfo());
        }
            return null;

    }
}
